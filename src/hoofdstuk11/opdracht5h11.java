package hoofdstuk11;

import java.awt.*;
import java.applet.*;

/**
 * Created by bjorniagard on 01-11-16.
 */


public class opdracht5h11 extends Applet {

    public void init() {
        }

    public void paint(Graphics g) {
        int teller;
        int y = 50;
        int x = 50;
        int x2 = 70;


        for (teller = 0; teller < 5; teller++) {
            y += 20;
            x += 20;
            x2 += 20;
            g.drawLine(x,y,x2,y);
            g.drawLine(x2,y,x2,x2);
            g.drawLine(x2,x2,x,x2);
            g.drawLine(x,x2,x,y);
            }
        }
    }



