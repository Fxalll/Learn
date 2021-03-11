package Study4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class S7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("密码界面");
        f.setSize(300,300);
        f.setLocation(200,200);
        f.setLayout(new FlowLayout());

        JButton b = new JButton("enter");
        JLabel lName = new JLabel("account:");
        JTextField tfName = new JTextField("");
        tfName.setPreferredSize(new Dimension(180,30));
        JLabel lPassword = new JLabel("password:");
        JPasswordField pf = new JPasswordField("");
        pf.setPreferredSize(new Dimension(180,30));

        char[] password = pf.getPassword();
        String p = String.valueOf(password);
        System.out.println(p);

        b.setBounds(60,60,60,60);

        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(pf);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(lName);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);



    }
}
