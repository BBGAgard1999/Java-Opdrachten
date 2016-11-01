package hoofdstuk11;

import java.awt.*;
import java.applet.*;

/**
 * Created by bjorniagard on 01-11-16.
 */

public class opdracht4h11 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;


        for (teller = 0; teller < 11; teller++) {
            int c = teller * 3;
            y += 20;
            g.drawString("" + c, y, 30);
        }
    }
}

