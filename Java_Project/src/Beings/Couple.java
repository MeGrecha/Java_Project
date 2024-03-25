package Beings;
import Objects.*;
public class Couple implements Names{
    private int choreography;
    public Partner partner;
    public Lead_partner lead;
    public Costume costume;

    private String origin;

    public Couple(Partner partner, Lead_partner lead){
        this.partner = partner;
        this.lead = lead;
    }
    public Couple(Partner partner, Lead_partner lead, String origin){
        this.partner = partner;
        this.lead = lead;
        this.origin = Names.getOrigin();
    }

    public void setLead(Lead_partner lead) {
        this.lead = lead;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public  void setChoreography(int choreography){
        this.choreography = choreography;
    }
    public  void setChoreography(int choreography, Costume costume){
        this.choreography = choreography;
        this.costume = costume;
    }
    public int getChoreography() {
        return choreography;
    }
    public int getTechnique(){
        return (partner.getTechnique() + lead.getTechnique());
    }

    public String getOrigin(){return origin;}
    //public void setOrigin(String o){this.origin = origin;}
}
