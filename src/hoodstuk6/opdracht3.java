package hoodstuk6;

/**
 * Created by bjorniagard on 28-09-16.
 */

import java.awt.*;
import java.applet.*;


    public class opdracht3 extends Applet {
        double  a, b, c, uitkomst;


        public void init() {
            a = 2;
            b = 9;

            c = a + b;

            uitkomst = -c;
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: " + uitkomst, 20, 20);

        }
    }

