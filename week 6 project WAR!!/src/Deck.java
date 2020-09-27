import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck  {
	private List<Card> cards;
	String[] names = {"Two Of", "Three Of", "Four Of", "Five Of", "Six Of", "Seven Of", "Eight Of", "Nine Of", "Ten Of", "Jack Of", "Queen Of", "King Of", "Ace Of"};
	int [] values = {2, 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 };
	String [] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};


	public Deck() {
		 cards = new ArrayList<Card>();
         for (int i = 0;  i < suits.length; i++) {
        	 for(int x = 0; x <names.length; x++ ) {
     	         String	fullCard = names[x] + " " + suits[i] ;
     	         Card card = new Card(values[x], fullCard);
     	     cards.add(card);
        	 }
        		 
        	 }
        	 
         }

	
	
	public void shuffle() {
		Random random = new Random();
		for (int i = cards.size() - 1; i > 0; i--) {
			int x = random.nextInt(i + 1);

			Card cardAtIndexI = cards.get(i);
			Card cardAtIndexX = cards.get(x);

			cards.set(i, cardAtIndexX);
			cards.set(x, cardAtIndexI);
		}
	}

	public Card draw() {
		return cards.remove(0);
	}
}