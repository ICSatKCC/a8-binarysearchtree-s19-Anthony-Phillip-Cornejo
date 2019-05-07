/**
 * Blastoise Pokemon object class.
 * subclass of Wartortle
 * 
 * @author Anthony-Phillip Cornejo
 * @version 1.0
 * @since 2/19/2019
 */
public class Blastoise extends Wartortle {

	static final int BASE_ATTACK_POWER = 171;
	static final int BASE_DEFENSE_POWER = 207;
	static final int BASE_STAMINA_POWER = 188;

	public Blastoise() {
		super("Blastoise", "Blastoise", 9, 1.6, 85.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
	}

	public Blastoise(String name) {
		super("Blastoise", name, 9, 1.6, 85.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
	}

	protected Blastoise(String species, String name, int num, double ht, double wt, int baseAttackPwr,
			int baseDefensePwr, int baseStaminaPwr) {

		super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
	}

}