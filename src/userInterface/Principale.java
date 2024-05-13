package userInterface;
import javax.swing.*;
public class Principale {
    public static void main(String[] args) {
        PagePrincipale pagePrincipale = new PagePrincipale();
        pagePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pagePrincipale.setSize(800, 600);
        pagePrincipale.setVisible(true);
    }
}
