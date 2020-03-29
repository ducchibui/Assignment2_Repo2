/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2_rest_api.services;

import com.mycompany.assignment2_rest_api.models.Movie;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import org.w3c.dom.NodeList;

/**
 *
 * @author CBui
 */
@Path("movies")
@Produces("text/json")
public class MovieService {

    List<Movie> movies = new ArrayList<>();
    String url = "http://localhost:8080/Assignment2_SOAP_API/MovieService";

    @GET       
    public List<Movie> getMovies() throws SOAPException, MalformedURLException {
        return getAllMovies();
    }

    //build the SOAP message to send to Webservice and get the list of movies
    private List<Movie> getAllMovies() throws SOAPException, MalformedURLException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        //code
        SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();

        //Add and remove namespace to mathc the <envelope> element int the SOAP request
        soapEnvelope.removeNamespaceDeclaration("SOAP-ENV");
        soapEnvelope.addNamespaceDeclaration("S", "http://schemas.xmlsoap.org/soap/envelope/");
        soapEnvelope.addNamespaceDeclaration("SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/");
        soapEnvelope.setPrefix("S");

        SOAPHeader soapHeader = soapEnvelope.getHeader();
        soapHeader.detachNode();

        SOAPBody soapBody = soapEnvelope.getBody();

        soapBody.setPrefix("S");
        soapBody.addNamespaceDeclaration("ns2", "http://services/");

        // add parent element
        QName parentElement = new QName("", "getAllMovies", "ns2");

        SOAPBodyElement bodyElement = soapBody.addBodyElement(parentElement);
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        URL endpoint = new URL(url);
        SOAPMessage response = soapConnection.call(soapMessage, endpoint);

        //get body respone
        SOAPBody responseBody = response.getSOAPBody();

        NodeList list = responseBody.getElementsByTagName("return");
        System.out.println(list.getLength());

        //print out the value of receiving the SOAP response in return.
        for (int i = 0; i < list.getLength(); i++) {
            Movie movie = new Movie();
            movie.setData((list.item(i).getChildNodes().item(0).getTextContent()).getBytes());
            movie.setDescription(list.item(i).getChildNodes().item(1).getTextContent());
            movie.setId(Integer.parseInt(list.item(i).getChildNodes().item(2).getTextContent()));
            movie.setName(list.item(i).getChildNodes().item(3).getTextContent());

            movies.add(movie);
        }
        return movies;
    }
}
