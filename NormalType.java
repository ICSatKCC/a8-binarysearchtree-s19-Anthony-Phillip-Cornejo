/**
* interface for Normal type Pokemon.
* Fails checkstyle because no methods.
* @author Lisa Miller
* @since 2/21/2018
*/
public interface NormalType {
   /** constants **/
   /** Type name String. */
   String NORMAL_TYPE = new String("Normal");
   /** Type color String. */   
   String NORMAL_COLOR = new String("Grey");
   /** Array of type fast attack names. */
   String[] POISON_FAST_ATTACKS = {"Acid", "Poison Jab", "Poison Sting"};
   /** Array of type special attack names. */
   String[] POISON_SPECIAL_ATTACKS = {"Cross Poison", "Gunk Shot", 
      "Poison Fang", "Sludge", "Sludge Bomb", "Sludge Wave"};
   /** Array of fast attack powers, coincides with name array. */
   int[] NORMAL_FAST_ATK_POWER = {10, 12, 6}; 
   /** Array of special attack powers, coincides with name array. */      
   int[] NORMAL_SPECIAL_ATK_POWER = {25, 65, 25, 30, 55, 70};
}