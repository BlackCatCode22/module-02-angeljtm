import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a, b, c;
        System.out.println("Largest of three integers");
        System.out.println("______________________________");

        System.out.print("Enter 1st int: "); //get 1st int, save to a
        a = myObj.nextInt();

        System.out.print("Enter 2nd int: ");  //get 2nd int, save to b
        b = myObj.nextInt();

        System.out.print("Enter 3rd int: ");  //get 3rd int, save to c
        c = myObj.nextInt();

        if (a == b && b == c) { //checks to see if all of them are equal
            System.out.println( "All integers entered are set to " + a);
        } else if (b > a && b > c) {  // if b is larger than both a and c, then it's the largest
            System.out.println( b + " is the largest int.");
        }  else if (a > c) { // since b isn't the largest check a with c
        System.out.println( a + " is the largest int.");
        } else { // since a was not greater than c, c is the largest
            System.out.println( c + " is the largest int.");
        }

        /* I find using compound test statements was easier for me to understand
        because I can read the conditions in one line 
         */

    }
}
