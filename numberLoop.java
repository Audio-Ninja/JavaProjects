public class numberLoop {
    public static void main(String[] args) {
        int sum = 0;
        String type = "";
        for(int i = 1; i < 101; i++) {
            if(i % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            sum += i;
            System.out.println(i + ": " + type);
        }
        System.out.println("The sum of numbers 1-100 is " + sum);
    }
}
