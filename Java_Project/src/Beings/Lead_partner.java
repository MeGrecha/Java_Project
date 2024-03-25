package Beings;
public class Lead_partner extends Partner{

    private int leadCoefficient;
    public  Lead_partner(){}
    public Lead_partner(int technique){
        super(technique);
    }
    public Lead_partner(int technique, int leadCoefficient){
        super(technique);
        this.leadCoefficient = leadCoefficient;
    }

}
