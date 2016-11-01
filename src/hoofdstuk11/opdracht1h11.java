package hoofdstuk11;

/**
 * Created by bjorniagard on 25-10-16.
 */


import java.awt.*;
import java.applet.*;


    public class opdracht1h11 extends Applet {

        public void init() {}

        public void paint(Graphics g) {
            int teller;
            int y = 0;

            for(teller = 0; teller < 10; teller++) {
                y += 20;
                g.drawLine(y , 50, y, 300 );
                g.drawString("" + teller, 305, y );
            }
        }
    }
