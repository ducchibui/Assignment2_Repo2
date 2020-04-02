
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllMovies_QNAME = new QName("http://services/", "getAllMovies");
    private final static QName _UploadMovieResponse_QNAME = new QName("http://services/", "uploadMovieResponse");
    private final static QName _FindMovie_QNAME = new QName("http://services/", "findMovie");
    private final static QName _UploadMovie_QNAME = new QName("http://services/", "uploadMovie");
    private final static QName _NonexistentEntityException_QNAME = new QName("http://services/", "NonexistentEntityException");
    private final static QName _Exception_QNAME = new QName("http://services/", "Exception");
    private final static QName _DownloadMovie_QNAME = new QName("http://services/", "downloadMovie");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://services/", "deleteMovieResponse");
    private final static QName _FindMovieResponse_QNAME = new QName("http://services/", "findMovieResponse");
    private final static QName _EditMovieResponse_QNAME = new QName("http://services/", "editMovieResponse");
    private final static QName _DownloadMovieResponse_QNAME = new QName("http://services/", "downloadMovieResponse");
    private final static QName _EditMovie_QNAME = new QName("http://services/", "editMovie");
    private final static QName _DeleteMovie_QNAME = new QName("http://services/", "deleteMovie");
    private final static QName _Movie_QNAME = new QName("http://services/", "movie");
    private final static QName _GetAllMoviesResponse_QNAME = new QName("http://services/", "getAllMoviesResponse");
    private final static QName _DownloadMovieResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditMovieResponse }
     * 
     */
    public EditMovieResponse createEditMovieResponse() {
        return new EditMovieResponse();
    }

    /**
     * Create an instance of {@link DownloadMovieResponse }
     * 
     */
    public DownloadMovieResponse createDownloadMovieResponse() {
        return new DownloadMovieResponse();
    }

    /**
     * Create an instance of {@link EditMovie }
     * 
     */
    public EditMovie createEditMovie() {
        return new EditMovie();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link NonexistentEntityException }
     * 
     */
    public NonexistentEntityException createNonexistentEntityException() {
        return new NonexistentEntityException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DownloadMovie }
     * 
     */
    public DownloadMovie createDownloadMovie() {
        return new DownloadMovie();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link FindMovieResponse }
     * 
     */
    public FindMovieResponse createFindMovieResponse() {
        return new FindMovieResponse();
    }

    /**
     * Create an instance of {@link FindMovie }
     * 
     */
    public FindMovie createFindMovie() {
        return new FindMovie();
    }

    /**
     * Create an instance of {@link UploadMovie }
     * 
     */
    public UploadMovie createUploadMovie() {
        return new UploadMovie();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link UploadMovieResponse }
     * 
     */
    public UploadMovieResponse createUploadMovieResponse() {
        return new UploadMovieResponse();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<GetAllMovies>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "uploadMovieResponse")
    public JAXBElement<UploadMovieResponse> createUploadMovieResponse(UploadMovieResponse value) {
        return new JAXBElement<UploadMovieResponse>(_UploadMovieResponse_QNAME, UploadMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findMovie")
    public JAXBElement<FindMovie> createFindMovie(FindMovie value) {
        return new JAXBElement<FindMovie>(_FindMovie_QNAME, FindMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "uploadMovie")
    public JAXBElement<UploadMovie> createUploadMovie(UploadMovie value) {
        return new JAXBElement<UploadMovie>(_UploadMovie_QNAME, UploadMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentEntityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NonexistentEntityException")
    public JAXBElement<NonexistentEntityException> createNonexistentEntityException(NonexistentEntityException value) {
        return new JAXBElement<NonexistentEntityException>(_NonexistentEntityException_QNAME, NonexistentEntityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "downloadMovie")
    public JAXBElement<DownloadMovie> createDownloadMovie(DownloadMovie value) {
        return new JAXBElement<DownloadMovie>(_DownloadMovie_QNAME, DownloadMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findMovieResponse")
    public JAXBElement<FindMovieResponse> createFindMovieResponse(FindMovieResponse value) {
        return new JAXBElement<FindMovieResponse>(_FindMovieResponse_QNAME, FindMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "editMovieResponse")
    public JAXBElement<EditMovieResponse> createEditMovieResponse(EditMovieResponse value) {
        return new JAXBElement<EditMovieResponse>(_EditMovieResponse_QNAME, EditMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "downloadMovieResponse")
    public JAXBElement<DownloadMovieResponse> createDownloadMovieResponse(DownloadMovieResponse value) {
        return new JAXBElement<DownloadMovieResponse>(_DownloadMovieResponse_QNAME, DownloadMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "editMovie")
    public JAXBElement<EditMovie> createEditMovie(EditMovie value) {
        return new JAXBElement<EditMovie>(_EditMovie_QNAME, EditMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<GetAllMoviesResponse>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DownloadMovieResponse.class)
    public JAXBElement<byte[]> createDownloadMovieResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DownloadMovieResponseReturn_QNAME, byte[].class, DownloadMovieResponse.class, ((byte[]) value));
    }

}
