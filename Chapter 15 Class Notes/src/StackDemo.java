import java.util.Stack;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        //stack initialization
        Stack<String> commands = new Stack<>();

        //pushing commands into the stack
        commands.push("Insert: 'hello'");
        commands.push("Insert: ','");
        commands.push("Insert: ' '");
        commands.push("Insert: 'world'");
        commands.push("Insert: '?'");
        commands.push("Delete: '?'");
        commands.push("Insert: '!'");

        //prints out the stack
        System.out.println(commands);

        //Simutlae the user pressing undo 4 times
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Undoing: "  + commands.pop());
        }

        System.out.println(commands);
    }
}
