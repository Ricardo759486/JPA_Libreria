package edu.unbosque.JPATutorial.servlets.pojos;

public class CustomerPOJO {

    private String email;

    private String firstName;

    private String LastName;

    private String gender;

    private Integer age;

    private Integer numRents;


    public CustomerPOJO() { }

    public CustomerPOJO(String email, String firstName, String lastName, String gender, Integer age, Integer numRents) {
        this.email = email;
        this.firstName = firstName;
        LastName = lastName;
        this.gender = gender;
        this.age = age;
        this.numRents = numRents;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumRents() {
        return numRents;
    }

    public void setNumRents(Integer numRents) {
        this.numRents = numRents;
    }
}
