package hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by bjorniagard on 28-09-16.
 */
public class Rekenmachine extends Applet {

    TextField input1;
    TextField input2;
    Button keerKnop;
    Button deelKnop;
    Button plusKnop;
    Button minKnop;

    double getal1;
    double getal2;


    @Override
    public void init() {
        super.init();
        setSize(500, 400);
        input1 = new TextField("", 20);
        add(input1);

        input2 = new TextField("", 20);
        add(input2);

        keerKnop = new Button("X");
        KeerKnopLuisteraar keerKnopLuisteraar = new KeerKnopLuisteraar();
        keerKnop.addActionListener(keerKnopLuisteraar);
        add(keerKnop);

        deelKnop = new Button("/");
        DeelKnopLuisteraar deelKnopLuisteraar = new DeelKnopLuisteraar();
        deelKnop.addActionListener(deelKnopLuisteraar);
        add(deelKnop);

        plusKnop = new Button("+");
        PlusKnopLuisteraar plusKnopLuisteraar = new PlusKnopLuisteraar();
        plusKnop.addActionListener(plusKnopLuisteraar);
        add(plusKnop);

        minKnop = new Button("-");
        MinKnopLuisteraar minKnopLuisteraar = new MinKnopLuisteraar();
        minKnop.addActionListener(minKnopLuisteraar);
        add(minKnop);


    }

    class KeerKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double uitkomst = getal1 * getal2;
            input1.setText("" + uitkomst);
            input2.setText("");


        }


    }

    class DeelKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double uitkomst = getal1 / getal2;
            input1.setText("" + uitkomst);
            input2.setText("");
        }
    }

    class PlusKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double uitkomst = getal1 + getal2;
            input1.setText("" + uitkomst);
            input2.setText("");
        }
    }

    class MinKnopLuisteraar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(input1.getText());
            getal2 = Double.parseDouble(input2.getText());
            double uitkomst = getal1 - getal2;
            input1.setText("" + uitkomst);
            input2.setText("");
        }
    }
}