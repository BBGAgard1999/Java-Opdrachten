package hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by bjorniagard on 15-11-16.
 */
public class opdracht2h13 extends Applet {

        public void paint(Graphics g) {
            tekenDriehoek(50, 50, 150, 100, 20, 20);
        }

        private void tekenDriehoek(int x1, int x2, int x3, int y1, int y2, int y3) {
            getGraphics().setColor(Color.BLACK);
            getGraphics().drawLine(x1, y1, x2, y2);
            getGraphics().drawLine(x2, y2, x3, y3);
            getGraphics().drawLine(x3, y3, x1, y1);
        }
    }
