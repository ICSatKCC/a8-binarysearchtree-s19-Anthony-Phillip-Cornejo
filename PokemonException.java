/**
 * An Exception for use with the Pokemon class.
 * 
 * @author Anthony-Phillip Cornejo
 */
public class PokemonException extends RuntimeException {
    /**
    * Constructor.
    * 
    * @param message Describes the cause of the error
    */
	public PokemonException(String message) {
	      super(message);
	}
}
