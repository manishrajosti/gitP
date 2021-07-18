//Program to illustrate properties of Set
/**
 * <h1>UseSet Class</h1>
 * The UseSet class illustrates properties of Set and TreeSet
 *
 * @author manishrajosti
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UseSet {
    public static void main(String[] args) {

        //Created new Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence:");

        //takes users input and stores in string variable line
        String line = sc.nextLine();

        System.out.println(">> Here's what your input is:\n--> " + line);
        System.out.print("\n>> Sorted and ascending order output:\n--> ");

        //Created new Set Object
        Set<String> stringSet  = new TreeSet<>();

        //splits the user sentence and adds in stringSet and converts it into lowercase
        for (String words:
             line.split(" ")) {
            stringSet.add(words.toLowerCase());
        }

        //prints out the words of stringSet
        for (String output:
             stringSet) {
            System.out.print(output + " ");

        }
    }
}
