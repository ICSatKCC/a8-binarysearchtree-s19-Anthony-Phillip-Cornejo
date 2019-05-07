/**
 * Node Class for Pokemon.
 * 
 * @author Lisa Miller
 * @since 5/1/2019
 */
public class PokeNode<T> {
	/** key held in Node. */
	private Pokemon key;
	/** Link to left child Node. */
	private PokeNode<Pokemon> left;
	/** Link to right child Node. */
	private PokeNode<Pokemon> right;
	/** Number of pokemon caught. */
	private int caught;

	/**
	 * Constructor.
	 * 
	 * @param p The address of the object that is stored by the node
	 * @param l The address of the left child
	 * @param r The address of the right child
    * @param numCaught number of pokemon caught
    * @throws PokemonException pokemon Exception.
	 */
	public PokeNode(Pokemon p, int numCaught, PokeNode<Pokemon> l, 
       PokeNode<Pokemon> r) throws PokemonException {
		if (p == null) {
			throw new PokemonException("Pokemon Name Cannot Be Empty!");
		}
		if (numCaught < 1) {
			throw new PokemonException("Caught Amount cannot be less than 1!");
		}

		key = p;
		left = l;
		right = r;
		caught = numCaught;
	}

	/**
	 * Accessor method.
	 * 
	 * @return the Pokemon.
	 */
	public Pokemon getPokemon() {
		return key;
	}

	/**
	 * Accessor method.
	 * 
	 * @return the pokemon's number.
	 */
	public int getKey() {
		return key.getNumber();
	}

	/**
	 * Accessor method.
	 * 
	 * @return the left child's address
	 */
	public PokeNode<Pokemon> getLChild() {
		return left;
	}

	/**
	 * Mutator method.
	 * 
	 * @param l is the left child's address
	 */
	public void setLChild(PokeNode<Pokemon> l) {
		left = l;
	}

	/**
	 * Accessor method.
	 * 
	 * @return the right child's address
	 */
	public PokeNode<Pokemon> getRChild() {
		return right;
	}

	/**
	 * Mutator method.
	 * 
	 * @param r is the right child's address
	 */
	public void setRChild(PokeNode<Pokemon> r) {
		right = r;
	}

   /**
	 * Gets number of pokemon of this species caught.
    * @return caught amount.
	 */
	public int getNumCaught() {
		return caught;
	}

   /**
	 * Increases caught amount by one.
	 */
	public void increaseNumCaught() {
		caught++;
	}

   /**
	 * Decreases caught amount by one.
	 */
	public void decreaseNumCaught() {
		if (caught <= 1) {
			System.out.println("caught value cannot be below 0");
		} else {
			caught--;
		}
	}
   /**
	 * Helper method to set a Pokemon.
	 * 
	 * @param p new pokemon.
	 */
	private void setPokemon(Pokemon p) {
		key = p;
	}
}
