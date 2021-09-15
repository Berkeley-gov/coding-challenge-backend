package com.notification.form.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUPERVISOR")
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jurisdiction")
    private String jurisdiction;

    @Column(name ="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    // Supervisor no args constructor.
    public Supervisor() {}

    // User constructor that takes in all instance variables as parameters.
    public Supervisor(Long id, String jurisdiction, String firstName, String lastName) {
        this.id = id;
        this.jurisdiction = jurisdiction;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // User constructor that does not take an "id" instance variable but does take all other variables as parameters.
    public Supervisor(String jurisdiction, String firstName, String lastName) {
        this.jurisdiction = jurisdiction;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setter methods for all Supervisor's instance variables.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Overridden Object superclass methods to be used in the Supervisor class.
    @Override
    public String toString() {
        return "Supervisor{" +
                "id=" + id +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supervisor that = (Supervisor) o;
        return Objects.equals(id, that.id) && Objects.equals(jurisdiction, that.jurisdiction) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jurisdiction, firstName, lastName);
    }
}
