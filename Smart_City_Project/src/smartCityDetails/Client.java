package smartCityDetails;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user_choice, choice, admin_choice;
		String admin_username = "Sakshi";
		String admin_password = "song@24";
		Perform_City_Operation p = new Perform_City_Operation();
		System.out.println("Smart city management system");

		do {

			System.out.println("1.Admin login 2.User login");
			user_choice = sc.nextInt();
			switch (user_choice) {
			case 1:

				System.out.println("Enter the username");
				admin_username = sc.next();
				System.out.println("Enter the password");
				admin_password = sc.next();
				if (admin_username.equals("Sakshi") && admin_password.equals("song@24")) {
					do {
						System.out.println("1.add features  2.show features");
						System.out.println("Enter the choice");
						admin_choice = sc.nextInt();
						switch (admin_choice) {
						case 1:
							City_Features c = new City_Features();
							p.add_feature(c);
							break;

						case 2:
							p.view_feature();
							break;

						default:
							System.out.println("choice should be between 1 to 2 ");
						}
						System.out.println("do you want to continue: press 1:yes or press 0:no ??");
						choice = sc.nextInt();

					} while (choice != 0);
				} 
				else 
				{
					System.out.println("Please try again...");
				}

				break;
			case 2:
				
				System.out.println("Enter the city name you want information");
				p.searchCity(sc.next());
				break;

			default:
				System.out.println("choice should be between 1 to 2 ");

			}
			System.out.println("do you want to continue: press 1:yes or press 0:no ??");
			choice = sc.nextInt();
		} while (choice != 0);
		System.out.println("Thank you for using our servies");
	}

}
