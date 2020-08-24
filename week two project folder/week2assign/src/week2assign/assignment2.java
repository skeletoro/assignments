package week2assign;
public class assignment2 {

	public static void main(String[] args) {
		boolean isHotOutside = true; 
		boolean isWeekday = false; 
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.75;
		double moneyInWallet = 38.21;
		int thirstLevel = 7;
		
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		boolean willGoSwimming = (isHotOutside && !isWeekday);
		boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
		boolean willBuyMilk = (isHotOutside && hasMoneyInPocket && thirstLevel >=3 && moneyInWallet >= 2 * costOfMilk);
		
		System.out.println(shouldBuyIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		

		
		
	}
}