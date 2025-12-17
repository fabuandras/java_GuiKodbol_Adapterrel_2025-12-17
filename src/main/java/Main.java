import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Ablak");
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        f.setBounds(0, 0, 320, 240);

        f.setLayout(new FlowLayout());

        JButton b = new JButton("bezár");
        f.add(b);
        //f.revalidate();

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();// ha nincs EXIT_ON_CLOSE
                System.exit(0);
            }
        });

        f.setVisible(true);

    }
}
