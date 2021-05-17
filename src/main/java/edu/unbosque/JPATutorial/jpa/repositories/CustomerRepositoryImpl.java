package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.Customer;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class CustomerRepositoryImpl implements CustomerRepository {

    private EntityManager entityManager;

    public CustomerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Customer> findByEmail(String email) {
        Customer customer = entityManager.find(Customer.class, email);
        return customer != null ? Optional.of(customer) : Optional.empty();
    }

    public List<Customer> findAll() {
        return entityManager.createQuery("from Customer ").getResultList();
    }

    public Optional<Customer> findByFirstname(String firstname) {
        Customer customer = entityManager.createNamedQuery("Customer.findByFirstName", Customer.class)
                .setParameter("firstname", firstname)
                .getSingleResult();
        return customer != null ? Optional.of(customer) : Optional.empty();
    }

    public Optional<Customer> save(Customer customer) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
            return Optional.of(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteByEmail(String email) {
        Customer customer = entityManager.find(Customer.class, email);
        if (customer != null) {
            try {

                entityManager.getTransaction().begin();

                customer.getRents().forEach(rent -> {
                    entityManager.remove(rent);
                });

                entityManager.remove(customer);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateEmail(String email, Customer customer) {
        Customer customerU = entityManager.find(Customer.class, email);
        if (customerU != null) {
            try {

                entityManager.getTransaction().begin();

                entityManager.merge(customer);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}