import java.util.ArrayList;
import java.util.List;

public class Player {
private List <Card>hand; 
private  int score = 0;
private String name;

public Player(String name) {
	this.name = name;
	this.score = score;
	this.hand = new ArrayList<Card>();
}

public List<Card> getHand(){
	return hand;
}

public void setHand(List <Card>hand) {
	this.hand = hand;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void describe() {
	System.out.println("player : " + this.name);
	
	for(Card cd : hand) {
		cd.describe();
	}
}

public Card flip () {
return hand.remove(0);
}

public void draw(Deck deck) {
Card cd = deck.draw();
hand.add(cd);

}
public void incrementScore() {
	score += 1;
}
}
