package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHandValue() {
		int sum = 0;
		for (Card card : hand) {
			sum += card.getValue();
		}
		return sum;
	}

	public boolean isBlackjack() { // determines if hand is 21
		return (getHandValue() == 21);
	}
	public boolean isBust() {
		return (getHandValue() > 21);
	}
	
}
