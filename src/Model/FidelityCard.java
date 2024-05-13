package Model;

public class FidelityCard {
    private int numCard;
    private int nbPoints;
    private Customer customer;

    public FidelityCard(int numCard, int nbPoints, Customer customer) {
        this.numCard = numCard;
        this.nbPoints = nbPoints;
        this.customer = customer;
    }

    public String toString(){
        return "Les informations de la carte " + numCard ;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
