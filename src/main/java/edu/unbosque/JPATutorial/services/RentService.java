package edu.unbosque.JPATutorial.services;

import edu.unbosque.JPATutorial.jpa.entities.*;
import edu.unbosque.JPATutorial.jpa.repositories.*;
import edu.unbosque.JPATutorial.servlets.pojos.BookPOJO;
import edu.unbosque.JPATutorial.servlets.pojos.RentPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Stateless
public class RentService {

    CustomerRepository customerRepository;
    EditionRepository editionRepository;
    RentRepository rentRepository;

    public List<RentPOJO> listRents() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        List<Rent> rents = rentRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<RentPOJO> rentsPOJO = new ArrayList<>();
        for (Rent rent : rents) {
            rentsPOJO.add(new RentPOJO(
                    rent.getRentId(),
                    rent.getCustomer().getEmail(),
                    rent.getEdition().getEditionId(),
                    rent.getRentingDate().getYear(),
                    rent.getRentingDate().getMonthValue(),
                    rent.getRentingDate().getDayOfMonth()
            ));
        }

        return rentsPOJO;

    }


    public void saveRent(LocalDate date, String customerEmail, Integer editionId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        customerRepository = new CustomerRepositoryImpl(entityManager);
        editionRepository = new EditionRepositoryImpl(entityManager);

        rentRepository = new RentRepositoryImpl(entityManager);

        Optional<Customer> customer = customerRepository.findByEmail(customerEmail);
        Edition edition = editionRepository.findByIdN(editionId);
        customer.ifPresent(a -> {
            a.addRent(new Rent(date), edition);
            customerRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();

        return;

    }

    public List<Rent> saveDateList(Integer year, Integer month, Integer day, Integer yearFinal, Integer monthFinal, Integer dayFinal, String email) {
        List<Rent> rents = new ArrayList<>();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        rents = rentRepository.findByDate(year, month, day, yearFinal, monthFinal, dayFinal, email);

        entityManager.close();
        entityManagerFactory.close();
        return rents;
    }

    public void deleteRent(Integer rentId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        rentRepository = new RentRepositoryImpl(entityManager);
        rentRepository.deleteById(rentId);

        entityManager.close();
        entityManagerFactory.close();

    }
}
