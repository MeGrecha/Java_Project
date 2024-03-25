package Competition.Frames;

import javax.swing.*;
import java.awt.*;

public class Frame_1 extends Frame{


    JFrame frame2 = new JFrame();

    Frame_1(){

        JLabel label = new JLabel();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,getDimWidth(), getDimHeight());

        label.setText("Hiiiii");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 50));
        label.setBounds(100,100,400,400);
        label.setForeground(Color.BLACK);
        label.setOpaque(true);

        frame2.add(layeredPane);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);

        frame2.setSize(getDimWidth(), getDimHeight());
        frame2.add(label);
        frame2.setVisible(true);

    }
}
