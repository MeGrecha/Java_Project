package Competition.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LaunchFrame extends Frame implements ActionListener {

    JFrame frame = new JFrame();
    JButton button;

    public LaunchFrame() {

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,getDimWidth(), getDimWidth());

        button = new JButton("Start");
        //button.setText("");
        button.setBounds((getDimWidth() - 250)/2, (getDimHeight() /2) +100, 250, 100);
        //button.setSize(300,100);
        button.setFocusable(false);
        button.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        //button.setIcon();
        button.setBackground(new Color(182,170,76));
        button.setForeground(new Color(252, 252, 180));
        button.setBorder(BorderFactory.createEtchedBorder(100, new Color(250, 234, 171), new Color(70, 72, 84)));


        button.addActionListener(this);


        ImageIcon image = new ImageIcon(getClass().getResource("couple-dancing-ballroom-dance.png"));
        JLabel label = new JLabel(image);
        label.setBounds(0, -(getDimHeight()/2)+100, getDimWidth(), getDimWidth());


        //frame.setResizable(false);
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setSize(getDimWidth(), getDimHeight());
        frame.add(button);
        frame.add(label);



        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            Frame_1 frame_1 = new Frame_1();

        }
    }
}
