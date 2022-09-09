package com.skilldistillery.blackjack.entities;

public enum Suit {
	
	HEARTS("Hearts"),
	SPADES("Spades"), 
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	Suit(String name) {
		setName(name);

	}
	public String toString() {
		return name;
	}

}
