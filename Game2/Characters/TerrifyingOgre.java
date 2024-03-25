package Characters;

import Characters.Knight;

public class TerrifyingOgre extends BadOgre {

    public TerrifyingOgre(){super();}

    public TerrifyingOgre(int energy){
        super(energy);
    }
    public TerrifyingOgre(int energy, boolean hungry){
        setEnergy(energy);
        setValues(hungry);
    }

    @Override
    void eat(Knight knight) {
        roar();
        super.eat(knight);
    }

    void roar(){
        System.out.println("Roar!!!");
    }
}
