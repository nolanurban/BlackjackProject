package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealingApp {

	static Scanner keyboard = new Scanner(System.in);
	
	public DealingApp() {
		
	}
	public static void main(String[] args) {
		DealingApp letsGo = new DealingApp();
		Deck newDeck = new Deck(); // create a new deck of card
		letsGo.printMenu();
		int input = keyboard.nextInt();
		for (int i = 0 ; i < input ; i++) {
			System.out.println(newDeck.dealCard());
		}
		
		
		// TODO Auto-generated constructor stub

	}
	public void printMenu() {
		System.out.println("How many cards would you like? ");
	}
	
}
