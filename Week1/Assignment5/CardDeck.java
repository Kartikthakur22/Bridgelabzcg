package Week1.Assignment5;

import java.util.*;

public class CardDeck {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("The deck cannot be evenly distributed.");
            return null;
        }
        
        String[][] players = new String[x][n / x];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n / x; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();

        String[][] players = distributeCards(deck, n, x);
        
        if (players != null) {
            printPlayersCards(players);
        }

        scanner.close();
    }
}
