package hoofdstuk11;


import java.applet.Applet;
import java.awt.*;

/**
 * Created by bjorniagard on 01-11-16.
 */

    public class opdracht6h11 extends Applet {
        public void init() {
        }

        public void paint(Graphics g) {
            int teller;
            int y = 40;
            int x = 40;
            int x2 = 60;
            int y2 = 60;



            for (teller = 0; teller < 5; teller++) {
                y +=  20;
                x +=  20;
                y2 -= 10;
                x2 -= 10;
                g.drawOval(x2, y2,x,y);
            }
        }
    }

