/**
 * Binary Search Tree for Pokemon.
 * @param <T> Object Type
 * @author Lisa Miller
 * @since 5/1/2019
 */
public class PokeTree<T extends java.lang.Comparable<Pokemon>> {

  /** Root node instance variable. */
   private PokeNode<Pokemon> root = null;

  /** No parameter constructor. */
   public PokeTree() {
      // root already initialized
   }

  /**
   * Adds an item to the tree.
   * Non-recursive wrapper method
   * 
   * @param item The object to be added
   */
   public void add(Pokemon item) {
   // calls a recursive, private method
   // cannot get direct access to the root outside the class
      root = add(root, item);
   }
  
  /**
   * Recusively adds an item to the tree.
   * 
   * @param node The root of the tree/subtree
   * @param item The object to be added
   * @return The current node
   */
   private PokeNode<Pokemon> add(PokeNode<Pokemon> node, Pokemon item) {
   // base case: empty tree or end of a leaf
      if (node == null) {
         return new PokeNode<Pokemon>(item, 1, null, null);
      }
      // base case: duplicate node, so increase Number Caught
      else if (item.getNumber() == node.getKey()) {
         node.increaseNumCaught();
         return node;
      }
      // recursive case: if item is less than current node
      // then move to left child node
      else if (item.getNumber() < node.getKey()) {
      // set the node's left child to the
      // left subtree with item added
         node.setLChild(this.add(node.getLChild(), item));
         return node;
      }
      // recursive case: if item is greater than current node
      // then traverse to right child node
      else {
      // set the node's right child to the
      // right subtree with item added
         node.setRChild(this.add(node.getRChild(), item));
         return node;
      }
   }

  /**
   * called automatically by println/print method.
   * 
   * @return an inorder String of the tree
   */
   public String printPokeTree() {
      return this.printPokeTree(root);
   }

  /**
   * inOrder display of nodes, with newline between each node.
   * 
   * @param node The root of the tree/subtree
   * @return an inorder String of the tree
   */
   private String printPokeTree(PokeNode<Pokemon> node) {
      String displayNodes = "";
      if (node != null) {
         displayNodes = displayNodes 
            + this.printPokeTree(node.getLChild());
         
         displayNodes = displayNodes + node.getPokemon().toString() + "\n";
         displayNodes = displayNodes + "Number Caught: " 
            + node.getNumCaught() + "\n";
         
         displayNodes = displayNodes 
            + this.printPokeTree(node.getRChild());
      }
      return displayNodes;
   }

  /**
   * Pre-Order traversal of tree.
   * 
   * @return String representation of preOrder
   */
   public String preOrderPokeTree() {
      return this.preOrderPokeTree(root);
   }

  /**
   * Recursive preOrder traversal of tree.
   * 
   * @param node The root of the tree/subtree
   * @return a preOrder String of the tree
   */
   private String preOrderPokeTree(PokeNode<Pokemon> node) {
      String displayNodes = "";
      if (node != null) {
         displayNodes = displayNodes + node.toString() + "\n";
         displayNodes = displayNodes
            + this.preOrderPokeTree(node.getLChild());
         displayNodes = displayNodes 
            + this.preOrderPokeTree(node.getRChild());
      }
      return displayNodes;
   }

   /**
   * gets an item from the tree with the same search key.
   * 
   * @param searchKey1 An object containing the search key
   * @return the data item in the tree with matching key.
   */
   public Pokemon get(Pokemon searchKey1) {
   // cannot get direct access to the root outside the class
      return this.get(root, searchKey1);
   }

  /**
   * Recursive methog to get an item from the tree.
   * 
   * @param node The root of the tree/subtree
   * @param searchKey2 An object storing the key to get.
   * @return the data item in tree with matching key.
   * @throws TreeException if item not found
   */
   private Pokemon get(PokeNode<Pokemon> node, Pokemon searchKey2) {
   // if not found, throw exception
      if (node == null) {
         throw new TreeException("Item not found!");
      } 
      else {
      // if the search key matches, return the item's address
         if (node.getKey() == searchKey2.getNumber()) {
            return node.getPokemon();
         }
         // if the search key of the searchKey is less than the node,
         // then search the left subtree
         else if (searchKey2.getNumber() < node.getKey()) {
            return this.get(node.getLChild(), searchKey2);
         }
         // if the search key of the searchKey is greater than the node,
         // then search the right subtree
         else {
            return this.get(node.getRChild(), searchKey2);
         }
      }
   }

