package edu.unbosque.JPATutorial.servlets.pojos;

public class BookPOJO {

    private Integer bookId;

    private String title;

    private Integer isbnNumber;

    private String genre;

    private Integer authorId;

    private Integer numEditions;

    public BookPOJO() { }

    public BookPOJO(Integer bookId, String title, Integer isbnNumber,  String genre, Integer authorId, Integer numEDitions) {
        this.bookId = bookId;
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.genre = genre;
        this.authorId = authorId;
        this.numEditions = numEDitions;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(Integer isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNumEditions() {
        return numEditions;
    }

    public void setNumEditions(Integer numEditions) {
        this.numEditions = numEditions;
    }
}
