package WARCardGame;

public class Card {
//	 a.      Card
//     i.     Fields
//          1.     value (contains a value from 2-14 representing cards 2-Ace)
//          2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//    ii.    Methods
//          1.     Getters and Setters
//          2.     describe (prints out information about a card)
	String name;
	String suit;
	int value;
	
	public Card(String name,String suit, int value) {
		this.name = name;
		this.suit=suit;
		this.value=value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void describe() {
		System.out.println(this.name + " of " + this.suit + ": " + this.value);
		
	}
}//end
