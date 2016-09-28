package hoofdstuk4;
import java.awt.*;
import java.applet.Applet;

/**
 * Created by bjorniagard on 28-09-16.
 */
public class opdracht7 extends Applet{

        public void init() {
        }

        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.fillRoundRect(100,100,100,100,20,20);
            g.setColor(Color.RED);
            g.fillOval(110,110,35,35);
            g.fillOval(160,110,35,35);
            g.fillOval(160,160,35,35);
            g.fillOval(110,160,35,35);
        }
    }
