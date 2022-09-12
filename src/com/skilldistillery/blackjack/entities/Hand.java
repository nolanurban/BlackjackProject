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
			str += card.getValue() + " of " + card.getSuit() + " ";
		return str;
	}
	
	public List<Card> getAllCards() {
		return hand;
	}
	
	
}
