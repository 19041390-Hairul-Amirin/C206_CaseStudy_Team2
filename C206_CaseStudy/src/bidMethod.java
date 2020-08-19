import java.util.ArrayList;



/**
 t java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19026820, Aug 19, 2020 1:12:06 PM
 */

/**
 * @author 19026820
 *
 */
public class bidMethod {

	/**
	 * @param args
	 */
		
	
	public static void main(String[] args) {
		
		menu();
		ArrayList<bid> list1 = new ArrayList<bid>();
		
		int id = Helper.readInt("Enter Bid Id: > ");
		String name = Helper.readString("Enter name of item: > ");
		String semail = Helper.readString("Enter email of seller: >");
		String bemail = Helper.readString("Enter email of buyer: > ");
		double price = Helper.readDouble("Enter price of bid: > ");
		
		list1.add(new bid(id , name , semail , bemail , price));
		
		
		
		showAll(list1);
		
		deleteBid(list1);
	}
	public static void menu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Display Bid");
		System.out.println("2. Add Bid");
		System.out.println("3. Delete Bid");
		System.out.println("5. Search Bid");
		System.out.println("5. Update Bid");
		Helper.line(80, "-");
	}
	public static String retrieveAll(ArrayList<bid> list1) {
		String output = "";

		for (int i = 0; i <list1.size(); i++) {

			output += String.format("%-10d %-10s %-10s %-10s %-10.2f", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice());			
		}
		
		return output;
	
	}
	
	public static void showAll(ArrayList<bid> list1) {
		AuctionShop.setHeader("View Bid");
		
		for(int i =0 ; i<list1.size() ; i++){
			String output = String.format(" %-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
					"BUYER EMAIL", "BID PRICE");
			output += retrieveAll(list1);
			System.out.println(output);
		}
			
		
	}
	public static void deleteBid(ArrayList<bid> list1) {
		int del = Helper.readInt("Enter Bid Id to delete : >");
		for(int i = 0 ; i<list1.size();i++) {
			if(del == list1.get(i).getBidId()) {
				list1.remove(i);
			}
		}
	}
	public static void searchKeyword(ArrayList<bid> list1) {
		
		String info = Helper.readString("Enter Keyword: > " );
		int info1 = Helper.readInt("Enter Bid id: > ");
		double info2 = Helper.readDouble("Enter price: > ");
		
		for(int i=0 ; i<list1.size();i++) {
			if(info == list1.get(i).getItemName()) {
			System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
			}
			else if(info == list1.get(i).getSellerEmail()) {
				System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));					
			}
			else if(info1 == list1.get(i).getBidId()) {
				System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
			}
			else if(info1 == list1.get(i).getBidPrice()) {
				System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
			}
			else {
				System.out.println("Error!");
			}
		}
		
	}
	public static void updatePrice(ArrayList<bid> list1) {
		
		int id = Helper.readInt("Enter Bid id: > ");
		double upPrice = Helper.readDouble("Enter new price to update : > ");
		
		
		for(int i = 0; i < list1.size() ; i++) {
			if(id == list1.get(i).getBidId()) {
				list1.get(i).setBidPrice(upPrice);
			}
			
		}
	}
}