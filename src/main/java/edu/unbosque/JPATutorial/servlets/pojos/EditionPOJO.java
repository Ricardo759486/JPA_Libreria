package edu.unbosque.JPATutorial.servlets.pojos;

public class EditionPOJO {
    private Integer editionId;

    private String description;

    private Integer releaseyear;

    private Integer authorId;

    private Integer bookId;

    public EditionPOJO() { }

    public EditionPOJO(Integer editionId, String description, Integer releaseyear, Integer authorId, Integer bookId) {
        this.editionId = editionId;
        this.description = description;
        this.releaseyear = releaseyear;
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Integer releaseYear) {
        this.releaseyear = releaseYear;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
