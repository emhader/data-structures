import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Tony");
        staff.addLast("Steve");
        staff.addLast( "Wanda");
        staff.addLast("Dr. Strange");

        System.out.println(staff);
        //the list is currently Tony Steve Wanda and DR Strange (TSWD)


        /*
            The list iterator method creates a new list iterator
            that is posityioned at the head (beginging) of the list 
            The | symbol is used to represent the interator position
         */
        ListIterator<String> iterator = staff.listIterator(); //|TSWD


        //The next method advanced the iterator over the next element in the list 
        iterator.next(); //T|SWD


        // the next method also returns the element the iterator passes over last
        String avenger = iterator.next(); //TS|WD
        System.out.println(avenger); //Steve is printed


        //inserts after the iterator position
        //the iterator is then positioned after the inserted element
        iterator.add( "Natasha"); 
        iterator.add( "Bruce");
        System.out.println(staff);


        /* 
            Remove the last element returned by next or previous
            The remove method CAN ONLY be called after calling next or previous
            The remeove method CANNOT be called twice in a row or after calling add
         */
        iterator.next();// TSNBW|D
        iterator.remove(); // Wanda is removed
        System.out.println(staff);


        /*
            The set method updates the last element returned by next or previous
            The set method CANNOT be called after calling add or remove
         */
        iterator.previous(); // TSN|BD
        iterator.set("Challa"); // Bruce is replaced with Challa because the itorator passed over bruce last
        System.out.println(staff);


        /*
            The hasNext method is used to determine if there is a next node
            after the interator. The hasNext method is often used in the condition of a while loop
            The hasNext method returns true if there is a next node and false if there is not
         */
        iterator = staff.listIterator(); //|TSNC (Returns the iterator positioned at the head of the list)
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Natasha")) //TSN|TD
            {
                iterator.remove();// TD|TD
            }
        }
        System.out.println(staff); //TSTD|


        /*
            Enhanced for loops work with linked lists
            The Enhcanced for loops automatically creates an iterator
         */
        for(String n : staff)
        {
            System.out.println(n +" ");
        }


        /*
            You cannot modify a linked list using an iterator
            UNLESS you use the interator to do the modification
            trying to modify the linked list using the linked list methods will result in a ConcurrentModificationException
         */
        iterator = staff.listIterator(); //|TSTD
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Tony"))
            {
                //staff.remove("Tony)"); ConcurrentModificationException 
                //iterator.remove(); //Tony is removed
            }
        }

        for(String n : staff)
        {
            if(n.equals("Tony"))
            {//trying to modify the list while interating through it
               //staff.add("Peter"); //ConcurrentModificationException
               //iterator.add("Peter"); //Peter is added after Tony
            }
        }
    }
}