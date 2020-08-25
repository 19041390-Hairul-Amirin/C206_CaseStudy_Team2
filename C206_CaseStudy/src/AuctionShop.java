import java.util.ArrayList;

public class AuctionShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;

		while (option != 4) {
			Menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				ItemDB.main(args);
			} else if (option == 2) {
				UserMethod.main(args);
			} else if (option == 3) {
				bidMethod.main(args);
			} else if (option == 5) {
				System.out.println("Thank you and see you again");
			} else if (option == 4) { // Jibin to fill in
			} else {
				System.out.println("Invalid Option!");
			}

		}

	}

	public static void Menu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Manage Items");
		System.out.println("2. Manage User");
		System.out.println("3. Manage Bid");
		System.out.println("4. Manage Category");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
