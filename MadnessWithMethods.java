import java.util.Scanner;
public class MadnessWithMethods {
    public static int getAnIntFromTheUser(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = myObj.nextInt();
        return userInt;
    }

    public static int compareTwoInts(int a, int b){
        if(a < b)
            return b;
        else return a;
    }

    public static int sumTwoInts(int a, int b){
       return a+b;
    }

    public static void main(String[] args) {

        getAnIntFromTheUser();

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int a = myObj.nextInt();
        System.out.print("Enter integer B: ");
        int b = myObj.nextInt();

        System.out.println("The larger of the two integers is: " + compareTwoInts(a,b));
        System.out.println("The sum of the two integers is: " + sumTwoInts(a,b));

    }
}
