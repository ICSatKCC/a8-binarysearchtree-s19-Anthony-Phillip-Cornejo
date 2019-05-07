import java.util.Random;
/**
 * Charmander Pokemon object class. extends Pokemon
 * 
 * @author Anthony-Phillip Cornejo
 * @version 1.0
 * @since 2/21/2019
 */
public class Charmander extends Pokemon implements FireType {

	static final int BASE_ATTACK_POWER = 116;
	static final int BASE_DEFENSE_POWER = 93;
	static final int BASE_STAMINA_POWER = 118;

	protected boolean fastIsFire = true;
	protected boolean specialIsFire = true;

	protected Charmander(String species, String name, int num, double ht, double wt, int baseAttackPwr,
			int baseDefensePwr, int baseStaminaPwr) {

		super(species, name, num, FIRE_COLOR, ht, wt, FIRE_TYPE, "", baseAttackPwr, baseDefensePwr, baseStaminaPwr);
		// pick Attacks
		// can happen here because all subclasses are same types as Bulbasaur
		chooseFastAttack();
		chooseSpecialAttack();
	}

	public Charmander() {
		super("Charmander", "Charmander", 4, FIRE_COLOR, 0.6, 8.5, FIRE_TYPE, "", BASE_ATTACK_POWER, BASE_DEFENSE_POWER,
				BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}

	public Charmander(String name) {
		super("Charmander", name, 4, FIRE_COLOR, 0.6, 8.5, FIRE_TYPE, "", BASE_ATTACK_POWER, BASE_DEFENSE_POWER,
				BASE_STAMINA_POWER);
		// pick Attacks
		chooseFastAttack();
		chooseSpecialAttack();
	}

	@Override
	public String performFastAttack(Pokemon victim) {
		Random rand = new Random();
		double damage = 0.0;
		double modifier = 1.0;
		double damageDivisor = 250.0;

		String s = "";
		String vType = victim.getType1();

		// random modifier .85 - 1.00
		modifier = (double) (rand.nextInt(16) + 85) / 100.0;
		s = name + " performed " + fastAttack + " on " + victim.getSpecies();

		if (vType.equals("Bug") || vType.equals("Grass") || vType.equals("Ice") || vType.equals("Steel")) {
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
		} else if (vType.equals("Fire") || vType.equals("Dragon") || vType.equals("Water") || vType.equals("Rock")) {
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
		}

		// check for same types for bonus
		if (type1.equals(vType) && type2.equals(victim.getType2())) {
			modifier = modifier * 1.5;
		}
		// bulbapedia damage formula:
		damage = (((2 * level) + 10) / damageDivisor) * attackPower * (specialAttackPower + 2) * modifier;
		// perform hit on victim pokemon
		victim.beAttacked((int) damage);
		return s;

	}

	@Override
	public String performSpecialAttack(Pokemon victim) {
		Random rand = new Random();
		double damage = 0.0;
		double modifier = 1.0;
		double damageDivisor = 250.0;

		String s = "";
		String vType = victim.getType1();

		// random modifier .85 - 1.00
		modifier = (double) (rand.nextInt(16) + 85) / 100.0;
		s = name + " performed " + specialAttack + " on " + victim.getSpecies();

		if (vType.equals("Bug") || vType.equals("Grass") || vType.equals("Ice") || vType.equals("Steel")) {
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
		} else if (vType.equals("Fire") || vType.equals("Dragon") || vType.equals("Water") || vType.equals("Rock")) {
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
		}

		// check for same types for bonus
		if (type1.equals(vType) && type2.equals(victim.getType2())) {
			modifier = modifier * 1.5;
		}
		// bulbapedia damage formula:
		damage = (((2 * level) + 10) / damageDivisor) * attackPower * (specialAttackPower + 2) * modifier;
		// perform hit on victim pokemon
		victim.beAttacked((int) damage);
		return s;
	}

	@Override
	protected void beAttacked(int hit) {
		hit = hit / defensePower;

		if (hP > hit) {
			hP = hP - hit;
		} else {
			hP = 0; // "Pokemon fainted"
		}
	}

	@Override
	protected void chooseFastAttack() {
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(FIRE_FAST_ATTACKS.length);
		fastAttack = FIRE_FAST_ATTACKS[index];
		fastAttackPower = FIRE_FAST_ATK_POWER[index];
	}

	@Override
	protected void chooseSpecialAttack() {
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(FIRE_SPECIAL_ATTACKS.length);
		specialAttack = FIRE_SPECIAL_ATTACKS[index];
		specialAttackPower = FIRE_SPECIAL_ATK_POWER[index];
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
