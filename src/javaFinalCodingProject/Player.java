package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand; //1ci1 Here is our hand field. This code was attempted.
	private int score; //#1ci2 Here is our score field. This code was attempted.
	private String name; //#1ci3 Here is our name field. This code was attempted.
	
	public void describe() { //#1cii1 Here is our describe method. This code was attempted.
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() { //#1cii2 Here is our flip method. This code was attempted.
		return hand.remove(0);
	}
	
	public void draw(Deck deck) { //#1cii3 Here is our draw method. This code was attempted.
		hand.add(deck.draw());
	}
	
	public void incrementScore() { //#1cii4 Here is our increment score method. This code was attempted.
		score++;
	}

}
