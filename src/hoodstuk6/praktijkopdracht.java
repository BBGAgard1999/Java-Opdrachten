package hoodstuk6;

/**
 * Created by bjorniagard on 28-09-16.
 */

import java.awt.*;
import java.applet.*;


    public class praktijkopdracht extends Applet {

        double a, b, c, uitkomst, berekening;
        int i;


        public void init() {
            a = 5.9;
            b = 6.3;
            c = 6.9;
            uitkomst = (a + b + c) / 3;

            Double berekening = new Double(uitkomst * 10);

            int i = berekening.intValue();

            double d = (double) i;

            uitkomst = d / 10;
        }

        public void paint(Graphics g) {
            g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
        }
    }

