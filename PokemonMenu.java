import java.util.*; //scanner

/**
 * Sample Crash proof text-based menu.
 * 
 * @author Lisa Miller
 * @since 9/7/2016
 */
public class PokemonMenu {
	/**
	 * main method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		String inString = new String("");
		boolean endLoop = false;
		int pointer = 0;
		ArrayList<Pokemon> pokemonParty = new ArrayList<Pokemon>();

		// loop until stopping condition is given
		while (!endLoop) {
			// menu text
			System.out.println("Please enter the number of your choice:");
			System.out.println("1. Add a Pokemon");
			System.out.println("2. Print all Pokemon");
			System.out.println("0. Exit the program");
			System.out.print("What would you like to do? ");

			// read in from user as a String -- much less errors can happen!
			inString = userIn.nextLine();

			// take off any spaces on the string
			inString = inString.trim();

			// just switch on the String no need to convert to int
			switch (inString) {
			case "0":
				endLoop = true;
				System.out.println("Good bye!");
				break;
			case "1": // do stuff to make a new Pokemon
				if(pokemonParty.size() < 6) {
					pokemonParty.add(makePokemon());
				} else {
					pokemonParty.set(pointer%6, makePokemon());
					
					pointer++;
				}
				break;
			case "2": // print out all the Pokemon
				printArray(pokemonParty);
				break;
			default: // not a valid menu entry
				System.out.println("\n****Invalid menu choice.****");
				System.out.println("Please enter a 0, 1, or 2\n");
				break;

			}
		}
	}

	public static Pokemon makePokemon() {

		Scanner scnr = new Scanner(System.in);
		String pokeName = "";
		int pokemonNumber= 6;
		boolean pokemonLoop = true;
		boolean hasName = false;

		System.out.println("Does the Pokemon have a name? (Y/N)");

		if (scnr.nextLine().equalsIgnoreCase("Y")) {
			System.out.println("Please enter the Pokemon's Name");
			pokeName = scnr.nextLine();
			hasName = true;
		}

		while (pokemonLoop) {
			System.out.println("Choose a Pokemon to add:\n" + "     1 for Squirtle\n" + "     2 for Wartortle\n"
					+ "     3 for Blastoise\n" + "     4 for Bulbasaur\n" + "     5 for Ivysaur\n"
					+ "     6 for Venusaur\n" + "     7 for Charmander\n" + "     8 for Charmeleon\n"
					+ "     9 for Charizard");

			try {
				pokemonNumber = Integer.parseInt(scnr.nextLine());
				if (pokemonNumber > 9 || pokemonNumber < 0) {
					System.out.println("Please enter an integer between 1 - 9");
				} else {
					pokemonLoop = false;
				}

			} catch (NumberFormatException exception) {
				System.out.println("Please enter an integer between 1 - 9");
			}
		}

		if (hasName) {
			switch (pokemonNumber) {
			case 1:
				Pokemon squirtleName = new Squirtle(pokeName);
				return squirtleName;
			case 2:
				Pokemon wartortleName = new Wartortle(pokeName);
				return wartortleName;
			case 3:
				Pokemon blastoiseName = new Blastoise(pokeName);
				return blastoiseName;
			case 4:
				Pokemon bulbasaurName = new Bulbasaur(pokeName);
				return bulbasaurName;
			case 5:
				Pokemon ivysaurName = new Ivysaur(pokeName);
				return ivysaurName;
			case 6:
				Pokemon venusaurName = new Venusaur(pokeName);
				return venusaurName;
			case 7:
				Pokemon charmanderName = new Charmander(pokeName);
				return charmanderName;
			case 8:
				Pokemon charmeleonName = new Charmeleon(pokeName);
				return charmeleonName;
			case 9:
				Pokemon charizardName = new Charizard(pokeName);
				return charizardName;
			}
		} else {
			switch (pokemonNumber) {
			case 1:
				Pokemon squirtle = new Squirtle();
				return squirtle;
			case 2:
				Pokemon wartortle = new Wartortle();
				return wartortle;
			case 3:
				Pokemon blastoise = new Blastoise();
				return blastoise;
			case 4:
				Pokemon bulbasaur = new Bulbasaur();
				return bulbasaur;
			case 5:
				Pokemon ivysaur = new Ivysaur();
				return ivysaur;
			case 6:
				Pokemon venusaur = new Venusaur();
				return venusaur;
			case 7:
				Pokemon charmander = new Charmander();
				return charmander;
			case 8:
				Pokemon charmeleon = new Charmeleon();
				return charmeleon;
			case 9:
				Pokemon charizard = new Charizard();
				return charizard;
			}
		}
		
		return null;
		//this will never be returned
	}
	
	public static void printArray(ArrayList<Pokemon> pokemonList) {
		
		for(int i = 0; i < pokemonList.size(); i++) {
			System.out.printf("Pokemon %d\n", i);
			System.out.println(pokemonList.get(i).toString());
			System.out.println("------------------------------");
		}
		
	}
	
}