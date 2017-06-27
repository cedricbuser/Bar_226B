package Presentation; /**
 * Created by wizlamar on 26.04.17.
 */

import Business.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Java_GUI extends JFrame implements ActionListener {

    //Mein Guthaben
    double Guthaben = 300.00;
    int anfangspegel = 0;
    int aktuellpegel = 0;

    //DrinkLogic wird instanziiert
    private DrinkLogic logic = new DrinkLogic();
    //Startscreen wird instanziiert
    private Person person;

    //Alkohol Objekte
    Getraenk wein = new Wein(8.0, 5);
    Getraenk bier = new Bier(5.0, 2);
    Getraenk gin = new Gin(11.0, 10);
    Getraenk redbull = new RedBull(3.0, 3);


    //JPanels
    JPanel hauptPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel datenPanel = new JPanel();

    //JButtons
    JButton bierButton = new JButton("Bier");
    JButton weinButton = new JButton("Wein");
    JButton ginButton = new JButton("Gin");
    JButton energyButton = new JButton("Red Bull");

    //JLabels
    JLabel guthabenlbl = new JLabel("Ihr Guthaben: " + Guthaben);
    JLabel promilllbl = new JLabel("Ihr Alkoholwert: " + anfangspegel);
    JLabel bierpreis = new JLabel("Preis: 5.00");
    JLabel weinpreis = new JLabel("Preis: 8.00");
    JLabel ginpreis = new JLabel("Preis: 11.00");
    JLabel energypreis = new JLabel("Preis: 3.00");
    JLabel info;

   // BufferedImage barBackgroundIMG;

    public Java_GUI(Person person) {

        this.person = person;
        info = new JLabel("Wenn sie den Alkoholwert " + person.berechneIndividuellpegel() +  " überschreiten dann ist Game Over!");

        setLayout(new BorderLayout());
        JFrame meinFrame = new JFrame("Dr Völlscht isch dr töllscht");
        hauptPanel.setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(4,1));
        datenPanel.setLayout(new GridLayout(3,1));

        //Grösse anpassen
        bierButton.setPreferredSize(new Dimension(50, 20));
        weinButton.setPreferredSize(new Dimension(50, 20));
        ginButton.setPreferredSize(new Dimension(50, 20));

        //Elemente dem Panel Adden
        buttonPanel.add(bierButton);
        buttonPanel.add(bierpreis);
        buttonPanel.add(weinButton);
        buttonPanel.add(weinpreis);
        buttonPanel.add(ginButton);
        buttonPanel.add(ginpreis);
        buttonPanel.add(energyButton);
        buttonPanel.add(energypreis);

        datenPanel.add(guthabenlbl);
        datenPanel.add(promilllbl);
        datenPanel.add(info);

        //Label design
        info.setFont(info.getFont().deriveFont(Font.BOLD, 14f));

        hauptPanel.add(buttonPanel);

        //Positionieren von Panel
        add(hauptPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.CENTER);
        add(datenPanel, BorderLayout.SOUTH);

        //Actionlistener auf buttons zuweisen

        bierButton.addActionListener(this);
        weinButton.addActionListener(this);
        ginButton.addActionListener(this);
        energyButton.addActionListener(this);



        //Grösse des Fensters
        setSize(1200, 670);
        //Titel des Fensters
        setTitle("Dr Völlscht isch dr töllscht");
        //Schliesst Programm
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Anzeigen des Fensters
        setVisible(true);

    }

    

    public void actionPerformed(ActionEvent e) {
    	DrinkLogic drink =new DrinkLogic();

        if (e.getSource() == bierButton) {
            logic.addGetraenk(bier);
            Guthaben = Guthaben - bier.getPrice();
            guthabenlbl.setText("Ihr Guthaben: " + Guthaben);
            aktuellpegel = aktuellpegel + bier.getAlcoholPegel();
            promilllbl.setText("Ihr Alkoholwert: " + aktuellpegel);
        }

        if (e.getSource() == weinButton) {
            logic.addGetraenk(wein);
            Guthaben = Guthaben - wein.getPrice();
            guthabenlbl.setText("Ihr Guthaben: " + Guthaben);
            aktuellpegel = aktuellpegel + wein.getAlcoholPegel();
            promilllbl.setText("Ihr Alkoholwert: " + aktuellpegel);
        }

        if (e.getSource() ==  ginButton) {
            logic.addGetraenk(gin);
            Guthaben = Guthaben - gin.getPrice();
            guthabenlbl.setText("Ihr Guthaben: " + Guthaben);
            aktuellpegel = aktuellpegel + gin.getAlcoholPegel();
            promilllbl.setText("Ihr Alkoholwert: " + aktuellpegel);
        }

        if (e.getSource() == energyButton) {
            logic.addGetraenk(redbull);
            Guthaben = Guthaben - redbull.getPrice();
            guthabenlbl.setText("Ihr Guthaben: " + Guthaben);
            aktuellpegel = aktuellpegel - redbull.getAlcoholPegel();
            promilllbl.setText("Ihr Alkoholwert: " + aktuellpegel);
        }

        if (aktuellpegel >= person.individuellpegel){
            JOptionPane.showMessageDialog(null, "Game Over!!!");
            System.exit(0);

        }

        System.out.print(logic.getList());

    }

}