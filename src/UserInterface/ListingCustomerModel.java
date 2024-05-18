package UserInterface;

import Controller.ContactController;
import Controller.CustomerController;
import Controller.LocalityController;
import Model.Contact;
import Model.Customer;
import Model.Locality;
import Exception.*;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListingCustomerModel extends AbstractTableModel {
    private String[] columnNames;
    private ArrayList<Customer> customers;
    private CustomerController customerController;
    private ContactController contactController;
    private LocalityController localityController;

    public ListingCustomerModel() {
        this.columnNames = new String[] {
                "ID",
                "Prénom",
                "Nom",
                "Date de naissance",
                "Professionnel",
                "Email",
                "Téléphone",
                "Description",
                "Code postal",
                "Rue",
                "Numéro de maison",
                "Boîte aux lettres"
        };
        this.customerController = new CustomerController();
        this.contactController = new ContactController();
        this.localityController = new LocalityController();

        // Charger les données des clients depuis le contrôleur des clients
        try {
            this.customers = customerController.readAllCustomers();
        } catch (CustomerException exception) {
            // Gérer l'exception, par exemple afficher un message d'erreur
            System.err.println("Erreur lors de la lecture des clients: " + exception.getMessage());
        }
    }

    private void loadCustomers() {
        try {
            customers = customerController.readAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
            customers = new ArrayList<>();
        }
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        if (this.customers == null) {
            return 0;
        } else {
            return this.customers.size();
        }
    }


    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return switch (column) {
            case 0, 8, 10 -> Integer.class;
            case 4 -> Boolean.class;
            default -> String.class;
        };
    }

    @Override
    public Object getValueAt(int row, int col) {
        try {
            Customer customer = customers.get(row);
            Contact contact = this.contactController.getContactByMail(customer.getMail());
            Locality locality = this.localityController.getLocalityByCode(customer.getLocalityID());

            return switch (col) {
                case 0 -> customer.getUserID();
                case 1 -> customer.getFirstName();
                case 2 -> customer.getLastName();
                case 3 -> customer.getDateOfBirth().toString();
                case 4 -> customer.isProfessional();
                case 5 -> contact.getMail();
                case 6 -> contact.getPhoneNumber();
                case 7 -> locality.getLocalityName();
                case 8 -> locality.getPostalCode();
                case 9 -> locality.getStreet();
                case 10 -> locality.getHouseNumber();
                case 11 -> locality.getLetterBox();
                default -> null;
            };
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void removeCustomerAt(int rowIndex) {
        customers.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
