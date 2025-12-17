import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ablak extends JFrame implements ActionListener {

    private JButton b1, b2;

    public Ablak() {
        this.setTitle("Ablak");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        /* a this az osztály páldánya */
        setBounds(0, 0, 320, 240);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                kilepes();
            }
        });

        setLayout(new FlowLayout());

        b1 = new JButton("bezár");
        b1.putClientProperty("b1", "kilepes");
        b2 = new JButton("megnyit");
        b1.putClientProperty("b2", "megnyitas");
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        String fv = "";
        if (obj instanceof JButton) {
            JButton b = (JButton)obj;
            if (b.getClientProperty("b1") != null){
                kilepes();
            } if (b.getClientProperty("b2") != null) {

            }
        }
        String kulcs = "";
        switch (e.getActionCommand()) {
            case "bez":
                kilepes();break;
            case "meg":
                megnyitas();break;
        }
    }

    private void megnyitas() {
        System.out.println("megnyitás folyamatban...");
    }

    private void kilepes() {
        dispose();//ha nincs EXIT_ON_CLOSE
        System.exit(0);
    }
}
