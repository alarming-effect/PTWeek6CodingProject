package WARCardGame;

public class App {

	public static void main(String[] args) {

//		2. Create a class called App with a main method.
//		a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		System.out.println("***** Welcome to WAR: Card Game *****");

		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();		
		deck.shuffle();

		System.out.println("*****The deck has been shuffled and is ready to deal *****");

		deck.describe();
		int numPlayers = 2;
//		b.     Using a traditional for loop, iterate 52 times calling the Draw method on 
//		the other player each iteration using the Deck you instantiated.
		for (int i=0; i<26; i++) {
				player1.getHand().add(deck.draw());
				player2.getHand().add(deck.draw());
			
		}
		//Print out player and hand
		System.out.println("--------------------------Player 1's hand:");
		player1.describe(player1);
		System.out.println("--------------------------Player 2's hand:");
		player2.describe(player2);
			
//		c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
//		Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
//		method on the player whose card has the higher value.  Print a message to say which player received a point.
//		Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		for (int i=0; i<26;i++) {
			Card p1card = player1.flip();
			Card p2card = player2.flip();
		

//		d.      After the loop, compare the final score from each player.
		if (p1card.getValue() >p2card.getValue()) {
			player1.incrementScore();
			System.out.println("Player 1 wins the round");
		}else if (p2card.getValue()>p1card.getValue()) {
			player2.incrementScore();
			System.out.println("player 2 wins the round");
		}else {
			System.out.println("This round was a tie");
		}
			
	}
//		e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending 
//		on which score is higher or if they are both the same.
		 System.out.println("Player 1's Score:" + player1.getScore());
		 System.out.println("Player 2's Score:" + player2.getScore());
		 if (player1.getScore()>player2.getScore()) {
			System.out.println("Player 1 wins!");
		}else if (player2.getScore()>player1.getScore()) {
			System.out.println("Player 2 wins!");
		}else {
			System.out.println("This game was a tie!");
		} 
//		3.  Tips:  Printing out information throughout the game adds value including easier debugging as 
		//	you progress and a better user experience.
//		a.  Using the Card describe() method when each card is flipped illustrates the game play.
//		b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
//		c.  Printing the updated score after each turn shows game progression.
//		d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” 
		//if the result is a tie.
		


		
	}//end of main

}//end
