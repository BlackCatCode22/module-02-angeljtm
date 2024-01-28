import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence and watch it become reversed: ");
        String userInput = scanner.nextLine();    //gets sentence that wants to be reversed
        System.out.print('\n');

        String reversed = "";  //create string for the new sentence that will be created

        for(int i = userInput.length()-1; i >= 0; i--){   //start at the end of userInput, work towards the beginning adding each character into new String
            reversed += userInput.charAt(i);
        }

        System.out.print("The sentece in reverse is: ");
        System.out.print(reversed+ '\n');
    }
}
