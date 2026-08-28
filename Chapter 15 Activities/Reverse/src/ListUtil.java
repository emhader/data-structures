import java.util.LinkedList;
import java.util.Collections;
/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
       //Collections.reverse(strings); 
       for(int i = 0; i < strings.size()/2; i++)
       {
        //I get the first one and store it
            String temp = strings.get(i);
        //i set the last one minus i to the first position
            strings.set(i, strings.get(strings.size() - 1 - i));
        // i set the stored variable to the last - i postion
            strings.set(strings.size()-1 -i, temp);
       }

    }
}