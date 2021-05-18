package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.Book;
import edu.unbosque.JPATutorial.jpa.entities.Customer;
import edu.unbosque.JPATutorial.jpa.entities.Edition;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class EditionRepositoryImpl implements EditionRepository {
    private EntityManager entityManager;


    public EditionRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Edition> findById(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        return edition != null ? Optional.of(edition) : Optional.empty();
    }

    public Edition findByIdN(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        return edition;
    }

    public List<Edition> findAll() {
        return entityManager.createQuery("from Edition").getResultList();
    }


    public Optional<Edition> save(Edition edition) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(edition);
            entityManager.getTransaction().commit();
            return Optional.of(edition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        Edition edition = entityManager.find(Edition.class, id);
        if (edition != null) {
            try {

                entityManager.getTransaction().begin();

                Book book = edition.getBook();
                book.deleteEdition(edition);

                for (int i = 0; i < edition.getRents().size();i++){
                    if(id.equals(edition.getRents().get(i).getEdition().getEditionId())){
                        Customer customer = edition.getRents().get(i).getCustomer();

                        customer.getRents().forEach(rent -> {
                            entityManager.remove(rent);
                        });

                    }

                }

                edition.getRents().forEach(rent -> {
                    entityManager.remove(rent);
                });

                entityManager.remove(edition);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateId(Integer id, Edition edition) {
        Edition editionU = entityManager.find(Edition.class, id);
        if (editionU != null) {
            try {

                Book book = editionU.getBook();
                edition.setBook(book);
                entityManager.getTransaction().begin();
                entityManager.merge(edition);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
