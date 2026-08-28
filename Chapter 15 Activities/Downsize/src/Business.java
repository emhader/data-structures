import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iterator = employeeNames.listIterator();
        int count = 0;
        while (iterator.hasNext())
        {
            //sets the iterator at the first thing in the linked list
            iterator.next();
            //adds one to the count because the iterator moves by one
            count++;

            //if the number remaainder n is 0 then they are thesame number
            if (count % n == 0)
            {
                //removes the current element from the linked list
                iterator.remove();
            }
        }
    }
} 
