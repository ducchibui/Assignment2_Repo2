/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import client.Movie;
import client.MovieService;
import client.MovieService_Service;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CBui
 */
@WebServlet(name = "Download", urlPatterns = {"/Download"})
public class Download extends HttpServlet {

    MovieService_Service service = new MovieService_Service();
    MovieService port = service.getMovieServicePort();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id != null) {
            Movie movie = port.findMovie(Integer.parseInt(id));
            byte[] data = port.downloadMovie(movie.getName());

            //Path where to save the download file : C:\Users\cbui\GlassFish_Server\glassfish\domains\domain1\config
            String path = System.getProperty("user.dir");
            System.out.println(path);
            File downloadFile = new File(path, movie.getName());
            FileOutputStream fos = new FileOutputStream(downloadFile);
            fos.write(data);
            fos.close();
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
