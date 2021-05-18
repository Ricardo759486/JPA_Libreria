package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.Book;
import edu.unbosque.JPATutorial.jpa.entities.Library;

import java.util.List;
import java.util.Optional;

public interface LibraryRepository {

    Optional<Library> findById(Integer id);

    Optional<Library> findByName(String name);

    List<Library> findAll();

    Optional<Library> save(Library library);

    void deleteById(Integer id);

    void updateId(Integer id, Library library);

}
