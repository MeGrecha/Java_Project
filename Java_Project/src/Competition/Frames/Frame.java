package Competition.Frames;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public Frame() {
    }

    public Frame(int dimWidth) {
    }

    static int getDimWidth(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        return dim.width;
    }
    static int getDimHeight(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        return dim.height;
    }
}
