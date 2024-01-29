import java.util.Scanner;
public class MadnessWithMethods {
    public static int getAnIntFromTheUser(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter an integer: "); // asking for int
        int userInt = myObj.nextInt();
        return userInt; //return int
    }

    public static int compareTwoInts(int a, int b){
        if(a < b)  //if b is greater, it returns b
            return b;
        else return a; //if b isn't larger, return a
    }

    public static int sumTwoInts(int a, int b){
       return a+b; //adds the two ints together
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
