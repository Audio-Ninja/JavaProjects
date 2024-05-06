//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

import java.util.ArrayList;

public class CardProject {
    static String calculateWinner(ArrayList<String> scores, Dealer theDealer, ArrayList<Player> thePlayers) {
        int highestScore = Integer.parseInt(scores.get(0).substring(0, 1));
        int highIndex = 0;
        for(int i = 1; i < scores.size(); i++) {
            if(Integer.parseInt(scores.get(i).substring(0, 1)) < highestScore) {
                highestScore = Integer.parseInt(scores.get(i).substring(0, 1));
                highIndex = i;
            }
        }
        int counter = 0;
        for(int i = 0; i < scores.size(); i++) {
            if(highestScore == Integer.parseInt(scores.get(i).substring(0, 1))) {
                counter++;
            } else {
                scores.set(i, "90");
            }
        }
        if(counter == 1) {
            if(highIndex == 0) {
                return theDealer.name;
            } else {
                return thePlayers.get(highIndex - 1).name;
            }
        } else {
            int highestCard = Integer.parseInt(scores.get(0).substring(1));
            int highCardIndex = 0;
            for(int i = 1; i < scores.size(); i++) {
                if(Integer.parseInt(scores.get(i).substring(1)) > highestCard) {
                    highestCard = Integer.parseInt(scores.get(i).substring(1));
                    highCardIndex = i;
                }
            }
            counter = 0;
            for(int i = 0; i < scores.size(); i++) {
                if(highestCard == Integer.parseInt(scores.get(i).substring(1))) {
                    counter++;
                } else {
                    scores.set(i, "90");
                }
            }
            if(counter == 1) {
                if(highCardIndex == 0) {
                    return theDealer.name;
                } else {
                    return thePlayers.get(highCardIndex - 1).name;
                }
            } else {
                int winners = 0;
                for(int i = 0; i < scores.size(); i++) {
                    if(scores.get(i) != "90") {
                        winners++;
                    }
                }
                String winner = "";
                int currentWinner = 0;
                for(int i = 0; i < scores.size(); i++) {
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
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> suits = new ArrayList<String>();

        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Hearts");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Diamonds");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Clubs");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Spades");
        }

        ArrayList<String> names = new ArrayList<String>();
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

        int name = (int)(Math.random() * names.size());
        Dealer dealer = new Dealer(names.get(name));
        names.remove(name);

        ArrayList<Player> players = new ArrayList<Player>();
        for(byte i = 0; i < 5; i++) {
            name = (int)(Math.random() * names.size());  
            players.add(new Player(names.get(name)));
            names.remove(name);
        }

        System.out.println("And so the card game begins...");
        System.out.println();
        System.out.println(dealer.name + " is the Dealer");

        dealer.shuffle(values, suits);

        dealer.deal(values, suits, dealer);
        for(int i = 0; i < players.size(); i++) {
            dealer.deal(values, suits, players.get(i));
        }
        
        System.out.println(dealer.name + " deals five cards to each player.");
        System.out.println();

        System.out.println("The cards of each player:");
        System.out.println();

        dealer.showHand();
        for(int i = 0; i < players.size(); i++) {
            players.get(i).showHand();
        }

        ArrayList<String> points = new ArrayList<String>();
        points.add(dealer.calculatePoints());
        for(int i = 0; i < players.size(); i++) {
            points.add(players.get(i).calculatePoints());
        }

        System.out.println();
        System.out.println(points);
        
        //With the scores calculated and put into an array, we can now check who won.

        System.out.println();
        System.out.println("The Winner is...");
        System.out.println();
        System.out.println(calculateWinner(points, dealer, players) + "!");
    }
}