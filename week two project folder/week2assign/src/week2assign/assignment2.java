package week2assign;
public class assignment2 {

	public static void main(String[] args) {
		boolean isHotOutside = true; 
		boolean isWeekday = true; 
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.75;
		double moneyInWallet = 38.21;
		int thirstLevel = 7;
		
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		System.out.println(shouldBuyIceCream);
		
		
	}
}