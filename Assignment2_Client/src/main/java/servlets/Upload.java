/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import client.Exception_Exception;
import client.Movie;
import client.MovieService;
import client.MovieService_Service;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.ws.soap.MTOMFeature;

/**
 *
 * @author CBui
 */
@MultipartConfig
@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class Upload extends HttpServlet {

    boolean enabled = true;
    int threshold = 10;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part filePart = request.getPart("file");
        InputStream inputStream = filePart.getInputStream();

        //get the filename and convert inputstream to byte[]
        String str = filePart.getSubmittedFileName();
        String fileName = str.substring(str.lastIndexOf('\\') + 1, str.length());
        String description = request.getParameter("description");
        byte[] bytes = ByteStreams.toByteArray(inputStream);

        //create the web service object then upload movie to database
        MovieService_Service service = new MovieService_Service();
        MovieService port = service.getMovieServicePort(new MTOMFeature(enabled,threshold));
        

        try {
            if (bytes != null) {
                //Using data handler to add the file into soap attachment
                DataHandler dataHandler = new DataHandler(bytes,"application/octet-stream");
                port.uploadMovie(fileName, dataHandler, description);
            }
        } catch (Exception_Exception ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Movie> movies = port.getAllMovies();

        request.setAttribute("movies", movies);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
