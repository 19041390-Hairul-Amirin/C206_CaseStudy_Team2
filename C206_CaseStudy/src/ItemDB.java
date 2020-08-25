import java.util.ArrayList;

public class ItemDB {

	static ArrayList<Item> itemList = new ArrayList<Item>();

	public static void main(String[] args) {

		int option = 0;
		while (option != 6) {
			ItemDB.ItemMenu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				// View all user
				ItemDB.viewAllItem(itemList);

			} else if (option == 2) {
				// View all user
				ItemDB.addItem(itemList);

			} else if (option == 3) {
				ItemDB.DelItem(itemList);
			} else if (option == 4) {
				ItemDB.SearchItem(itemList);
			}else if (option == 5) {
				ItemDB.updateItem(itemList);
			}
			else if (option == 6) {
				System.out.println("Bye!");
			}

		}

	}

	public static void ItemMenu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Display Item");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Search item");
		System.out.println("5. Update item");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	public static void viewAllItem(ArrayList<Item> ItemList) {
		AuctionShop.setHeader("ITEM LIST");
		String output = String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\n", "NAME", "DESCRIPTION", "START PRICE",
				"MIN INCREMENT", "START DATE", "END DATE");
		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-20s %-20s %-20.2f %-20.2f %-20s %-20s\n", itemList.get(i).getName(),
					itemList.get(i).getDescription(), itemList.get(i).getStartPrice(),
					itemList.get(i).getMinIncrement(), itemList.get(i).getStartDate(), itemList.get(i).getEndDate());
		}
		System.out.println(output);
	}

	public static void addItem(ArrayList<Item> itemList) {
		String name = Helper.readString("Enter item's name > ");
		String description = Helper.readString("Enter item's description > ");
		double startPrice = Helper.readInt("Enter starting price > ");
		double minIncrement = Helper.readInt("Enter Increment > ");
		String StartDate = Helper.readString("Enter Start Date > ");
		String EndDate = Helper.readString("Enter End Date > ");
		itemList.add(new Item(name, description, startPrice, minIncrement, StartDate, EndDate));
		System.out.println("Item Added");

	}

	public static String retrieveAllItem(ArrayList<Item> itemList) {
		String output = "";

		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-30s %-10f %-10f %-20s %-20s\n", itemList.get(i).getDescription(),
					itemList.get(i).getStartPrice(), itemList.get(i).getMinIncrement(), itemList.get(i).getStartDate(),
					itemList.get(i).getEndDate());
		}
		return output;
	}

	public static void DelItem(ArrayList<Item> itemList) {

		String name = Helper.readString("Enter item's name > ");
		for (int i = 0; i < itemList.size(); i++) {
			if (name.equalsIgnoreCase(itemList.get(i).getName())) {
				itemList.remove(i);
				System.out.println("Item Deleted");
			} else {
				System.out.println("Delete Failed");
			}
		}
	}

	public static void updateItem(ArrayList<Item> itemList) {
		String name = Helper.readString("Enter current name to update: > ");
		String Newname = Helper.readString("Enter new name to update: > ");
		String desc = Helper.readString("Enter new desc: > ");
		String endDate = Helper.readString("Enter new End date: > ");
		double bidInc = Helper.readDouble("Enter new bid increament: > ");

		for (int i = 0; i < itemList.size(); i++) {
			if (name.equalsIgnoreCase(itemList.get(i).getName())) {
				itemList.get(i).setName(Newname);
				itemList.get(i).setDescription(desc);
				itemList.get(i).setEndDate(endDate);
				itemList.get(i).setMinIncrement(bidInc);
				System.out.println("Item Updated");
			}else {
				System.out.println("Update error. Please Try Again!");
			}
		}
	}

	public static void SearchItem(ArrayList<Item> itemList) {

		int option = Helper.readInt("Enter 1 to search by name. Enter 2 to search by description: > ");

		if (option == 1) {
			String name = Helper.readString("Enter Name to search: > ");

			for (int i = 0; i < itemList.size(); i++) {
				if (name.equalsIgnoreCase(itemList.get(i).getName())) {
					System.out.println(String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\n", "NAME", "DESCRIPTION",
							"START PRICE", "MIN INCREMENT", "START DATE", "END DATE"));
					System.out.println(String.format("%-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
							itemList.get(i).getName(), itemList.get(i).getDescription(),
							itemList.get(i).getStartPrice(), itemList.get(i).getMinIncrement(),
							itemList.get(i).getStartDate(), itemList.get(i).getEndDate()));

				} else {
					System.out.println("No results found");
				}

			}
		} else if (option == 2) {
			String desc = Helper.readString("Enter Description to search: > ");

			for (int i = 0; i < itemList.size(); i++) {
				if (desc.equalsIgnoreCase(itemList.get(i).getDescription())) {
					System.out.println(String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\n", "NAME", "DESCRIPTION",
							"START PRICE", "MIN INCREMENT", "START DATE", "END DATE"));
					System.out.println(String.format("%-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
							itemList.get(i).getName(), itemList.get(i).getDescription(),
							itemList.get(i).getStartPrice(), itemList.get(i).getMinIncrement(),
							itemList.get(i).getStartDate(), itemList.get(i).getEndDate()));

				} else {
					System.out.println("No results found");

				}

			}
		}

	}
}
