package hoofdstuk11;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bjorniagard on 01-11-16.
 */

    public class opdracht10h11 extends Applet {
        private Button knop = new Button("Enter");
        private TextField tekstvak;
        private int kop;


        public void init() {
            KnopListener kl = new KnopListener();
            tekstvak = new TextField("", 20);
            knop.addActionListener(kl);
            add(tekstvak);
            add(knop);
        }

        public void paint(Graphics g) {
            int teller;
            int y = 0;


            for (teller = 1; teller < 11; teller++) {
                int c = teller * kop;
                y += 20;
                g.drawString(teller + " x " + kop + " = " + c, 305, y);
            }
        }

        private class KnopListener implements ActionListener {

            public void actionPerformed( ActionEvent e ) {
                kop = Integer.parseInt(tekstvak.getText());
                repaint();
            }
        }
    }
