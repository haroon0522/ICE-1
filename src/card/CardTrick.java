import java.util.Scanner;
import card.Card; // Import the Card class from the card package

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 3 + 0)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value: ");
        int value = scanner.nextInt();

        System.out.print("Enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
        String suit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    // Add the hardcoded luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Diamonds");

        System.out.println("The lucky card is: " + luckyCard.getSuit() + " " + luckyCard.getValue());
 }
}
