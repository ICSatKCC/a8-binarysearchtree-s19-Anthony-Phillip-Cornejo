import java.util.*;

/**
 * Pokedex class to test BST.
 * 
 * @author Lisa Miller
 * @since 5/01/19
 */
public class Pokedex {

   /** The Pokemon BST. */
	private static PokeTree pokeDex = new PokeTree();


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

		// loop until stopping condition is given
		while (!endLoop) {
			// menu text
			System.out.println("Please enter the number of your choice:");
			System.out.println("1. Catch Pokemon");
			System.out.println("2. Trade Pokemon");
			System.out.println("3. Print Pokedex");
			System.out.println("0. Exit the program");
			System.out.print("What would you like to do? ");

			// read in from user as a String -- much less errors can happen!
			inString = userIn.nextLine();

			// take off any spaces on the string
			inString = inString.trim();

			System.out.print("\n");

			
			// just switch on the String no need to convert to int
			switch (inString) {
   			case "0":
   				endLoop = true;
   				System.out.println("Good bye!");
   				break;
   			case "1": // do stuff to make a new Pokemon
   				pokeDex.add(makePokemon());
   				System.out.println(pokeDex.printPokeTree());
   				break;
   			case "2": // do stuff to trade pokemon
   				tradePokemon();
	   			break;
		   	case "3": // print pokedex
			   	System.out.println(pokeDex.printPokeTree());
				   break;
			   default: // not a valid menu entry
			   	System.out.println("\n****Invalid menu choice.****");
			   	System.out.println("Please enter a 0, 1, 2, or 3\n");
   				break;

			}
		}
	}


     /**
	 * Method to create a pokemon.
	 * @return a new Pokemon.
	 */
	public static Pokemon makePokemon() {

		Scanner scnr = new Scanner(System.in);
		int pokemonNumber = 0;
		boolean pokemonLoop = true;

		while (pokemonLoop) {
			System.out.println("Choose a Pokemon to add:\n" 
               + "     1 for Bulbasaur\n" 
               + "     2 for Ivysaur\n"
					+ "     3 for Venusaur\n" 
               + "     4 for Charmander\n" 
               + "     5 for Charmeleon\n"
					+ "     6 for Charizard\n" 
               + "     7 for Squirtle\n" 
               + "     8 for Wartortle\n"
					+ "     9 for Blastoise");

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
		switch (pokemonNumber) {
	  		case 1:
	  			Pokemon p1 = new Bulbasaur();
	  			return p1;
	  		case 2:
	  			Pokemon p2 = new Ivysaur();
	  			return p2;
	  		case 3:
	  			Pokemon p3 = new Venusaur();
	  			return p3;
	  		case 4:
	  			Pokemon p4 = new Charmander();
	  			return p4;
	  		case 5:
	  			Pokemon p5 = new Charmeleon();
	  			return p5;
	  		case 6:
	  			Pokemon p6 = new Charizard();
	  			return p6;
	   	case 7:
	   		Pokemon p7 = new Squirtle();
	   		return p7;
   		case 8:
	  			Pokemon p8 = new Wartortle();
	  			return p8;
	  		case 9:
	   		Pokemon p9 = new Blastoise();
		   	return p9;
			default:
				System.out.println("it bronken");
				return null;
		}
	}


     /**
	 * Method to trade a pokemon.
	 * 
	 */
	public static void tradePokemon() {

		Scanner scnr = new Scanner(System.in);
		String pokeName = "";
		int pokemonNumber = 6;
		boolean pokemonLoop = true;

		while (pokemonLoop) {
			System.out.println("Choose a Pokemon to Trade:\n" 
               + "     1 for Bulbasaur\n" 
               + "     2 for Ivysaur\n"
					+ "     3 for Venusaur\n" 
               + "     4 for Charmander\n" 
               + "     5 for Charmeleon\n"
					+ "     6 for Charizard\n" 
               + "     7 for Squirtle\n" 
               + "     8 for Wartortle\n"
					+ "     9 for Blastoise");

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

		switch (pokemonNumber) {
		   case 1:
		   	Pokemon p1 = new Bulbasaur();
		   	pokeDex.remove(p1);
		   case 2:
		   	Pokemon p2 = new Ivysaur();
		   	pokeDex.remove(p2);
		   case 3:
	     		Pokemon p3 = new Venusaur();
	   		pokeDex.remove(p3);
	   	case 4:
	   		Pokemon p4 = new Charmander();
	   		pokeDex.remove(p4);
	   	case 5:
	   		Pokemon p5 = new Charmeleon();
	   		pokeDex.remove(p5);
	   	case 6:
	   		Pokemon p6 = new Charizard();
	   		pokeDex.remove(p6);
	   	case 7:
	   		Pokemon p7 = new Squirtle();
	   		pokeDex.remove(p7);
	   	case 8:
	   		Pokemon p8 = new Wartortle();
	   		pokeDex.remove(p8);
	   	case 9:
	   		Pokemon p9 = new Blastoise();
     			pokeDex.remove(p9);
   		default:
		}
	}
}
