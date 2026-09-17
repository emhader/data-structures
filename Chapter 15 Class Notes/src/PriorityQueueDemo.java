import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo //works more like a stack than a queue, but in order of their calue using compare to
{
    public static void main(String[] args)
    {
        //create a prioroity queue fo strings
       //a priority ue must be composed of comparable objects (compareTo method)
       Queue<String> Students = new PriorityQueue<>();
       Students.add("Shiva");
       Students.add("claire");
       Students.add("Ludo");
       Students.add("manny");
       Students.add("Eathon");
       Students.add("Davin");

       //as thoings get added it tries to figure out the correct priority using the compareTo method
       //the higher vlaue in response to the compareTo method will be lower on the list
       //the lowre value has a higher priority for things 
       //the item with the next lwoest vlaue will be moved to the front of the queue
       while(!Students.isEmpty())
       {
        System.out.println(Students.remove());//the names that start with a lesser vlaure will be removed first 
       }
    }
}
