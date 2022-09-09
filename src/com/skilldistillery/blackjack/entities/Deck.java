package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cardDeck = new ArrayList<>(); // will hold 52

	public Deck() {
		// TODO Auto-generated constructor stub

		// populate the deck of the cards
		for (Suit suits : Suit.values())
			for (Rank ranks : Rank.values()) {
				Card card = new Card(suits, ranks);
			}
	}

	public int checkDeckSize() {
		return cardDeck.size();
	}

	public Card dealCard() {
		Card yourCard = cardDeck.remove(0); // takes the top card from the deck & change count
		return yourCard;
	}

	public void shuffleDeck() {
		Collections.shuffle(cardDeck);
	}

}
