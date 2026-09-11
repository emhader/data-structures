import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {   //Map interface is generic First type is the key, second is the value
        Map<String, Color> favColors = new HashMap<>();

        //add elements to the map usign the put method
        favColors.put("jason", Color.BLUE);
        favColors.put("Emily", Color.RED);
        favColors.put("Evan", Color.GREEN);
        favColors.put("Eathon", Color.GREEN);
        
         //same key can not have to different values
        favColors.put("Emily", Color.ORANGE); //this will replace the previous value for Emily

        //Create a set of the keys in the map
        Set<String> keys = favColors.keySet();
        for(String key : keys)
        {
            //                [name]   (      [HashCode]      ) :        Color
            System.out.println(key + " (" + key.hashCode() + ") : " + favColors.get(key));
                
        }
    }
}