  /**
   * Removes an item from the tree.
   * 
   * @param searchKey3 An object storing the key to remove.
   */
   public void remove(Pokemon searchKey3) {
      root = this.remove(root, searchKey3);
   }

  /**
   * Recursively removes an item from the tree.   
   * 
   * @param node The root of the tree/subtree
   * @param searchKey4 An object storing only the key to remove.
   * @return root of current subtree.
   * @throws TreeException if item not found in tree.
   */
   private PokeNode<Pokemon> remove(PokeNode<Pokemon> node, Pokemon searchKey4) {
   // if item not found, throw exception
      if (node == null) {
         return node;
      }
      // if search key is less than node's search key,
      // continue to left subtree
      else if (searchKey4.getNumber() < node.getKey()) {
         node.setLChild(this.remove(node.getLChild(), searchKey4));
         return node;
      }
      // if search key is greater than node's search key,
      // continue to right subtree
      else if (searchKey4.getNumber() > node.getKey()) {
         node.setRChild(this.remove(node.getRChild(), searchKey4));
         return node;
      }
      // found node containing object with same search key,
      // so delete it
      else {
      // call private method remove
        
         if (node.getNumCaught() > 1) {
            node.decreaseNumCaught();
            return node;
         } else {
            node = this.remove(node);
            return node;
         }
      }
   }
   
   /**
	 * Removes Pokemon from the BST.
	 * 
	 * @param node Node for the pokemon
    * @return deleted node
	 */
   private PokeNode<Pokemon> remove(PokeNode<Pokemon> node) {
      // if node is a leaf,return null
      if (node.getLChild() == null && node.getRChild() == null) {
         return null;
      }
         // if node has a single right child node,
         // then return a reference to the right child node
      else if (node.getLChild() == null) {
         return node.getRChild();
      }
         // if node has a single left child node,
         // then return a reference to the left child node
      else if (node.getRChild() == null) {
         return node.getLChild();
      }
         // if the node has two child nodes
      else {
         // get next Smaller Item, which is Largest Item in Left Subtree
         // The next Smaller Item is stored at the rightmost node in the left
         // subtree.
         PokeNode largestItemInLeftSubtree 
             = this.getItemWithLargestSearchKey(node
                .getLChild());
         // replace the node's item with this item
         node = largestItemInLeftSubtree;
         // delete the rightmost node in the left subtree
         node.setLChild(this.removeNodeWithLargestSearchKey(node
                .getLChild()));
         return node;
      }
   }

	  /**
	   * Returns the item with the largest search key in the (sub)tree.
	   * Helper method for removing interior nodes.
	   * @param node The root of the tree/subtree
	   * @return The data item with largest key
	   */
   private PokeNode<Pokemon> getItemWithLargestSearchKey(PokeNode<Pokemon> node) {
      // if no right child, then this node contains the largest item
      if (node.getRChild() == null) {
         return node;
      }
         // if not, keep looking on the right
      else {
         return this.getItemWithLargestSearchKey(node.getRChild());
      }
   }

	  /**
	   * Removes the node with the largest search key.
	   * Helper method for removing interior nodes.
	   * Remove the node formerly occupied by item with largest search key.
	   * To be called after item is moved to new node location.
	   * 
	   * @param node The root of the tree/subtree
	   * @return root of (sub)tree with node removed.
	   */
   private PokeNode<Pokemon> removeNodeWithLargestSearchKey(PokeNode<Pokemon> node) {
      // if no right child, then this node contains the largest item
      // so replace it with its left child
      if (node.getRChild() == null) {
         return node.getLChild();
      }
         // if not, keep looking on the right
      else {
         node.setRChild(this.removeNodeWithLargestSearchKey(node
                .getRChild()));
         return node;
      }
   }
}