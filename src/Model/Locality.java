package Model;

public class Locality {
    private String description;
    private int postalCode;
    private String street;
    private int houseNumber;
    private int letterBox;
    private Customer customer;

    public Locality(String description, int postalCode, String street, int houseNumber, int letterBox, Customer customer) {
        this.description = description;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.letterBox = letterBox;
        this.customer = customer;
    }

    public Locality(String description, int postalCode, String street, int houseNumber, Customer customer) {
        this.description = description;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.customer = customer;
    }

    public String toString(){
        return "Il habite a " + description;
    }

}
