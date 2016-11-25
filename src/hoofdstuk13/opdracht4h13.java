package hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bjorniagard on 15-11-16.
 */
public class opdracht4h13 extends Applet {

    private int x;
    private int y;
    private Button button1 = new Button("1");
    private Button button2 = new Button("2");
    private boolean muur;
    private boolean beton;

    public void init() {
        button1.addActionListener(new button1Listener());
        button2.addActionListener(new button2Listener());
        add(button1);
        add(button2);
        muur = false;
        beton = false;
    }

    private void drawBrick(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 20, 10);
        g.setColor(Color.black);
        g.drawRect(x, y, 20, 10);
    }

    private void drawBeton(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(x, y, 40, 20);
        g.setColor(Color.black);
        g.drawRect(x, y, 40, 20);
    }

    private class button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = true;
            beton = false;
            repaint();
        }
    }

    private class button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            beton = true;
            muur = false;
            repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (muur) {
            x = 0;
            y = 0;
            int teller = 0;
            while (teller < 15) {
                for (int teller2 = 0; teller2 < 20; teller2++) {
                    drawBrick(g);
                    x += 20;
                }
                teller++;
                x = 0;
                y += 10;
            }
        }


        if (beton) {
            x = 0;
            y = 0;
            int teller = 0;
            while (teller < 10) {
                for (int teller2 = 0; teller2 < 15; teller2++) {
                    drawBeton(g);
                    x += 40;
                }
                teller++;
                x = 0;
                y += 20;
            }
        }
    }
}
