package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.*;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class RentRepositoryImpl implements RentRepository {

    private EntityManager entityManager;

    public RentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Rent> findById(Integer id) {
        Rent rent = entityManager.find(Rent.class, id);
        return rent != null ? Optional.of(rent) : Optional.empty();
    }

    public Optional<Rent> findByDate(String rentingDate) {
        Rent rent = entityManager.createQuery("SELECT b FROM Rent b WHERE b.rentingDate = :rentingDate", Rent.class)
                .setParameter("rentingDate", rentingDate)
                .getSingleResult();
        return rent != null ? Optional.of(rent) : Optional.empty();
    }

    public List<Rent> findAll() {
        return entityManager.createQuery("from Rent").getResultList();
    }

    public Optional<Rent> save(Rent rent) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(rent);
            entityManager.getTransaction().commit();
            return Optional.of(rent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        Rent rent = entityManager.find(Rent.class, id);
        if (rent != null) {
            try {
                entityManager.getTransaction().begin();
                Customer customer = rent.getCustomer();
                customer.deleteRent(rent);

                Edition edition = rent.getEdition();
                edition.deleteRent(rent);

                entityManager.remove(rent);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
