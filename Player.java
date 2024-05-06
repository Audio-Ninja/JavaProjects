import java.util.ArrayList;

public class Player {
    ArrayList<Integer> handValues = new ArrayList<Integer>();
    ArrayList<String> handSuits = new ArrayList<String>();
    String name;

    public Player (String name) {
        this.name = name;
    }

    public void showHand() {
        System.out.println(name + "'s hand is:");
        System.out.print("[");
        for(int i = 0; i < handValues.size(); i++) {
            String face;
            if(handValues.get(i) == 11) {
                face = "Jack";
            } else if(handValues.get(i) == 12) {
                face = "Queen";
            } else if(handValues.get(i) == 13) {
                face = "King";
            } else if(handValues.get(i) == 14) {
                face = "Ace";
            } else {
                face = Integer.toString(handValues.get(i));
            }
            System.out.print(face + " of " + handSuits.get(i));
            if(i != handValues.size() - 1) {
                System.out.print(", ");
            }    
        }
        System.out.println("]");
    }

    public String calculatePoints() {
        //Calculate the highest and lowest card in the player's hand:
        int highest = 0;
        int lowest = 15;
        String val = "";
        for(int i = 0; i < handValues.size(); i++) {
            if(handValues.get(i) > highest) {
                highest = handValues.get(i);
            }
            if(handValues.get(i) < lowest) {
                lowest = handValues.get(i);
            }
        }
        //Check for a flush in general
        if(handSuits.get(0) == handSuits.get(1) && handSuits.get(1) == handSuits.get(2) && 
        handSuits.get(2) == handSuits.get(3) && handSuits.get(3) == handSuits.get(4)) {
            //If it is a flush, check for a royal flush
            byte counter = 0;
            for(int i = 0; i < handValues.size(); i++) {
                if(handValues.get(i) == 10 || handValues.get(i) == 11 || handValues.get(i) == 12 ||
                handValues.get(i) == 13 || handValues.get(i) == 14) {
                    counter++;
                }
            }
            if(counter == 5) {
                val = "0" + highest; //This is for a royal flush
                return val;
            } else if(highest - lowest == 4) { //Check for a straight flush
                val = "1" + highest;
                return val;
            } else {
                val = "4" + highest; //If not a royal or straight flush, it is a normal flush.
                return val;
            }
        }
        //Check for pairs
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        for(int i = 0; i < handValues.size(); i++) {
            int matches = 0;
            for(int x = 0; x < handValues.size(); x++) {
                if(handValues.get(i) == handValues.get(x)) {
                    matches++;
                }
            }
            pairs.add(matches);
        }
        int twos = 0;
        int threes = 0;
        for(int i = 0; i < pairs.size(); i++) {
            if(pairs.get(i) == 4) {
                val = "2" + highest;
                return val;
            }
            if(pairs.get(i) == 3) {
                threes = 1;
            }
            if(pairs.get(i) == 2) {
                twos++;
            }
        }
        if(twos == 2) {
            if(threes == 1) {
                val = "3" + highest;
                return val;
            } else {
                val = "8" + highest;
                return val;
            }
        } else if(twos == 4) {
            val = "7" + highest;
            return val;
        } else if(threes == 1) {
            val = "6" + highest;
            return val;
        }
        //Check for a straight
        if(highest - lowest == 4) {
            val = "5" + highest;
            return val;
        }
        val = "9" + highest;
        return val;
    }
}
