import java.util.Random;

public class CardGame {
    
    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Total number of cards
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;

        // Create the deck by combining ranks and suits
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();

        // Shuffle the deck using Fisher-Yates shuffle algorithm
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            // Swap current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute n cards to x number of players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        // Check if the cards can be distributed equally
        if (n * x > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }

        String[][] playersCards = new String[x][n];
        int index = 0;

        // Distribute the cards
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                playersCards[i][j] = deck[index++];
            }
        }
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;  
        int x = 4;  
        
        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute cards to players
        String[][] playersCards = distributeCards(deck, n, x);

        // Print the players and their cards
        printPlayersCards(playersCards);
    }
}
