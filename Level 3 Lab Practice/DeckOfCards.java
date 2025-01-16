import java.util.Scanner;

public class DeckOfCards {
    
    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
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

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cannot evenly distribute cards among players.");
            return null;
        }
        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        return players;
    }

    // Method to print the cards of each player
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Suits and Ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);
        System.out.println("Deck initialized successfully.");

        // Shuffle the deck
        shuffleDeck(deck);
        System.out.println("Deck shuffled successfully.");

        // Input number of players and cards
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards to distribute: ");
        int numOfCards = scanner.nextInt();

        // Distribute cards to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        if (players != null) {
            System.out.println("Cards distributed successfully.\n");
            // Print each player's cards
            printPlayersCards(players);
        }
    }
}
