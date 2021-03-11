package Study4;
import java.awt.*;
import javax.swing.*;

public class S4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("LOL");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(new FlowLayout());
        JLabel lName = new JLabel("account:");
        JTextField tfName = new JTextField("");
        tfName.setText("enter account:");
        tfName.setPreferredSize(new Dimension(80,30));
        JLabel lPassword = new JLabel("password");
        JPasswordField pf = new JPasswordField("");
        pf.setText("&48kdh4@#");
        pf.setPreferredSize(new Dimension(80,30));
        char[] password = pf.getPassword();
        String p = String.valueOf(password);
        System.out.println(p);

        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(pf);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
