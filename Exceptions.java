//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross
/*
This project will perform two errors and use try-catch to prevent the program from crashing. First, the program
will create a list and try to access an index in the list that does not exist. Next, the program will divide the
variable x by 0. Both of these will cause an error, but the try-catch around each prevents them from crashing.
*/
public class Exceptions {
    //Runs the code.
    public static void main(String[] args) {
        String[] inventory = {"Stick", "Apple", "Axe", "Wood"};
        try { //Checks the code inside for an error.
            System.out.println(inventory[4]); //Tries to access the index 4 in the array inventory.
        } catch(ArrayIndexOutOfBoundsException e) { //Checks if the index is out of the array's bounds.
            System.out.println("Error caught. Array index is out of bounds."); //If it catches this error, it displays a message.
        }
        byte x = 14;
        try { //Checks the code inside for an error.
            System.out.println(x / 0); //Tries to divide the variable x by 0.
        } catch(ArithmeticException e) { //Checks for an arithmetic exception specifically.
            System.out.println("Error caught. Math equation is not possible."); //If it catches this error, it displays a message.
        }
    }
}
