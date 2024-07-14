package javaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck(); //#2a Here is our deck instantiated. This code was attempted.
		Player player1 = new Player("Player 1"); //#2a Here is player 1 instantiated. This code was attempted.
		Player player2 = new Player("Player 2"); //#2a Here is player 2 instantiated. This code was attempted.
		
		deck.shuffle(); //#2a Here is the shuffle method being called. This code was attempted.
		
		for (int i = 0; i < 52; i++) { //#2b Here is our for loop. This code was attempted.
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) { //#2c Here is our other for loop. This code was attempted.
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 gets a point");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 gets a point");
			} else {
				System.out.println("No point awarded");
			}
		}
		
		System.out.println("Final score: Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore()); //#2de Here is the final score comparison and the final scores. This code was attempted.
		
		if (player1.getScore() > player2.getScore()) { 
			System.out.println("Player 1 wins");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins");
		} else {
			System.out.println("Draw");
		}

	}

}
