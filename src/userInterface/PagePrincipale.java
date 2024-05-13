package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagePrincipale extends JFrame {

    private JPanel contentPanel;
    private JPanel menuPanel;
    private JButton saleResumeButton, customerSaleDetails, productSaleDetails;

    public PagePrincipale() {
        super("Menu Example");

        // Créer le contenu central de la fenêtre
        contentPanel = new JPanel(new BorderLayout());
        add(contentPanel);

        // Créer une barre de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Créer le bouton "Menu Principal"
        JMenuItem mainMenuMenuItem = new JMenuItem("Menu Principal");
        mainMenuMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherMenuPrincipal();
            }
        });
        menuBar.add(mainMenuMenuItem);

        // Créer le bouton "Quitter"
        JMenuItem exitMenuItem = new JMenuItem("Quitter");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuBar.add(exitMenuItem);

        // Créer le panel pour le menu
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(5, 3)); // 5 lignes, 3 colonnes
        contentPanel.add(menuPanel, BorderLayout.CENTER);

        // Créer les options de menu
        saleResumeButton = new JButton("SaleResume");
        saleResumeButton.addActionListener(e -> {
            afficherSaleResume();
        });
        customerSaleDetails = new JButton("CustomerSaleDetails");
        customerSaleDetails.addActionListener(e -> {
            afficherCustomerSaleDetails();
        });

        productSaleDetails = new JButton("ProductSaleDetails");
        productSaleDetails.addActionListener(e -> {
            afficherProductSaleDetails();
        });

        // Ajouter les options de menu au panel
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (4,0)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (4,1)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (4,2)

        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (0,0)
        menuPanel.add(saleResumeButton); // Bouton à la position (0,1)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (0,2)

        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (1,0)
        menuPanel.add(customerSaleDetails); // Bouton à la position (1,1)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (1,2)

        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (2,0)
        menuPanel.add(productSaleDetails); // Bouton à la position (2,1)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (2,2)

        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (3,0)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (3,1)
        menuPanel.add(new JPanel()); // Ajouter un composant vide à la position (3,2)

        // Centrer les options de menu
        saleResumeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        customerSaleDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
        productSaleDetails.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Configuration de la taille et de la fermeture de la fenêtre
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void afficherMenuPrincipal() {
        contentPanel.removeAll();
        contentPanel.add(menuPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    private void afficherSaleResume() {
        contentPanel.removeAll();
        contentPanel.add(new SaleResume(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    private void afficherCustomerSaleDetails() {
        contentPanel.removeAll();
        contentPanel.add(new CustomerSaleDetails(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    private void afficherProductSaleDetails() {
        contentPanel.removeAll();
        contentPanel.add(new ProductSaleDetails(), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
