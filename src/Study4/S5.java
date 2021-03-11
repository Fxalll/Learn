package Study4;
import java.awt.*;
import javax.swing.*;

public class S5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("LOL");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setLayout(new FlowLayout());
        JProgressBar pb = new JProgressBar();

        pb.setMaximum(100);
        pb.setValue(50);
        pb.setStringPainted(false);

        f.add(pb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
