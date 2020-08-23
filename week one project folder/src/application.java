public class application {

	public static void main(String[] args) {
	double itemPrice = 11.57;
	double walletFunds = 92.85;
	int numberOfFriends = 225;
	int ageInYears = 23;
	String firstName = "Zakkary";
	String lastName = "Hinchcliff";
	char middleInitial = 'R';
	double newWalletFunds = walletFunds - itemPrice;
	int friendsPerYear = numberOfFriends / ageInYears;
	String fullName = firstName + " " + middleInitial + " " + lastName;
	
	System.out.println("After buying gas my available balance is:$" + newWalletFunds);
	System.out.println("I am 23 with 225 friends i have made " + friendsPerYear + " friends per year");
	System.out.println("My full name is " + fullName);
	
	

	}

}
