public class Milk extends Drink {
    double fatPercentage; //The fatpercentage by weight in the milk
    public Milk(int ounces, String name,  double fatPercentage) { //Milk constuctor
        super(ounces, name); //Gets the ounce and name attributes from its parent class.
        this.fatPercentage = fatPercentage;
    }
    //Used to get the Fat Percentage of the milk
    public double getFatPercentage() {
        return fatPercentage;
    }
    //Skimming the milk will remove all fat from it, so it sets the fat percentage to zero.
    public void skim() {
        fatPercentage = 0.0;
        System.out.println("The milk " + name + " was skimmed");
    }
    ////Prints the milk name, type, fat percentage, and current number of ounces onto the screen.
    public void print() {
        System.out.println("The milk " + name + " has a fat percentage of " + fatPercentage + " and currenty contains " + ounces + " ounces");
    }
}