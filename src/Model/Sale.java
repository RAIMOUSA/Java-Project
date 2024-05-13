package Model;

import java.util.Date;
import java.util.List;

public class Sale {
    private int code;
    private Date date;
    private Customer customer;
    private List<SaleDetail> saleDetails;

    public Sale(int code, Date date, Customer customer, List<SaleDetail> saleDetails) {
        this.code = code;
        this.date = date;
        this.customer = customer;
        this.saleDetails = saleDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(List<SaleDetail> saleDetails) {
        this.saleDetails = saleDetails;
    }
}
