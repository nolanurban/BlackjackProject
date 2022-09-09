package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {

		private Suit suit;
		private Rank rank;
		// TODO Auto-generated constructor stub
		
		
		public Card(Suit suit, Rank rank) {
			this.suit = suit;
			this.rank = rank;
			
		}
// need to createDeckOfCards() 


		public Suit getSuit() {
			return suit;
		}


		@Override
		public int hashCode() {
			return Objects.hash(rank, suit);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Card other = (Card) obj;
			return rank == other.rank && suit == other.suit;
		}


		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		public Rank getRank() {
			return rank;
		}
		public int getValue() {
			return rank.getValue();
		}


		public void setRank(Rank rank) {
			this.rank = rank;
		}


		@Override
		public String toString() {
			return rank + " of " + suit;
		}
		
		
}
