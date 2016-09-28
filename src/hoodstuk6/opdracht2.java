package hoodstuk6;

import java.awt.*;
import java.applet.*;

/**
 * Created by bjorniagard on 28-09-16.
 */

public class opdracht2 extends Applet {
        int seconden = 60;
        int uur;
        int dag;
        int jaar;


        public void init() {

            uur = seconden * 60;
            dag = uur * 24;
            jaar = dag * 365;
        }

        public void paint(Graphics g) {
            g.drawString("1 uur = " + uur + " seconden"  , 50, 60 );
            g.drawString("1 dag = " + dag + " seconden"  , 50, 80 );
            g.drawString("1 jaar = " + jaar + " seconden"  , 50, 100 );

        }
    }

