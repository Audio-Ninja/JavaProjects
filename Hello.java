public class Hello {
    public static void main(String[] args) {
    	String hey = "Hey World!";
        String name = "Alma Stevens";
        byte age = 17;
        String[] family = {"Adam","Cosette","Noah","LaNae","Makayla","David"};
        System.out.println(hey);
        System.out.println("My name is " + name + ", and I am " + age + " years old");
        System.out.println("I have two parents:");
        for (String i : family) {
        	if (i == "Noah") {
            	System.out.println("I have four siblings, two younger and two older:");
            }
        	System.out.println(i + " Stevens");
        }
    }
}
