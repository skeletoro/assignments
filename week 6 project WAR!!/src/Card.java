
public class Card  {
private int value;
private String name;
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void describeCard(Card card) {
	System.out.println("card drawn is: " + card.getValue() + card.getName());

}
	
	
}
