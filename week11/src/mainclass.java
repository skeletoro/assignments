import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class mainclass {
	private static Connection connection;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		final String connectionStr = "jdbc:mysql://localhost:3306/hockeyTeams";

		try {
			System.out.println("Attempting to connect to DB...");

			connection = DriverManager.getConnection(connectionStr, "root", "Zakkary123");

			System.out.println("Connection established \n _____________________");

			System.out.println("main menu");
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
			String selection = "";
			while (!selection.equals("0")) {
				selection = scanner.nextLine();

				if (selection.equals("1")) {
					showAllTeams();
				} else if (selection.equals("2")) {
					addTeam();
				} else if (selection.equals("3")) {
					updateTeam();
				} else if (selection.equals("4")) {
					deleteTeam();
				}

			}
		} catch (SQLException e) {
			System.out.println("could not establish connection ERROR: ");
			e.printStackTrace();
		} finally {
			if (connection != null) {
				System.out.println("______________________\nclosing connection now");
				connection.close();
				System.out.println("Connection closed successfully"); // for establishing connection
			}
		}
	}

	public static void showAllTeams() {
		final String query = "select * from team limit 500";

		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getInt("team_id") + " " + rs.getString("team_name") + " " + rs.getString("State")
						+ " " + rs.getString("city"));

			}
			System.out.println("end of results" + "\n______________________________" + "\n1) to view all teams "
					+ " \n 2) to add a team" + "\n 3) to update an existing team" + "\n 4) to delete a team"
					+ "\n to exit enter 0");
		} catch (SQLException e) {
			System.out.println("error has occurred please try again no changes made");
			e.printStackTrace();
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		}
	}

	public static void addTeam() {
		Scanner scanner = new Scanner(System.in);

		String query = " insert into team (team_id, team_name, state,city)" + " values (?, ?, ?, ?)";

		try {

			PreparedStatement statement = connection.prepareStatement(query);
			System.out.println("enter a number for team_id and press enter");
			statement.setInt(1, scanner.nextInt());
			scanner.nextLine();

			System.out.println("enter a name for team_name and press enter");
			statement.setString(2, scanner.nextLine());


			System.out.println("enter teams state and press enter");
			statement.setString(3, scanner.nextLine());


			System.out.println("enter a city for team and press enter");
			statement.setString(4, scanner.nextLine());


			statement.executeUpdate();
			System.out.println("team entered");
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		} catch (SQLException e) {
			System.out.println("error has occurred please try again no changes made");
			e.printStackTrace();
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		}

	}

	private static void updateTeam() {
		Scanner scanner = new Scanner(System.in);

		String query = "update team " + "set team_name = ?, state = ? , city = ? where team_id = ?";

		try {

			PreparedStatement statement = connection.prepareStatement(query);

			System.out.println("enter the team_id to be updated and press enter");
			statement.setInt(4, scanner.nextInt());
		

			System.out.println("enter the new name for team and press enter");
			statement.setString(1, scanner.next());

			System.out.println("enter the teams State and press enter");
			statement.setString(2, scanner.next());
	
			System.out.println("enter teams city and press enter");
			statement.setString(3, scanner.next());
	
			statement.executeUpdate();

			System.out.println("team updated");
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		} catch (SQLException e) {
			System.out.println("error has occurred please try again no changes made");
			e.printStackTrace();
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		}

	}

	private static void deleteTeam() {
		Scanner scanner = new Scanner(System.in);

		String query = "delete from team where team_id = ?";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(query);
			System.out.println("enter a number for team_id and press enter to delete team");
			statement.setInt(1, scanner.nextInt());
			scanner.nextLine();

			statement.executeUpdate();
			System.out.println("the selected team has been removed");
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");

		} catch (SQLException e) {
			System.out.println("error has occurred please try again no changes made");
			e.printStackTrace();
			System.out.println("______________________________" + "\n1) to view all teams " + " \n 2) to add a team"
					+ "\n 3) to update an existing team" + "\n 4) to delete a team" + "\n to exit enter 0");
		}
	}

}
