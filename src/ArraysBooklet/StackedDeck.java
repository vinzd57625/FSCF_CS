package ArraysBooklet;

import java.util.*;

public class StackedDeck {

	public static void main(String[] args) {
		
		String [] suit = { "Clubs", "Diamonds", "Hearts","Spades"};
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	int i = (int) (Math.random() * rank.length);
	int j = (int) (Math.random() * suit.length);
	
	String[] deck = new String[rank.length * suit.length];
	for (int i=0; i<rank; i++){
		for(int j1=0; j1<suit;j1++){
	deck[suit.length*i + j] = rank [i] + " of " + suit[j];
	
	System.out.println(rank[i] + " of " + suit[j]);
		}
	}
	}
}