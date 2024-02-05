/*
This Project contains a loop that will run through the numbers 1-100 and determine if each number is even or odd.
The result for each number will be printed out, and then at the bottom, the sum of all the numbers 1-100 will be displayed.
*/
public class numberLoop {
    public static void main(String[] args) {
        //Setting up variables:
        int sum = 0;
        String type = "";
        //The loop is set to start on 1 and repeat until it reaches 101.
        for(int i = 1; i < 101; i++) {
            /*
            The modulus operator determines the remainder after a division problem.
            So "i % 2" checks what the remainder of each number is when it is divided by 2.
            */
            if(i % 2 == 0) {
                //If the remainder is zero, it's an even number.
                type = "even";
            } else {
                //If it isn't even, it has to be odd.
                type = "odd";
            }
            //This adds the current number in the loop to the sum variable.
            sum += i;
            //This prints the current number into a new line and states whether it is even or odd.
            System.out.println(i + ": " + type);
        }
        //Finally, after the loop, it prints a new line showing the sum of the numbers 1-100.
        System.out.println("The sum of numbers 1-100 is " + sum);
    }
}