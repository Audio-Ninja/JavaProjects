public class Drink {
    int ounces; //The current number of ounces of the drink
    String name; //What the drink is called
    public Drink(int ounces, String name) { //Drink constructor
        this.ounces = ounces;
        this.name = name;
    }
    //A method to see how many calories are in the drink.
    public int getOunces() {
        return ounces;
    }
    //A method to take a sip of the drink, reducing its ounces by a set amount.
    public void takeSip(int amount) {
        //Only take a sip if the drink isn't empty, so it has some ounces left.
        if(ounces > 0) {
            ounces-= amount;
            //You cannot drink more than the drink contains, so we must check for that.
            if(ounces < 0) {
                //Set the amount sipped to not be greater than the amount in the drink.
                amount += ounces;
                //The amount of ounces cannot be negative, so we set it to zero if it is.
                ounces = 0;
            }
            System.out.println(amount + " ounces was sipped from the " + name);
        }
        //If the drink has no ounces, print that it is empty.
        if(ounces == 0) {
            System.out.println("The drink " + name + " is now empty");
        }
    }
    //Prints the drink name and current number of ounces onto the screen.
    public void print() {
        System.out.println("The drink " + name + " currenty contains " + ounces + " ounces");
    }
}