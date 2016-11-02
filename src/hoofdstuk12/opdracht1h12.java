package hoofdstuk12;


import java.applet.Applet;
import java.awt.*;


/**
 * Created by bjorniagard on 02-11-16.
 */


public class opdracht1h12 extends Applet {

    int[] nummers = {1, 2, 3, 4, 5, 6, 7, 9, 8};

    public void init() {
        setSize(275, 200);
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();
        double gem = 0.0;

        for (int i = 0; i < nummers.length; i++) {
            g.drawString("" + nummers[i], x / 2, (y / 2 - 15 * nummers.length / 2) + 15 * i);
            gem += nummers[i];
        }
        gem /= nummers.length;
        g.drawString("Het gemiddelde is " + gem, x / 2 - 50, (y / 2 + 15 * nummers.length / 2) + 10);
    }


}
