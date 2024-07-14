package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private final int DECK_SIZE = 52; // Initializing deck size.
	private List<Card> cards; //#1bi1 Here is our List of Card. This code was attempted.
	cards = new Card[DECK_SIZE];
	String suits[] = {"spades", "hearts", "clovers", "diamonds"};
	String numbers[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};
	
	int cardIndex = 0;
	for (String suit : suits) { //#1bii3 Here the Cards field is populated with 52 cards. This code was attempted.
		for (String number : numbers) {
			numbers[cardIndex] = new Card(suit, number);
			cardIndex++;
		}
	}
	
	public void shuffle() { //#1bii1 Here is our shuffle method. This code was attempted.
		Collections.shuffle(cards);
	}
	
	public Card draw() { //#1bii2 Here is our draw method. This code was attempted.
		return cards.remove(0);
	}
}
