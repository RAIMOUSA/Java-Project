package Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Customer {
    private int userID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private boolean isProfessional;
    private char sexe;
    private Contact contact;
    private Locality locality;
    private FidelityCard fidelityCard;
    private List<Sale> sales;

    public Customer(int userID, String firstName, String lastName, LocalDate birthDate, boolean isProfessional, char sexe, Contact contact, Locality locality, FidelityCard fidelityCard, List<Sale> sales) { // And this line
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.isProfessional = isProfessional;
        this.sexe = sexe;
        this.contact = contact;
        this.locality = locality;
        this.fidelityCard = fidelityCard;
        this.sales = sales;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setProfessional(boolean professional) {
        isProfessional = professional;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public void setFidelityCard(FidelityCard fidelityCard) {
        this.fidelityCard = fidelityCard;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public int getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isProfessional() {
        return isProfessional;
    }

    public char getSexe() {
        return sexe;
    }

    public Contact getContact() {
        return contact;
    }

    public Locality getLocality() {
        return locality;
    }

    public FidelityCard getFidelityCard() {
        return fidelityCard;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public String toString() {
        return "Les informations du client sont: \nID: " + userID + "\nPrénom: " + firstName + "\nNom: " + lastName + "\nDate de naissance: " + birthDate + "\nProfessionnel: " + isProfessional + "\nSexe: " + sexe + "\n" + contact.toString() + "\n" + locality.toString() + "\n" + fidelityCard.toString();
    }
}