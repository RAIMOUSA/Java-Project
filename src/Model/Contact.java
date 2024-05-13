package Model;

public class Contact {
    private String mail;
    private int phoneNumber;
    private Customer customer;

    public Contact(String mail,Customer customer, int phoneNumber) {
        this.mail = mail;
        this.customer = customer;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String mail,Customer customer) {
        this.mail = mail;
        this.customer = customer;
    }

    public String toString() {
        return "Les informations du contact sont: \nMail: " + mail;
    }

}
