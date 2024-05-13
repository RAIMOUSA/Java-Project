package Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Date;
import java.util.ArrayList; // Importez la classe ArrayList
import java.util.List;

import Model.*;

public class Principale {
    public static void main(String[] args) {
        Customer customer = new Customer(1313, "Ju", "Da", LocalDate.of(1999,2,3), true, 'F', null, null, null, null);
        Contact contact = new Contact("ju@gmail.com", customer); // Mettez à jour le constructeur de Contact
        Locality locality = new Locality("Jamoigne", 6810, "Rue de la gare", 12, 1, customer);
        FidelityCard fidelityCard = new FidelityCard(123, 100, customer);
        Sale sale = new Sale(1, new Date(121, 3, 12), customer, null); // Mettez à jour la création de Date
        List<SaleDetail> saleDetails = new ArrayList<>();
        List<Sale> sales = new ArrayList<>();
        sales.add(sale);
        SaleDetail saleDetail1 = new SaleDetail(1, sale, null);
        saleDetails.add(saleDetail1);
        Products products = new Products(1, "Pomme", "D'or", 10, 3, saleDetails);

        sale.setSaleDetails(saleDetails);
        saleDetail1.setProduct(products);
        customer.setSales(sales); // Ajoutez une liste de vente au client
        customer.setFidelityCard(fidelityCard);
        customer.setContact(contact); // Mettez à jour les informations de contact
        customer.setLocality(locality);

        System.out.println(customer);
    }
}

