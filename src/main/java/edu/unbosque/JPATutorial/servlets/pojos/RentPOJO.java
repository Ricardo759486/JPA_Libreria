package edu.unbosque.JPATutorial.servlets.pojos;

import java.util.Date;

public class RentPOJO {

    private Integer rentId;

    private String email;

    private Integer editionId;

    private String rentingDate;

    public RentPOJO() { }

    public RentPOJO(Integer rentId, String email, Integer editionId, String rentingDate) {
        this.rentId = rentId;
        this.email = email;
        this.editionId = editionId;
        this.rentingDate = rentingDate;
    }

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

    public String getRentingDate() {
        return rentingDate;
    }

    public void setRentingDate(String rentingDate) {
        this.rentingDate = rentingDate;
    }
}
