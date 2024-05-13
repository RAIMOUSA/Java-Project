package Model;

import java.util.List;

public class Products {
    private int code;
    private String type;
    private String name;
    private double price;
    private int stockQuantity;
    private List<SaleDetail> saleDetails;

    public Products(int code, String type, String name, double price, int stockQuantity, List<SaleDetail> saleDetails) {
        this.code = code;
        this.type = type;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.saleDetails = saleDetails;
    }

public String toString(){
        return "Les informations du produit "  + code + "sont:  " + type + " " + name + " " + price + " " + stockQuantity + " " + saleDetails.toString();
    }

    public List<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(List<SaleDetail> saleDetails) {
        this.saleDetails = saleDetails;
    }
}
