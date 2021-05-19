package edu.unbosque.JPATutorial.servlets.pojos;

import edu.unbosque.JPATutorial.jpa.entities.Edition;

public class LibraryManyPOJO {

    private Integer libraryId;

    private Edition editionId;

    public LibraryManyPOJO() { }

    public LibraryManyPOJO(Integer libraryId, Edition editionId) {
        this.libraryId = libraryId;
        this.editionId = editionId;
    }

    public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }

    public Edition getEditionId() {
        return editionId;
    }

    public void setEditionId(Edition editionId) {
        this.editionId = editionId;
    }
}
