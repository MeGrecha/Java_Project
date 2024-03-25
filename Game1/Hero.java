public class Hero extends Knight{
    int energy;

    void attack(Ogre ogre) {
        ogre.energy = (int) ((Math.random()+0.1) * ogre.energy); // (int) just casts a float result into an int
        ogre.revenge(this); // this represents a reference to the current knight object
    }
}
