public class Horse {
    String name; //current name of the horse
    int birthYear; //what year the horse was born
    String prevNames; //array of previous names of the horse (if any)
    public Horse(String horseName, int year) { //the horse constructor for the name and birth year
        this.name = horseName;
        this.birthYear = year;
    }
    
    //this method is used to print the name and birth year of a horse
    public String toString() {
        return "The horse " + this.name + " was born in the year " + this.birthYear;
    }

    public static void main(String[] args) { 
        //uses the horse object for a few different horses
        Horse spice = new Horse("Spice", 2001);
        Horse nick = new Horse("Nick",2006);
        Horse misty = new Horse("Misty", 2014);

        //print the name and birth year of each horse using the toString() method
        System.out.println(spice.toString());
        System.out.println(nick.toString());
        System.out.println(misty.toString());
    }
}