package hoofdstuk10;

/**
 * Created by bjorniagard on 11-10-16.
 */
     import java.awt.*;
import java.applet.*;
import java.awt.event.*;


    public class opdracht5h10 extends Applet {
        TextField tekstvak;
        Label label;
        TextField tekstvak2;
        String s, tekst;
        double cijfer;
        String d, tekst2;
        double cijfer2;
        double uitkomst;
        String l, tekst3;

        public void init() {
            tekstvak = new TextField("", 20);
            tekstvak2 = new TextField("", 20);
            label = new Label("Type het cijfer en druk op enter");
            tekstvak.addActionListener(new TekstvakListener());
            tekstvak2.addActionListener(new TekstvakListener());
            tekst = "";
            tekst2 = "";
            tekst3 = "";
            add(label);
            add(tekstvak);
            add(tekstvak2);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 50, 60);
            g.drawString(tekst2, 50, 140);
            g.drawString("gemiddelde is:" + uitkomst, 50, 120);
            g.drawString(tekst3, 50, 140);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                cijfer = Double.parseDouble(s);
                d = tekstvak2.getText();
                cijfer2 = Double.parseDouble(d);
                uitkomst = (cijfer + cijfer2) / 2;
                {
                    if (cijfer2 > 5.) {
                        tekst2 = "Student is geslaagd.";
                    } else {
                        tekst2 = "Niet geslaagd.";
                    }
                    repaint();
                }
            }
        }
    }
