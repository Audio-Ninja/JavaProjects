/*
This project will add the numbers 1-100 into an array, then print the numbers in that array and state whether 
each value is even or odd. Finally, at the bottom, it will print the sum of all the numbers in the array.
*/
public class ArrayLoop {
    public static void main(String[] args) {
        //Setting up variables and arrays:
        int[] numbers = new int[100];
        short sum = 0;
        String type = "";
        //Fill the list with the numbers 1-100.
        for(byte n = 0; n < numbers.length; n++) {
            numbers[n] = n + 1;
        }
        //Print the list and determine even and odd numbers.
        for(int i : numbers) {
            //if the remainder of the number after division by 2 is 0, it's an even number. If not, it's odd.
            if(i % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            //Prints the current number and states whether it is even or odd.
            System.out.println(i + ": " + type);
            //Adds the current number to the sum variable.
            sum += i;
        }
        //Now print the sum of all the numbers.
        System.out.println("The sum of numbers 1-100 is " + sum);
    }
}