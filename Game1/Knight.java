
public class Knight {
	int energy;

	void attack(Ogre ogre) {
		ogre.energy = (int) (Math.random() * ogre.energy); // (int) just casts a float result into an int
		System.out.println(this);
		ogre.revenge(this); // this represents a reference to the current knight object

	}
}
