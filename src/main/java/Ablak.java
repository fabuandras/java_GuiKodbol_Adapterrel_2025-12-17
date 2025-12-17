import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame implements ActionListener {
    public Ablak() {
        this.setTitle("Ablak");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        /* a this az osztály páldánya */
        setBounds(0, 0, 320, 240);

        setLayout(new FlowLayout());

        JButton b = new JButton("bezár");
        add(b);
        //f.revalidate();

        b.addActionListener(this);

//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.dispose();// ha nincs EXIT_ON_CLOSE
//                System.exit(0);
//            }
//        });

        /* példányosításnál hívjuk --> biztos a legutolsó parancs lesz! */
//        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
