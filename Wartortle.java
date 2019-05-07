/**
 * Wartortle Pokemon object class.
 * interfaces Parent class to Blastoise
 * 
 * @author Anthony-Phillip Cornejo
 * @version 1.0
 * @since 2/19/2019
 */
public class Wartortle extends Squirtle {

	static final int BASE_ATTACK_POWER = 126;
	static final int BASE_DEFENSE_POWER = 155;
	static final int BASE_STAMINA_POWER = 153;

	public Wartortle() {
		super("Wartortle", "Wartortle", 8, 1.0, 22.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
	}

	public Wartortle(String name) {
		super("Wartortle", name, 8, 1.0, 22.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
	}

	protected Wartortle(String species, String name, int num, double ht, double wt, int baseAttackPwr,
			int baseDefensePwr, int baseStaminaPwr) {

		super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
	}

}
