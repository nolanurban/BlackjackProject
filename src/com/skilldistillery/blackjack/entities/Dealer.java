package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.app.Participant;

// for use inside blackjack app
// dealer must hit below 17 and stay above (hand <= 16) hit()
public class Dealer extends Participant  {

	public Dealer() {
		// TODO Auto-generated constructor stub
	}

	public boolean canHit() { // specific dealer only method
		return (hand.getHandValue() < 17);
	}
}
