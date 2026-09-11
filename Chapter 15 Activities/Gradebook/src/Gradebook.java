import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String, String> gradebook = new HashMap<>();
        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q")){
                done = true;

            } else if (input.equals("A")){
               System.out.println("Insert a name: ");
               String name = in.next();
               System.out.println("Insert a grade: ");
               String grade = in.next();
               gradebook.put(name, grade);


            } else if (input.equals("R")){
                System.out.println("Insert a name: ");
                String name = in.next();
                gradebook.remove(name);

            } else if (input.equals("M")){
               System.out.println("Insert a name: ");
               String name = in.next();
               System.out.println("Insert a grade: ");
               String grade = in.next();
               gradebook.put(name, grade);
                
            } else if (input.equalsIgnoreCase("P")){
                for(String name: gradebook.keySet())
                {
                    System.out.println(name + ", " + gradebook.get(name));
                }
            } else{
                done = true;
            }
        }
    }
}