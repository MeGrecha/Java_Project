package Competition;
import Competition.Followers.RoundFollower;

import java.util.*;
public class Competition {
    private ArrayList<RoundFollower> roundFollowers = new ArrayList<>();

    public void ReportRoundFollowers(){
        for(RoundFollower curr: roundFollowers){
            curr.report();
        }
    }
}
