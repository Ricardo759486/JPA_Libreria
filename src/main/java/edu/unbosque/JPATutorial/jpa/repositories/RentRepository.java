package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Rent;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RentRepository {

    Optional<Rent> findById(Integer id);

    Optional<Rent> findByDate(String date);

    List<Rent> findAll();

    Optional<Rent> save(Rent rent);

    void deleteById(Integer id);

}