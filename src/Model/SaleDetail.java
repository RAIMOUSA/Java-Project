package Model;

public class SaleDetail {
    private int quantity;
    private Sale sale;
    private Products product;

    public SaleDetail(int quantity, Sale sale, Products product) {
        this.quantity = quantity;
        this.sale = sale;
        this.product = product;
    }

    public String toString(){
        return "Les informations de la vente sont: " + quantity + " " + sale.toString() + " " + product.toString();
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }
}
