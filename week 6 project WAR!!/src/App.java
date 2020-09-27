
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player elliot = new Player("Elliot Alderson");
		Player robot = new Player("Mr Robot");
		deck.shuffle();
		int elliotScore = 0;
		int mrRobotScore = 0;
		System.out.println("Elliot Alderson and Mr Robot have decided to face off in a game of WAR");
		System.out.println("                                                             ");
		System.out.println("BEGINNING GAME");
		System.out.println("                                                             ");

		
		for (int i = 1; i < 53; i++) {
			if (i % 2 == 0) {
				elliot.draw(deck);
			} else {
				robot.draw(deck);
			}
		}
		for (int x = 0; x < 26; x++) {

			Card elliotCard = elliot.flip();
			Card robotCard = robot.flip();
			
			System.out.println("*hands for this round*");
			System.out.print("Elliots ");
			elliotCard.describe();
			System.out.print("Mr Robots ");
			robotCard.describe();
			
			if (elliotCard.getValue() > robotCard.getValue()) {
				elliot.incrementScore();
			    elliotScore = elliot.getScore();
				mrRobotScore = robot.getScore();
				System.out.println("Elliot wins this round");
				System.out.println("                                                             ");
				System.out.println("SCOREBOARD");
				System.out.println("Elliots Score " + elliotScore);
				System.out.println("Mr Robots Score " + mrRobotScore);
				System.out.println("_______________________________");

			} else if (robotCard.getValue() > elliotCard.getValue()) {
				robot.incrementScore();
				elliotScore = elliot.getScore();
				mrRobotScore = robot.getScore();
				System.out.println("Mr Robot wins this round");
				System.out.println("                                                             ");
				System.out.println("SCOREBOARD");
				System.out.println("Mr Robots Score " + mrRobotScore);
				System.out.println("Elliots Score " + elliotScore);
				System.out.println("_______________________________");



			} else {
				elliot.incrementScore();
				robot.incrementScore();
				elliotScore = elliot.getScore();
				mrRobotScore = robot.getScore();
				System.out.println("This round is tie point is awarded to both players");
				System.out.println("                                                             ");
				System.out.println("SCOREBOARD");
				System.out.println("Mr Robots Score " + mrRobotScore);
				System.out.println("Elliots Score " + elliotScore);
				System.out.println("_______________________________");


			}
		}
		

		if (elliotScore == mrRobotScore) {
			System.out.println("GAME OVER FINAL SCORE");
			System.out.println("GAME OVER FINAL SCORE");
			System.out.println(	"The match between " + elliot.getName() + " and " + robot.getName() + " resulted in a tie. (probably because they are the same person)");
			System.out.println("Elliots Score " + elliotScore);
			System.out.println("Mr Robots Score " + mrRobotScore);
		} else if (elliotScore > mrRobotScore) {
			System.out.println("GAME OVER FINAL SCORE");
			System.out.println(elliot.getName() + " has defeated " + robot.getName());
			System.out.println("Elliots Score " + elliotScore);
			System.out.println("Mr Robots Score " + mrRobotScore);
		} else {
			System.out.println("GAME OVER FINAL SCORE");
			System.out.println(robot.getName() + " has defeated " + elliot.getName());
			System.out.println("Mr Robots Score " + mrRobotScore);
			System.out.println("Elliots Score " + elliotScore);
		}

	}

}
