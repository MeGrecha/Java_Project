package Beings;
public class Partner implements Names{
    private int technique;
    private String name;
    public  Partner(){}
    public  Partner(int technique){
        this.technique = technique;
    }

    public  Partner(int technique, String name){
        this.technique = technique;
        //this.name = Names.
    }

    public void setTechnique(int technique) {
        this.technique = technique;
    }

    public int getTechnique() {
        return technique;
    }

}
