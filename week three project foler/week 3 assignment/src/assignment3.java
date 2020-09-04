
public class assignment3 {

	public static void main(String[] args) {
		double[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 5808 };
		double subtractionTool = (ages[ages.length - 1] - ages[0]);
		double sumOfAges = 0;
		// System.out.println(subtractionTool);
		for (int i = 0; i < ages.length; i++) {
			sumOfAges = sumOfAges + ages[i];
		}
		double averageAge = sumOfAges / ages.length;
		// System.out.println(averageAge);

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; // question 2
		int sumOfNames = 0;
		for (int x = 0; x < names.length; x++) {
			sumOfNames = sumOfNames + names[x].length();
			// System.out.println(names[x] + " ");

		}
		int averageNameCharCount = sumOfNames / names.length;
		// System.out.print(averageNameCharCount);

		int[] nameLengths = new int[names.length];
		for (int y = 0; y < names.length; y++) {
			nameLengths[y] = names[y].length();
		}
		for (int z = 0; z < nameLengths.length; z++) {
			// System.out.println(nameLengths[z]);
		}
		int elementSum = 0;
		for (int elementInd : nameLengths) {
			elementSum = elementSum + elementInd;
		}

		// System.out.println(elementSum);

		qSeven("hello", 7);
		qEight("charlie", "chapman");
		int[] nums = { 3, 4, 5, 23, 334 };
		qNine(nums);
		boolean returnVal = qNine(nums);
		// System.out.println(returnVal);

		double[] numbe = { 6.41, 5.56, 13.21, 2.44, 5.51 };
		qTen(numbe);
		double returnValue = qTen(numbe) / numbe.length;
		// System.out.println(returnValue);

		double[] numb1 = { 1.20, 5.54, 40.44, 67.87 }; // sum is 115.05
		double[] numb2 = { 8.67, 61.21, 12.10, 2.06 };// sum is 84.04
		qEleven(numb1, numb2);
		boolean isBigger = qEleven(numb1, numb2);
		// System.out.println(isBigger);

		double walletBal = 17.50;
		boolean tempIsHot = true;
		boolean buyDrink = willBuyDrink(tempIsHot, walletBal);
		//System.out.println(buyDrink);
		
		double myAcctBal = 1251;
		boolean tvIsBroke = true;
		boolean buyNewTelevision = willBuyFlatscreen(tvIsBroke, myAcctBal);
		System.out.println(buyNewTelevision);
	}
	
	  

	public static void qSeven(String word, int n) {

		for (int v = 0; v < n; v++) {
			// System.out.print(word);
		}

	}

	public static void qEight(String firstName, String lastName) {
		// System.out.println(firstName + " " + lastName);
	}

	public static boolean qNine(int[] m) {
		int sumOfArray = 0;
		for (int i = 0; i < m.length; i++) {
			sumOfArray += m[i];

		}
		if (sumOfArray > 100) {
			return true;
		} else {
			return false;

		}
	}

	public static double qTen(double[] a) {
		double arraySum = 0;
		double arrayAve = 0;
		for (int i = 0; i < a.length; i++) {
			arraySum += a[i];
		}
		return arraySum;
	}

	public static Boolean qEleven(double[] a, double[] b) {
		double arraySum1 = 0;
		double arraySum2 = 0;
		double arrayAve1 = 0;
		double arrayAve2 = 0;
		for (int i = 0; i < a.length; i++) {
			arraySum1 += a[i];
		}
		for (int x = 0; x < b.length; x++) {
			arraySum2 += b[x];
		}
		if (arraySum1 > arraySum2) {
			return true;
		} else {
			return false;

		}

	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside = true) && (moneyInPocket > 10.50)) {
			return true;
		} else {
			return false;

		}
	}
	public static boolean willBuyFlatscreen(boolean myTvIsBroken, double checkingAcctBal) {
		if ((myTvIsBroken = true) && (checkingAcctBal > 1000)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
