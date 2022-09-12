package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Card;

public abstract class Participant {

	protected BlackjackHand hand;
	public Participant() {
		hand = new BlackjackHand();
	}
	public boolean isBust() {
		return hand.isBust();
	}

	public void addCard(Card card) {
		hand.addCard(card);
	}
	@Override
	public String toString() {
		return "" + hand;
	}
	public int getHandValue() {
		return hand.getHandValue(); // added to call specifically the total.
	}

	public boolean isBlackjack() {
		return hand.isBlackjack();
	}
}

