package hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by bjorniagard on 08-11-16.
 */
public class getallensorteren extends Applet {

    int[] getallen;
    TextField[] tekstvelden;
    Button knop;
    @Override
    public void init() {

        getallen = new int[5];
        tekstvelden = new TextField[5];
//      tekstvelden[0] = new TextField("", 7);
//      tekstvelden[1] = new TextField("", 7);
//      tekstvelden[2] = new TextField("", 7);
//      tekstvelden[3] = new TextField("", 7);
//      tekstvelden[4] = new TextField("", 7);

        for (int i =0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("", 7);
            add(tekstvelden[i]);
        }
        knop = new Button("KLik");
        knop.addActionListener(new KnopListener());
        add(knop);
    }





    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            for (int i  = 0; i < getallen.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());

            }


            Arrays.sort(getallen);

            for (int i = 0; i < tekstvelden.length; i++) {
                tekstvelden[i].setText("" + getallen[i]);
            }

        }
    }
}
