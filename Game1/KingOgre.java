public class KingOgre extends BadOgre{

    void revenge(Knight knight) {
        if (hungry)
            eat(knight);
        else attack(knight);
    }
    void eat(Knight knight) {
        knight.energy = 0;
    }

    void attack(Knight knight){
        knight.energy = (int) (0.95 * knight.energy);
    }
}
