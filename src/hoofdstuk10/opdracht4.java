package hoofdstuk10;

/**
 * Created by bjorniagard on 13-10-16.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


    public class opdracht4 extends Applet {
        TextField tekstvak;
        TextField tekstvak2;
        Label label;
        String s, tekst;
        String d, tekst2;
        int dag;
        int jaartal;

        public void init() {
            tekstvak = new TextField("", 20);
            tekstvak2 = new TextField("", 20);
            label = new Label("Type een jaartal en druk op enter");
            tekstvak.addActionListener(new TekstvakListener());
            tekstvak2.addActionListener(new TekstvakListener());
            tekst = "";
            add(label);
            add(tekstvak);
            add(tekstvak2);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 50, 90);
            g.drawString(tekst2, 50, 110);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                d = tekstvak2.getText();
                dag = Integer.parseInt(d);
                jaartal = Integer.parseInt(s);
                if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                    tekst = "" + jaartal + " is een schrikkeljaar";
                } else {
                    tekst = "" + jaartal + " is geen schrikkeljaar";
                }
                switch (dag) {
                    case 1:
                        tekst2 = "Januari: 31 dagen";
                        break;
                    case 2:
                        if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                                jaartal % 400 == 0) {
                            tekst2 = "Februari: 28 dagen";
                        } else {
                            tekst2 = "Februari: 29 dagen";
                        }
                        break;
                    case 3:
                        tekst2 = "Maart: 31 dagen";
                        break;
                    case 4:
                        tekst2 = "April: 30 dagen";
                        break;
                    case 5:
                        tekst2 = "Mei: 31 dagen";
                        break;
                    case 6:
                        tekst2 = "Juni: 30 dagen";
                        break;
                    case 7:
                        tekst2 = "Juli: 31 dagen";
                        break;
                    case 8:
                        tekst2 = "Augustus: 30 dagen";
                        break;
                    case 9:
                        tekst2 = "September: 31 dagen";
                        break;
                    case 10:
                        tekst2 = "Oktober: 30 dagen";
                        break;
                    case 11:
                        tekst2 = "November: 31 dagen";
                        break;
                    case 12:
                        tekst2 = "December: 30 dagen";
                        break;
                    default:
                        tekst2 = "U hebt een verkeerd nummer ingetikt ...!";
                        break;
                }
                repaint();
            }
        }
    }

