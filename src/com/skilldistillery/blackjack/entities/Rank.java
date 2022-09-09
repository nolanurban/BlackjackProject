package com.skilldistillery.blackjack.entities;

public enum Rank {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(10),
	QUEEN(10),
	KING(10), 
	ACE(11); 

	private int values;
	
	Rank(int i) {
		this.values = i;
	}

	public int getValue() {
		return values;
	}

	public void setValue(int rank) {
		this.values = rank;
	}
	
	
	
	
}	
