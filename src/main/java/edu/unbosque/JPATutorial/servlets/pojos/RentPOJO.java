package edu.unbosque.JPATutorial.servlets.pojos;

import java.time.LocalDate;
import java.util.Date;

public class RentPOJO {

    private Integer rentId;

    private String email;

    private Integer editionId;

    private Integer day;

    private Integer month;

    private Integer year;

    private LocalDate date;

    public RentPOJO() {
    }

    public RentPOJO(Integer rentId, String email, Integer editionId, Integer year, Integer month, Integer day) {

        this.rentId = rentId;
        this.email = email;
        this.editionId = editionId;
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public RentPOJO(Integer year, ) {
//        this.year = date.getYear();
//        this.month = date.getMonthValue();
//        this.day = date.getDayOfMonth();
//    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
