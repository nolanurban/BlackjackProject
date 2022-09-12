package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> hand;
	
	public Hand() {
		hand = new ArrayList<>(); // creates a Hand list
	}
	public void addCard(Card card) {
		hand.add(card);
	}
	public void clear() {
		
	}
	public abstract int getHandValue(); // will be implemented in blackjackhand()
	@Override
	public String toString() {
		String str = "";
		for (Card card : hand)
			str += "\n" + card.getValue() + " of " + card.getSuit() + "\n";
		return str;
	}
	
	public List<Card> getAllCards() {
		return hand;
	}
	
	
}
