package hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bjorniagard on 15-11-16.
 */
public class opdracht1h13 extends Applet {

    String tekst = "";
    Color[] achtergronden = {Color.MAGENTA, Color.GREEN, Color.YELLOW, Color.BLUE, Color.RED};
    String[] kleuren = {"Magenta", "Green", "Yellow", "Blue", "Red"};
    Button[] knoppen = new Button[5];

    public void init() {

        setSize(500, 500);

        for (int i = 0; i < knoppen.length; i++) {

            knoppen[i] = new Button("" + kleuren[i]);
            add(knoppen[i]);
            knoppen[i].addActionListener(new ListenerKnop());
            knoppen[i].setBackground(achtergronden[i]);

        }
    }

    class ListenerKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Button knoppen = (Button) e.getSource();
            setBackground(knoppen.getBackground());
            tekst = knoppen.getLabel();

        }

    }

    public void paint(Graphics g) {

        g.drawString(tekst, getWidth() / 2 - 20, getHeight() / 2);

    }

}


