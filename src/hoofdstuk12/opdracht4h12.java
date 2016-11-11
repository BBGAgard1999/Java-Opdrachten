package hoofdstuk12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by bjorniagard on 03-11-16.
 */

    public class opdracht4h12 extends Applet {
        boolean gevonden;
        double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
        double gezocht;

        public void init() {
            gezocht = 400;
            gevonden = false;
            int teller = 0;
            while(teller < salaris.length) {
                if(salaris[teller] == gezocht) {
                    gevonden = true;
                    break;
                }
                teller ++;
            }
        }

        public void paint(Graphics g) {
            if(gevonden == true) {
                g.drawString("De waarde is gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }
