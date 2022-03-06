import java.util.*;
/**
 * A class for reversing List and array types.
 *
 * @author PUT YOUR NAME HERE
 * @version 2017-08-09
 */
public class Reverse {

    /**
     * Return a reversed copy of the argument array.
     * The passed array is NOT mutated.
     *
     * @param array An array.
     * @return A reversed copy of array.
     */
    public int[] reversed(int[] array) {
        int[] copy = array.clone();

        for(int i = 0; i < copy.length/2; i++){
          int temp = copy[i];
          copy[i] = copy[copy.length - i - 1];
          copy[copy.length - i - 1] = temp;
        }
        return copy;
   }
    /**
     * Return a reversed copy of the argument List.
     * The passed List is NOT mutated.
     *
     * @param list A List.
     * @return A reversed copy of list.
     */
    public List<Integer> reversed(List<Integer> list) {
        List<Integer> copy = new ArrayList<Integer>(list);

        for(int i = 0; i < copy.size(); i++){
          Collections.swap(copy, i, copy.size() - i - 1);
        }
        return copy;
    }
}
