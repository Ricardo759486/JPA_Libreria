package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.Book;
import edu.unbosque.JPATutorial.jpa.entities.Library;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class LibraryRepositoryImpl implements LibraryRepository {

    private EntityManager entityManager;

    public LibraryRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Library> findById(Integer id) {
        Library library = entityManager.find(Library.class, id);
        return library != null ? Optional.of(library) : Optional.empty();
    }

    public Optional<Library> findByName(String name) {
        Library library = entityManager.createQuery("SELECT b FROM Library b WHERE b.name = :name", Library.class)
                .setParameter("name", name)
                .getSingleResult();
        return library != null ? Optional.of(library) : Optional.empty();
    }

    @Override
    public List<Library> findAll() {
        return entityManager.createQuery("from Library").getResultList();
    }

    @Override
    public Optional<Library> save(Library library) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(library);
            entityManager.getTransaction().commit();
            return Optional.of(library);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        Library library = entityManager.find(Library.class, id);
        if (library != null) {
            try {
                entityManager.getTransaction().begin();

                entityManager.remove(library);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateId(Integer id, Library library) {
        Library libraryU = entityManager.find(Library.class, id);
        if (libraryU != null) {
            try {

                entityManager.getTransaction().begin();
                libraryU.setName(library.getName());
                entityManager.merge(libraryU);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
