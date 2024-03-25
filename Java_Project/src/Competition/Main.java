package Competition;
import Beings.*;
import Competition.Frames.LaunchFrame;
import Competition.Frames.Secret_Frame;
import Objects.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.*;



public class Main {

   public static void main(String[] args) throws MalformedURLException {

        //LaunchFrame launchFrame = new LaunchFrame();
        //Frame_1 frame = new Frame_1();
        Secret_Frame secret = new Secret_Frame();

    }

    public static void checking(){
        Partner partner = new Partner(56);
        Lead_partner lead = new Lead_partner(67);
        Couple couple = new Couple(partner,lead);
        couple.setChoreography(100);
        System.out.println("Hi "+couple.getTechnique()+" "+couple.getChoreography()+ " " +couple.getOrigin());
    }

           /*public static void main(String[] args) {
        checking();

        }*/

}