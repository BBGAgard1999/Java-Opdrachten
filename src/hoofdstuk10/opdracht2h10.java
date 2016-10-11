package hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bjorniagard on 11-10-16.
 */
public class opdracht2h10 extends Applet {


    TextField tekstveld;
    Button knop;
    int HoogsteGetal;
    int LaagsteGetal;
    Boolean geklikt;


    @Override
    public void init() {
        super.init();
        geklikt = false;

        tekstveld = new TextField("", 10);
        add(tekstveld);

        knop = new Button("Ok");


        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        add(knop);
        HoogsteGetal = Integer.MIN_VALUE;
        LaagsteGetal = Integer.MAX_VALUE;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;
        int y = 70;

        if (geklikt) {
            g.drawString("Hoogste getal: " + HoogsteGetal, x, y);
            y = y + 20;
            g.drawString("Laagste getal; " + LaagsteGetal, x, y);
        }

    }


    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            String getalString = tekstveld.getText();
            int getal = Integer.parseInt(getalString);


            if (getal > HoogsteGetal) {
                HoogsteGetal = getal;
            }


            if (getal < LaagsteGetal) {
                LaagsteGetal = getal;
            }



            repaint();

        }
    }
}

