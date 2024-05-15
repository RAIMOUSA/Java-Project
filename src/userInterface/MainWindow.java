package userInterface;

import Model.Sale;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    private JPanel currentPanel;
    private JButton saleResumeButton, customerSaleDetails, productSaleDetails;

    public MainWindow() {
        super("Gestionnaire de magasins de ski");
        this.currentPanel = new WelcomePanel();
        this.add(currentPanel);

        JMenu crud = new JMenu("CRUD");
        JMenuItem newClient = new JMenuItem("Ajout d'un client");
        JMenuItem clientModification = new JMenuItem("Modification d'un client");
        JMenuItem clientListening = new JMenuItem("Listing des Clients");
        JMenuItem clientElimination = new JMenuItem("Suppression d'un client");

        newClient.addActionListener(this);
        clientModification.addActionListener(this);
        clientElimination.addActionListener(this);
        clientListening.addActionListener(this);

        crud.add(newClient);
        crud.add(clientModification);
        crud.add(clientElimination);
        crud.add(clientListening);

        JMenu search = new JMenu("Recherches");
        JMenuItem customerSaleDetails = new JMenuItem("CustomerSaleDetails");
        JMenuItem diet = new JMenuItem("ProductSaleDetails");
        JMenuItem recipe = new JMenuItem("SaleResume");

        search.addActionListener(this);
        customerSaleDetails.addActionListener(this);
        diet.addActionListener(this);
        recipe.addActionListener(this);

        search.add(customerSaleDetails);
        search.add(diet);
        search.add(recipe);

        JMenu jobTask = new JMenu("Tache Metier");
        JMenuItem fidelity = new JMenuItem("Carte de fidélité");

        jobTask.addActionListener(this);
        fidelity.addActionListener(this);

        jobTask.add(fidelity);

        JMenu vegetableThread = new JMenu("Animation ski");
        JMenuItem vegetableMoving = new JMenuItem("Animation ski");

        vegetableThread.addActionListener(this);
        vegetableMoving.addActionListener(this);

        vegetableThread.add(vegetableMoving);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(crud);
        menuBar.add(search);
        menuBar.add(jobTask);
        menuBar.add(vegetableThread);

        this.setJMenuBar(menuBar);
        setVisible(true);
    }

    private JPanel gePanel(String name) {
        // TODO : do this a better way. Maybe with generics ? or even state design pattern ?
        switch (name) {
            case "Ajout d'un client" -> {
                 return new AddClientPanel();
            }
            case "Modification d'un client" -> {
                 return new ModifyClientPanel();
            }
            case "Listing des Clients" -> {
                 return new ListingClientPanel();
            }
            case "Suppression d'un client" -> {
                return new DeleteClientPanel();
            }
            case "CustomerSaleDetails" -> {
                return new CustomerSaleDetailsPanel();
            }
            case "ProductSaleDetails" -> {
                return new ProductSaleDetailsPanel();
            }
            case "SaleResume" -> {
                return new SaleResumePanel();
            }
            case "Carte de fidélité" -> {
                return new FidelityCardPanel();
            }
            case "Animation ski" -> {
                return new SkiAnimationPanel();
            }
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String action = event.getActionCommand();
        if (currentPanel != null) {
            this.remove(currentPanel);
        }
        currentPanel = this.gePanel(action);
        this.add(currentPanel);
        this.revalidate();
        this.repaint();
    }
}
