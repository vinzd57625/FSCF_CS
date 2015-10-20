package com.as.cs.exercises;

public class TestingsStrings {

	public static void main(String[] args) {
		String firstName = "Vinz";
		String lastName = " Del Rosario";
		String fullName = firstName.concat(lastName);
		
		String longPhraseOne = "floxinoxinihilipilification";
		String longPhraseTwo = "floxinoxinihilipilification";
		String longPhraseThree = "ababababababababababababababababba";
		String longPhraseFour = new String("floxinoxinihilipilification");
		
		System.out.println(fullName);
        System.out.println("Reference to full name is " + firstName.equals(lastName));
        System.out.println("Refercence to long phrase is " + longPhraseOne.equals(longPhraseTwo));
        
        System.out.println(longPhraseOne==longPhraseTwo);
        System.out.println(longPhraseOne==longPhraseFour); 
	}

}


	
