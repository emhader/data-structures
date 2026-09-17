import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //create a print queue of strings (using a linked list)
            Queue<String> jobs = new LinkedList<>();
            jobs.add("Jason: Quarter 2 Expense report");
            jobs.add("Evan: Recipe for banana bread");
            jobs.add("Emily:Top Secreat Document");

            System.out.println("Printing jobs: " + jobs.remove());//Jason: Quarter 2 Expense report

            //add some more
            jobs.add("Noah: grocery list");
            jobs.add("Emily: really top secret documents");
            jobs.add("Emily: Can i get fired for this?");
            System.out.println("Printing jobs: " +  jobs.remove());//Evan: Recipe for banana bread
            System.out.println("Printing jobs: " +  jobs.remove());//Emily: Top Secreat Document

            jobs.add("Boss: Emily,s termination letter");

            //prints out and remove the rest of them

            //while loop
            while(!jobs.isEmpty())
            {
                System.out.println("Printing jobs: " +  jobs.remove());
            }
            
            //for loop
           /*
           for(int i = 0; i < jobs.size(); i++)
            {
                System.out.println("Printing jobs: " +  jobs.remove());
            }
           */

            //create a todo list
            //the workOrder class has an int priority and a strign description
            Queue<WorkOrder> toDo = new LinkedList<>();

            //lower priorroty is considered more important
            toDo.add(new WorkOrder(3, "Water the plamntrs"));
            toDo.add(new WorkOrder(2, "Eat dinner"));
            toDo.add(new WorkOrder(1, "Conque World"));
            toDo.add(new WorkOrder(9, "Play Videogames"));
            toDo.add(new WorkOrder(1, "Stdy for chapter 15 test in sweing"));
            
            //objects are NOT stored in priority order
            System.out.println(toDo);

            //objects will be removed in priority order
            while(!toDo.isEmpty())
            {
                System.out.println(toDo.remove());
            }

    }
}
