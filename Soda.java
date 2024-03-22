public class Soda extends Drink {
    String brand; //The brand of the soda
    int sugar; //Grams of sugar in the soda
    public Soda(int ounces, String brand, String name, int sugar) { //Soda constuctor
        super(ounces, name); //Gets the ounce and name attributes from its parent class.
        this.brand = brand;
        this.sugar = sugar;
    }
    //Refills the soda by setting the ounces to its original number.
    int startingOunces = ounces;
    public void refill() {
        ounces = startingOunces;
        System.out.println("The soda " + name + " was refilled");
    }
    //Prints the soda name, brand, and current number of ounces onto the screen.
    public void print() {
        System.out.println("The soda " + name + " of the brand " + brand + " has " + sugar + " grams of sugar amd currenty contains " + ounces + " ounces");
    }
}