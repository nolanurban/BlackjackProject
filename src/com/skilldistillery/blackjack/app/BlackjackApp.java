package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {

	public BlackjackApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player ourPlayer = new Player();
		Dealer ourDealer = new Dealer();
		
		Deck ourDeck = new Deck(); // instantiation creates deck
		System.out.println("Deck created: " + ourDeck.toString()); // debugging JIC
		ourDeck.shuffleDeck();
		System.out.println("Shuffling Deck"); // debugging JIC
		System.out.println("Deck created: " + ourDeck.toString()); // debugging JIC

		ourDealer.addCard(ourDeck.dealCard());
		ourDealer.addCard(ourDeck.dealCard());
		ourPlayer.addCard(ourDeck.dealCard());
		ourPlayer.addCard(ourDeck.dealCard());
		
		System.out.println(ourDealer.toString());
		System.out.println(ourPlayer.toString());
		
	}

}
