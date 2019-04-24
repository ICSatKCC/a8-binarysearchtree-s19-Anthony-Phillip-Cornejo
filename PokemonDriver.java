import java.util.*;

/**
 * Driver class for Pokemon species.
 * 
 * @author Anthony-Phillip Cornejo
 * @since 4/14/18
 */

public class PokemonDriver {

   /**
	 * Main method.
	 * 
	 * @param args not used.
	 */
	public static void main(String[] args) {

		PriorityQueue<Pokemon> pq = new PriorityQueue<>();
		Deque<Pokemon> stack = new LinkedList<Pokemon>();

		Pokemon pTemp;

		for (int i = 0; i < 5; i++) {
			pTemp = new Bulbasaur();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Squirtle();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Charmander();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Ivysaur();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Wartortle();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Charmeleon();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Venusaur();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Blastoise();
			pq.add(pTemp);
			stack.push(pTemp);
			pTemp = new Charizard();
			pq.add(pTemp);
			stack.push(pTemp);
		}
		
		while (pq.size() > 0) {
		   Pokemon curr = pq.poll();
		   System.out.println(curr.toString());
		}

		while (stack.size() > 0) {
		   Pokemon curr = stack.pop();
		   System.out.println(curr.toString());
		}
		
	}

}
