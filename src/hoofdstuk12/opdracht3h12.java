package hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by bjorniagard on 03-11-16.
 */
public class opdracht3h12 extends Applet{

    TextField[] tekstvelden;
    int[] getallen;
    Button knop;

    @Override
    public void init() {

        tekstvelden = new TextField[5];
        getallen = new int[5];
        knop = new Button("Ok");
        knop.addActionListener(new Listener());
        add(knop);


        for (int i = 0; i <tekstvelden.length; i++) {
            TextField tf = new TextField("",7);
            tekstvelden[i] = tf;
            add(tf);

        }
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvelden.length; i++) {
                String input = tekstvelden[i].getText();
                getallen[i] = Integer.parseInt(input);
            }

            Arrays.sort(getallen);

            for (int i = 0; i <getallen.length; i++) {
                tekstvelden[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}
