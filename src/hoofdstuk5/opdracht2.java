package hoofdstuk5;

/**
 * Created by bjorniagard on 28-09-16.
 */


import java.awt.*;
import java.applet.*;

    public class opdracht2 extends Applet {
        int a;
        int b;
        int c;
        int uitkomst;
        int uitkomst2;
        int uitkomst3;
        public void init() {
            a = 40;
            b = 100;
            c = 80;
            uitkomst = a * 2;
            uitkomst2 = b * 2;
            uitkomst3 = c * 2;
        }

        public void paint(Graphics g) {
            getGraphics().setColor(Color.BLACK);
            g.fillRect(50, 110, 50, uitkomst);
            g.fillRect(120, 50, 50, 100);
            g.fillRect(190, 70, 50, 80);
            g.drawString("Valerie ", 50, 160);
            g.drawString("Jeroen ", 120, 160);
            g.drawString("Hans ", 190, 160);
            g.drawString(uitkomst + "kg",  50, 100);
            g.drawString(uitkomst2 + "kg", 120, 40);
            g.drawString(uitkomst3 + "kg", 190, 60);
        }
    }

