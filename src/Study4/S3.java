package Study4;
import java.awt.*;
import javax.swing.*;

public class S3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("LOL");
        f.setSize(1400,1300);
        f.setLocation(200,200);
        f.setLayout(null);
        JLabel l = new JLabel("LOL word");
        JButton b = new JButton("press it!~");
        JCheckBox bCheckBox = new JCheckBox("hero");
        JCheckBox bCheckBox2 = new JCheckBox("evil");
        JRadioButton bl = new JRadioButton("no hero");
        JRadioButton bl2 = new JRadioButton("no evil");
        String[] heros = new String[]{"nihao","wohao","dajiaohao"};
        JComboBox cb = new JComboBox(heros);


        ButtonGroup bg = new ButtonGroup();
        bg.add(bl);
        bg.add(bl2);
        l.setForeground(Color.red);
        bCheckBox.setSelected(true);
        bl.setSelected(true);
        l.setBounds(50,50,280,30);
        b.setBounds(60,60,350,40);
        bCheckBox.setBounds(100,100,100,100);
        bCheckBox2.setBounds(100,200,100,100);
        bl.setBounds(200,200,200,200);
        bl2.setBounds(200,300,200,200);
        cb.setBounds(300,300,300,300);


        System.out.println(bCheckBox2.isSelected());
        f.add(l);
        f.add(b);
        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.add(bl);
        f.add(bl2);
        f.add(cb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        int option = JOptionPane.showConfirmDialog(f,"Select.");
        if (JOptionPane.OK_OPTION == option) {
            String answer = JOptionPane.showInputDialog(f,"enter yes.");
            if ("yes".equals(answer)) JOptionPane.showMessageDialog(f,"get out.");
        }
    }
}
