package hoofdstuk4;
import java.awt.*;
import java.applet.Applet;

/**
 * Created by bjorniagard on 28-09-16.
 */
public class opdracht3 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.fillRect(100,100,300,50);
            g.setColor(Color.black);
            g.drawLine(100,500,100,100);
            g.setColor(Color.BLUE);
            g.fillRect(100,200,300,50);
        }
    }
