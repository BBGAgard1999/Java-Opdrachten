package hoofdstuk11;


import java.applet.Applet;
import java.awt.*;

/**
 * Created by bjorniagard on 01-11-16.
 */

public class opdracht8h11 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 10;
        int x = 10;
        int x2 = 600;
        int y2 = 302;



        for (teller = 0; teller < 101; teller++) {
            y +=   6;
            x +=   6;
            y2 -=  3;
            x2 -=  3;
            g.drawOval(x2, y2,x,y);
        }
    }
}
