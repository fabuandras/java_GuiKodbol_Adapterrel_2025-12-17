import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame implements ActionListener {

    private JButton b1, b2;

    public Ablak() {
        this.setTitle("Ablak");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        /* a this az osztály páldánya */
        setBounds(0, 0, 320, 240);

        setLayout(new FlowLayout());

        b1 = new JButton("bezár");
        b2 = new JButton("megnyit");
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == b1) {
            dispose();//ha nincs EXIT_ON_CLONE
            System.exit(0);
        } else {
            System.out.println("megnyitás folyamatban...");
        }
    }
}
