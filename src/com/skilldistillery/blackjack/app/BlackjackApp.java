package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {

	public BlackjackApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BlackjackApp letsPlay = new BlackjackApp();
		letsPlay.run();
		
	}
	
	public void run() {
	
		Player ourPlayer = new Player();
		Dealer ourDealer = new Dealer();
		
		
		System.out.println("Welcome to Blackjack, prepare to play. ");
		Deck ourDeck = new Deck(); // instantiation creates deck
		ourDeck.shuffleDeck();
		System.out.println("Cards are shuffled and being dealt");
		ourPlayer.addCard(ourDeck.dealCard());
		ourPlayer.addCard(ourDeck.dealCard());
		System.out.println("Your cards are: " + ourPlayer.toString());
		System.out.println("For a total of: " + ourPlayer.getHandValue());
		ourDealer.addCard(ourDeck.dealCard());
		ourDealer.addCard(ourDeck.dealCard());
		System.out.println("Dealer shows: " + ourDealer.getVisibleCard());
		System.out.println("Dealer secretly has : " + ourDealer.getHandValue());
		
		Scanner keyboard = new Scanner(System.in);
			while (!ourPlayer.isBust()) {
				
				System.out.println("Would you like to hit or stay?");
				String userInput = keyboard.next();

				if (userInput.equalsIgnoreCase("hit")) {
					ourPlayer.addCard(ourDeck.dealCard());
					System.out.println(ourPlayer.toString());
					System.out.println("Total hand value now: " + ourPlayer.getHandValue());
						
				}
				else if (userInput.equalsIgnoreCase("stay")) {
					break;
				}
				else System.out.println("Sorry I don't understand.");
			} if (ourPlayer.isBust()) System.out.println("You busted, thanks for playing");
	}
	public void printMessage() {
		System.out.println("Welcome to Blackjack, prepare to play. ");
	}
	


}
