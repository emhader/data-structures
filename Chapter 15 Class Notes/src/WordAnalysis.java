import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {                                            
        //Determine the current working directery
        //System.out.println(System.getProperty("user.dir")); //SoftwareEngeneering\data-structures

                //Dictonary Words
        Set<String> dicWords = readWords("Chapter 15 Class Notes/src/words"); //words is the text file

                //Novel Words
        Set<String> NWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt"); //words.txt is the text file

        //print all the worrds in the novel that are not in the dictionary
        for(String words : NWords)
        {   //if the dictanary words does not contain the novel words then print the novel words
            if(!dicWords.contains(words))
            {
                System.out.println(words);
            }
        }

        //prints out the number of unique words in the novel
        System.out.println("There are "+NWords.size()+" unique words in the novel.");

        //print the number of unique words with more than 3 letters
        Iterator<String> iter = NWords.iterator();
        
       while(iter.hasNext())
       {
            if(iter.next().length() <= 3)
            {
                iter.remove();
            }
       }
       System.out.println("There are "+NWords.size()+" unique words with more than 3 lettersin the novel.");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        //Use a hash set instead of a tree set because the order dosent matter
        Set<String> words = new HashSet<>();
        Scanner scanner = new Scanner(new File(filename), ("UTF-8"));

        //use any character thats not a letter to seporate words (a delimiter)
        scanner.useDelimiter("[^a-zA-Z]+");//anything that is not a letter will be a delimiter
        
        //while loop to read all the words in the file and add them to the hash set
        while(scanner.hasNext())
        {
            words.add(scanner.next().toLowerCase());
        }

        scanner.close();

        return words;
    }
}
