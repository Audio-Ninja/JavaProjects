//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

/* 
This project is a simulated card game of poker. A standard deck of 52 cards is shuffled and dealt by a dealer to the other five players. The player
with the best hand wins. If there is a tie for the best hand, the one with the highest card wins. If there is a tie for both, there are multiple winners.
 */

import java.util.ArrayList; //Allows ArrayLists to be used for list size flexibility.

public class CardProject {
    //This large method returns the winner of the game based on a list of each player's hands.
    static String calculateWinner(ArrayList<String> scores, Dealer theDealer, ArrayList<Player> thePlayers) {
        int highestScore = Integer.parseInt(scores.get(0).substring(0, 1));
        int highIndex = 0;
        for(int i = 1; i < scores.size(); i++) { //Finds which player has the best hand.
            if(Integer.parseInt(scores.get(i).substring(0, 1)) < highestScore) {
                highestScore = Integer.parseInt(scores.get(i).substring(0, 1));
                highIndex = i;
            }
        }
        int counter = 0;
        for(int i = 0; i < scores.size(); i++) { //Sees how many players have that same best hand.
            if(highestScore == Integer.parseInt(scores.get(i).substring(0, 1))) {
                counter++;
            } else {
                scores.set(i, "90"); //If they don't have one of the best hands, this will prevent them from winning with the highest card.
            }
        }
        if(counter == 1) {
            if(highIndex == 0) { //If no other player has that best hand, they are the winner!
                return theDealer.name; 
            } else {
                return thePlayers.get(highIndex - 1).name;
            }
        } else { //If multiple players have the best hand, the one with the highest card wins.
            int highestCard = Integer.parseInt(scores.get(0).substring(1));
            int highCardIndex = 0;
            for(int i = 1; i < scores.size(); i++) {
                if(Integer.parseInt(scores.get(i).substring(1)) > highestCard) {
                    highestCard = Integer.parseInt(scores.get(i).substring(1));
                    highCardIndex = i;
                }
            }
            counter = 0;
            for(int i = 0; i < scores.size(); i++) { //Sees how many players have that same highest card.
                if(highestCard == Integer.parseInt(scores.get(i).substring(1))) {
                    counter++;
                } else {
                    scores.set(i, "90");
                }
            }
            if(counter == 1) { //If no other player has that highest card, they are the winner!
                if(highCardIndex == 0) {
                    return theDealer.name; 
                } else {
                    return thePlayers.get(highCardIndex - 1).name;
                }
            } else { //If multiple players have the same best hand and highest card, the are all winners.
                int winners = 0;
                for(int i = 0; i < scores.size(); i++) { //Finds how many of the players are winners.
                    if(scores.get(i) != "90") {
                        winners++;
                    }
                }
                String winner = "";
                int currentWinner = 0;
                for(int i = 0; i < scores.size(); i++) { //Adds the winners to a string.
                    if(scores.get(i) != "90") {
                        currentWinner++;
                        if(i == 0) {
                            winner += theDealer.name;
                        } else {
                            winner += thePlayers.get(i - 1).name;
                        }
                        if(currentWinner == winners - 1) {
                            winner += " and ";
                        } else if(currentWinner < winners - 1) {
                            winner += ", ";
                        }    
                    }
                }
                return winner;
            }
        }
    }
    public static void main(String[] args) { //Runs the main code.
        ArrayList<Integer> values = new ArrayList<Integer>(); //List for the value (face) of each card.
        ArrayList<String> suits = new ArrayList<String>(); //List for the suit of each card.

        for(int i = 2; i < 15; i++) { //Creates all the cards of the Hearts suit.
            values.add(i);
            suits.add("Hearts");
        }
        for(int i = 2; i < 15; i++) { //Creates all the cards of the Diamonds suit.
            values.add(i);
            suits.add("Diamonds");
        }
        for(int i = 2; i < 15; i++) { //Creates all the cards of the Clubs suit.
            values.add(i);
            suits.add("Clubs");
        }
        for(int i = 2; i < 15; i++) { //Creates all the cards of the Spades suit.
            values.add(i);
            suits.add("Spades");
        }

        ArrayList<String> names = new ArrayList<String>(); //A list for some random player names.
        names.add("Daniel");
        names.add("Payton");
        names.add("Samantha");
        names.add("Jerry");
        names.add("Ariel");
        names.add("Olivia");
        names.add("Liam");
        names.add("Lucy");
        names.add("Hyrum");
        names.add("Katherine");
        names.add("Samson");
        names.add("Maria");

        //Creates the dealer and gives them a random name.
        int name = (int)(Math.random() * names.size());
        Dealer dealer = new Dealer(names.get(name));
        names.remove(name);
        
        //Creates all other players and gives them random names.
        ArrayList<Player> players = new ArrayList<Player>();
        for(byte i = 0; i < 5; i++) {
            name = (int)(Math.random() * names.size());  
            players.add(new Player(names.get(name)));
            names.remove(name);
        }

        System.out.println("And so the card game begins...");
        System.out.println();
        System.out.println(dealer.name + " is the Dealer");

        dealer.shuffle(values, suits); //Shuffles the deck so the results are randomized.

        dealer.deal(values, suits, dealer); //The dealer deals to themself.
        for(int i = 0; i < players.size(); i++) { //The dealer deals to each player.
            dealer.deal(values, suits, players.get(i));
        }
        
        System.out.println(dealer.name + " deals five cards to each player.");
        System.out.println();

        System.out.println("The cards of each player:");
        System.out.println();

        dealer.showHand(); //The dealer and each player will print the cards they have.
        for(int i = 0; i < players.size(); i++) {
            players.get(i).showHand();
        }

        //Finds the points of each player's hand using the Player class function calculatePoints().
        ArrayList<String> points = new ArrayList<String>();
        points.add(dealer.calculatePoints());
        for(int i = 0; i < players.size(); i++) {
            points.add(players.get(i).calculatePoints());
        }
        
        //With the scores calculated and put into an array, we can now check and display who won.
        System.out.println();
        System.out.println("The Winner is...");
        System.out.println();
        System.out.println(calculateWinner(points, dealer, players) + "!");
    }
}