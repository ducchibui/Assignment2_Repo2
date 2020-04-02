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
import client.NonexistentEntityException_Exception;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author CBui
 */
@MultipartConfig
@WebServlet(name = "Edit", urlPatterns = {"/Edit"})
public class Edit extends HttpServlet {

    MovieService_Service service = new MovieService_Service();
    MovieService port = service.getMovieServicePort();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        Movie movie = new Movie();
        String id = request.getParameter("id");
        if (id != null) {
            movie = port.findMovie(Integer.parseInt(id));
        }
        request.setAttribute("movie", movie);
        RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
        rd.forward(request, response);
    }

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
        MovieService port = service.getMovieServicePort();

        //Find the movie
        String id = request.getParameter("id");
        Movie movie = port.findMovie(Integer.parseInt(id));
        try {
            if (bytes != null && movie != null) {
                movie.setName(fileName);
                movie.setDescription(description);
                movie.setData(bytes);
                port.editMovie(movie);
            }
        } catch (Exception_Exception ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Movie> movies = port.getAllMovies();

        request.setAttribute("movies", movies);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
