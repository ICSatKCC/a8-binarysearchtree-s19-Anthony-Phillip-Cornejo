public class PokeNode<Pokemon> {
	// data fields
  /** Data held in Node. */
   private Pokemon data;
   /** Link to left child Node. */
   private PokeNode<Pokemon> left;
   /** Link to right child Node. */
   private PokeNode<Pokemon> right;

	/**
	 * Constructor.
	 * 
	 * @param d The address of the object that is stored by the node
	 * @param l The address of the left child
	 * @param r The address of the right child
	 */
   public PokeNode(Pokemon d, PokeNode<Pokemon> l,
   		PokeNode<Pokemon> r) {
      data = d;
      left = l;
      right = r;
   }

	/**
	 * Automatically called by println() or print() method.
	 * 
	 * @return the item's string
	 */
   public String toString() {
      String display = data.toString();
      return display;
   }

	/**
	 * Accessor method.
	 * 
	 * @return the item's address
	 */
   public Pokemon getData() {
      return data;
   }

	/**
	 * Mutator method.
	 * 
	 * @param d
	 *            is the item's address
	 */
   public void setData(Pokemon d) {
      data = d;
   }

	/**
	 * Accessor method.
	 * 
	 * @return the left child's address
	 */
   public PokeNode<Pokemon> getLeftChild() {
      return left;
   }

	/**
	 * Mutator method.
	 * 
	 * @param l
	 *            is the left child's address
	 */
   public void setLeftChild(PokeNode<Pokemon> l) {
      left = l;
   }

	/**
	 * Accessor method.
	 * 
	 * @return the right child's address
	 */
   public PokeNode<Pokemon> getRightChild() {
      return right;
   }

	/**
	 * Mutator method.
	 * 
	 * @param r
	 *            is the right child's address
	 */
   public void setRightChild(PokeNode<Pokemon> r) {
      right = r;
   }
}
