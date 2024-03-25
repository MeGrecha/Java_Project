package Competition.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class Secret_Frame implements ActionListener {

    JFrame frame = new JFrame();
    JButton button;

    public Secret_Frame() throws MalformedURLException {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,dim.width,dim.height);

        button = new JButton("Start");
        //button.setText("");
        button.setBounds((dim.width - 300)/2, (dim.width /4), 300, 100);
        //button.setSize(300,100);
        button.setFocusable(false);
        button.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        //button.setIcon();
        button.setBackground(new Color(111,69,139));
        button.setForeground(new Color(247, 190, 250));
        button.setBorder(BorderFactory.createEtchedBorder(100, new Color(210, 167, 230), new Color(63, 44, 87)));


        button.addActionListener(this);

        URL url = new URL("https://i.pinimg.com/originals/23/51/bc/2351bc65b2b5d75cef146b7edddf805b.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        label.setBounds(1,(dim.height) - 458,498, 385);

        URL url2 = new URL("https://i.pinimg.com/originals/09/cb/16/09cb169942c1647ff7707910a0eef733.gif");
        Icon icon2 = new ImageIcon(url2);
        JLabel label2 = new JLabel(icon2);
        label2.setBounds((dim.width) - 221,1,220, 220);

        //frame.setResizable(false);
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setSize(dim.width, dim.height);
        frame.add(button);
        frame.add(label);
        frame.add(label2);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            LaunchFrame launchFrame = new LaunchFrame();

        }
    }
}
