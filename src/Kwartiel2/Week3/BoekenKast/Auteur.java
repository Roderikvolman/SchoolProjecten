package Kwartiel2.Week3.BoekenKast;

import java.util.Date;

/**
 * Created by Roderik on 25-11-15.
 */
public class Auteur {


    private String lastname;
    private String firstname;
    private Date birthdate;

    public Auteur(String lastname, String firstname, Date birthdate) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}


