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
		return "Participant [hand=" + hand + "]" + " = " + hand.getHandValue();
	}
}

