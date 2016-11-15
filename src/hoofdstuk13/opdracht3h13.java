package hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by bjorniagard on 15-11-16.
 */
public class opdracht3h13 extends Applet {

        int x;
        int y;
        Button bakstenenknop = new Button("Bakstenen");
        boolean bakstenen = false;

        public void init() {
            bakstenenknop.addActionListener(new bakstenenListener());
            add(bakstenenknop);
        }

        class bakstenenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                bakstenen = true;
                repaint();
            }
        }

        public void paint(Graphics g) {
            if (bakstenen) {
                x = 0;
                y = 0;
                int teller = 0;
                while (teller < 20) {
                    for (int teller2 = 0; teller2 < 20; teller2++) {
                        drawBrick(g);
                        x += 20;
                    }
                    teller++;
                    x = 0;
                    y += 10;
                }
            }
        }

        void drawBrick(Graphics g) {
            g.setColor(Color.RED);
            g.fillRect(x, y, 20, 10);
            g.setColor(Color.black);
            g.drawRect(x, y, 20, 10);
        }
    }
