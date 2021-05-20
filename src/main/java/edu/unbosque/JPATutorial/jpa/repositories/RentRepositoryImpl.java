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

    public List<Rent> findByDate(Integer year, Integer month, Integer day, Integer yearFinal, Integer monthFinal, Integer dayFinal, String emailA) {
        String fechaIni = "" + year + "-" + month + "-" + day;
        String fechaFin = "" + yearFinal + "-" + monthFinal + "-" + dayFinal;
        return entityManager.createQuery("SELECT all FROM Rent WHERE email = emailA and renting_date <= fechaIni  and renting_date >= fechaFin ").getResultList();
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
