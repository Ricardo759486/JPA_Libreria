package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Rent;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RentRepository {

    Optional<Rent> findById(Integer id);

    List<Rent> findByDate(Integer year, Integer month, Integer day, Integer yearFinal, Integer monthFinal, Integer dayFinal, String email);

    List<Rent> findAll();

    Optional<Rent> save(Rent rent);

    void deleteById(Integer id);

}