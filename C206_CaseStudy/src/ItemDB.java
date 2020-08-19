import java.util.ArrayList;

public class ItemDB {

	static ArrayList<Item> itemList = new ArrayList<Item>();

	public static void main(String[] args) {

		int option = 0;
		while (option != 4) {
			ItemDB.ItemMenu();
			option = Helper.readInt("Enter option > ");
			 if (option == 1) {
			        // View all user
			    	 ItemDB.viewAllItem(itemList);
			        
			      }
			 else if (option == 2) {
			        // View all user
			    	 ItemDB.addItem(itemList);
			        
			      }
			 else if(option ==3) {
				 ItemDB.DelItem(itemList);
			 }
			 else if(option==4) {
				 System.out.println("Bye!");
			 }

		}

	}

	public static void ItemMenu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Display Item");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void viewAllItem(ArrayList<Item> ItemList) {
		AuctionShop.setHeader("ITEM LIST");
		String output = String.format(" %-30s %10f %-10f %-10s %-20s\n", "DESCRIPTION", "START PRICE", "MIN INCREMENT",
				"START DATE", "END DATE");
		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-30s %-10f %-10f %-20s %-20s\n", itemList.get(i).getDescription(),
					itemList.get(i).getStartPrice(), itemList.get(i).getMinIncrement(), itemList.get(i).getStartDate(),
					itemList.get(i).getEndDate());
		}
		System.out.println(output);
	}

	public static void addItem(ArrayList<Item> itemList) {
		String name = Helper.readString("Enter item's name > ");
		String description = Helper.readString("Enter item's description > ");
		double startPrice = Helper.readInt("Enter starting price > ");
		double minIncrement = Helper.readInt("Enter Increment > ");
		String StartDate = Helper.readString("Enter End Date > ");
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

}
