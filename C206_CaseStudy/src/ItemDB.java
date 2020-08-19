import java.util.ArrayList;

public class ItemDB  {

	static ArrayList<Item> itemList = new ArrayList<Item>();
	


	
	
	
	
	
	
	
	public static String retrieveAllItem(ArrayList<Item> itemList) {
		String output = "";

		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-30s %-10f %-10f %-20s %-20s\n",
					itemList.get(i).getDescription(), itemList.get(i).getStartPrice(), 
					itemList.get(i).getMinIncrement(),
					itemList.get(i).getStartDate(),itemList.get(i).getEndDate());
		}
		return output;
	}
	public static void viewAllItem(ArrayList<Item> ItemList) {
		AuctionShop.setHeader("Item LIST");
		String output = String.format(" %-30s %10f %-10f %-10s %-20s\n", "DESCRIPTION","START PRICE",
				"MIN INCREMENT", "START DATE","END DATE");
		 output += retrieveAllItem(itemList);	
		System.out.println(output);
	}
	
	
	public static void ItemMenu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Display Item");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static Item InputItem() {
		String description = Helper.readString("Enter item's description > ");
		double startPrice = Helper.readInt("Enter starting price > ");
		double minIncrement= Helper.readInt("Enter Increment > ");
		String StartDate = Helper.readString("Enter End Date > ");
		String EndDate = Helper.readString("Enter End Date > ");
		Item newitem = new Item(description, startPrice, minIncrement, StartDate, EndDate); 
		return newitem;
	}
	public static void AddItem(ArrayList<Item> itemList, Item newitem) {
		itemList.add(newitem);
		System.out.println("Item added");
	}
	
	
	public static void DelItem(ArrayList<Item> itemList) {
		 
		
		
	}
}
