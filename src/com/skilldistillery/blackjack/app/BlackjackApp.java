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
			} 
			
			if (ourPlayer.isBust())  {
				System.out.println("You busted, thanks for playing");
				return;
			}
	
			while (ourDealer.canHit()) {
				ourDealer.addCard(ourDeck.dealCard());
				System.out.println(ourDealer.toString() + " = " + ourDealer.getHandValue());
			}
			if (ourDealer.isBust()) {
				System.out.println("Dealer busts! You win!");
				return;
			}
			if (ourPlayer.getHandValue() == ourDealer.getHandValue()) {
				System.out.println("Tie game, nobody wins.");
			}
			else if (ourPlayer.isBlackjack()) {
				System.out.println("Player wins!");
			}
			else if (ourDealer.isBlackjack()) {
				System.out.println("Dealer wins!");
			}
			else if (ourPlayer.getHandValue() > ourDealer.getHandValue()) {
				System.out.println("Player wins!");
			}
			else System.out.println("Dealer wins!");
		// now dealer begins play	
	}
	
	public void printMessage() {
		System.out.println("Welcome to Blackjack, prepare to play. ");
	}
	


}
