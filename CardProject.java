//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

import java.util.ArrayList;

public class CardProject {
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
        name = (int)(Math.random() * names.size());
        Player player1 = new Player(names.get(name));
        names.remove(name);
        name = (int)(Math.random() * names.size());
        Player player2 = new Player(names.get(name));
        names.remove(name);
        name = (int)(Math.random() * names.size());
        Player player3 = new Player(names.get(name));
        names.remove(name);
        name = (int)(Math.random() * names.size());
        Player player4 = new Player(names.get(name));
        names.remove(name);
        name = (int)(Math.random() * names.size());
        Player player5 = new Player(names.get(name));
        names.remove(name);

        System.out.println("And so the card game begins...");
        System.out.println();
        System.out.println(dealer.name + " is the Dealer");

        dealer.shuffle(values, suits);

        dealer.deal(values, suits, dealer);
        dealer.deal(values, suits, player1);
        dealer.deal(values, suits, player2);
        dealer.deal(values, suits, player3);
        dealer.deal(values, suits, player4);
        dealer.deal(values, suits, player5);
        
        System.out.println(dealer.name + " deals five cards to each player.");
        System.out.println();

        System.out.println("The cards of each player:");
        System.out.println();

        dealer.showHand();
        player1.showHand();
        player2.showHand();
        player3.showHand();
        player4.showHand();
        player5.showHand();

        String dealerScore = dealer.calculatePoints();
        String player1Score = player1.calculatePoints();
        String player2Score = player2.calculatePoints();
        String player3Score = player3.calculatePoints();
        String player4Score = player4.calculatePoints();
        String player5Score = player5.calculatePoints();
        
        //With the scores calculated, we can now check who won.
        
        int highestScore = Integer.parseInt(dealerScore.substring(0,1));
        if(Integer.parseInt(player1Score.substring(0,1)) > highestScore) {
            highestScore = Integer.parseInt(player1Score.substring(0,1));
        }
        

        System.out.println();
        System.out.println("The Winner is:");
        System.out.println();
    }
}