package edu.unbosque.JPATutorial.services;

import edu.unbosque.JPATutorial.jpa.entities.Book;
import edu.unbosque.JPATutorial.jpa.entities.Edition;
import edu.unbosque.JPATutorial.jpa.entities.Library;
import edu.unbosque.JPATutorial.jpa.repositories.*;

import edu.unbosque.JPATutorial.servlets.pojos.LibraryManyPOJO;
import edu.unbosque.JPATutorial.servlets.pojos.LibraryPOJO;

import javax.ejb.Stateless;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class LibraryService {

    LibraryRepository libraryRepository;
    EditionRepository editionRepository;

    public List<LibraryPOJO> listLibraries() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        List<Library> libraries = libraryRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<LibraryPOJO> librariesPOJO = new ArrayList<>();
        for (Library library : libraries) {
            librariesPOJO.add(new LibraryPOJO(
                    library.getLibraryId(),
                    library.getName()
            ));
        }

        return librariesPOJO;

    }

    public List<LibraryManyPOJO> listLibrariesEdition() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        List<Library> libraries = libraryRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<LibraryManyPOJO> libraryManyPOJO = new ArrayList<>();
        for (Library library : libraries) {
            libraryManyPOJO.add(new LibraryManyPOJO(
                    library.getLibraryId(),
                    (Edition) library.getEditions()

            ));
        }

        return libraryManyPOJO;

    }

    public void saveLibrary(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);

        Library library = new Library(name);
        Library persistedLibrary = libraryRepository.save(library).get();

        entityManager.close();
        entityManagerFactory.close();

        return;

    }

    public void addLibraryEdition(Integer editionId, Integer libraryId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        libraryRepository = new LibraryRepositoryImpl(entityManager);

        Library library = entityManager.find(Library.class, libraryId);
        Edition edition = entityManager.find(Edition.class, editionId);


        edition.addLibrary(library);
        editionRepository.save(edition);
    }

    public void deleteLibraryMany(Integer libraryId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        editionRepository = new EditionRepositoryImpl(entityManager);
        editionRepository.deleteByIdMany(libraryId);

        entityManager.close();
        entityManagerFactory.close();

    }

    public void deleteLibrary(Integer libraryId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        libraryRepository = new LibraryRepositoryImpl(entityManager);
        libraryRepository.deleteById(libraryId);

        entityManager.close();
        entityManagerFactory.close();

    }


    public void updateLibrary(Integer libraryId, Library library) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        libraryRepository = new LibraryRepositoryImpl(entityManager);
        libraryRepository.updateId(libraryId, library);

        entityManager.close();
        entityManagerFactory.close();

    }

}