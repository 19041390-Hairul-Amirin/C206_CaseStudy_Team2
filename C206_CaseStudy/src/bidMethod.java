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
		
		
		ArrayList<bid> list1 = new ArrayList<bid>();
		
		
		int option = 0;
		while (option != 6) {
			bidMethod.menu();
			option = Helper.readInt("Enter option > ");
			 if (option == 1) {
			        // View all user
			    	 bidMethod.showAll(list1);
			        
			      }
			 else if (option == 2) {
			        // View all user
			    	 bidMethod.addBid(list1);
			        
			      }
			 else if(option ==3) {
				 bidMethod.deleteBid(list1);;
			 }
			 else if(option==4) {
				 bidMethod.searchKeyword(list1);
			 }
			 else if(option ==5) {
				 bidMethod.updatePrice(list1);
			 }
			 else {
				 System.out.println("Bye!");
			 }

		}

	}
	public static void menu() {
		AuctionShop.setHeader("Online Auction Shop");
		System.out.println("1. Display Bid");
		System.out.println("2. Add Bid");
		System.out.println("3. Delete Bid");
		System.out.println("4. Search Bid");
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
			String output = String.format("%-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
					"BUYER EMAIL", "BID PRICE");
			output += retrieveAll(list1);
			System.out.println(output);
		}
			
		
	}
	public static void addBid(ArrayList<bid> list1) {
		int id = Helper.readInt("Enter Bid Id: > ");
		String name = Helper.readString("Enter name of item: > ");
		String semail = Helper.readString("Enter email of seller: >");
		String bemail = Helper.readString("Enter email of buyer: > ");
		double price = Helper.readDouble("Enter price of bid: > ");
		
		list1.add(new bid(id , name , semail , bemail , price));
		
		System.out.println("Bid Added!");
		
	}
	
	public static void deleteBid(ArrayList<bid> list1) {
		int del = Helper.readInt("Enter Bid Id to delete : >");
		for(int i = 0 ; i<list1.size();i++) {
			if(del == list1.get(i).getBidId()) {
				list1.remove(i);
				
				System.out.println("Bid Deleted!");
			}
		}
	}
	public static void searchKeyword(ArrayList<bid> list1) {
		
		int option = Helper.readInt("Enter option: > ");
		
		if(option == 1) {
			String info = Helper.readString("Enter Keyword: > " );
			for(int i=0 ; i<list1.size();i++) {
				if(info.equalsIgnoreCase(list1.get(i).getItemName())){
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
							"BUYER EMAIL", "BID PRICE"));
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
				}
				else if(info.equalsIgnoreCase(list1.get(i).getSellerEmail())) {
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
							"BUYER EMAIL", "BID PRICE"));
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));					
				}
			}
		}
		else if(option == 2) {
			int info1 = Helper.readInt("Enter Bid id: > ");
			for(int i=0 ; i<list1.size();i++) {
				if(info1 == list1.get(i).getBidId()) {
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
							"BUYER EMAIL", "BID PRICE"));
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
			}
		}	
		}
		else if(option == 3) {
			double info2 = Helper.readDouble("Enter price: > ");
			for(int i=0 ; i<list1.size();i++) {
				if(info2 == list1.get(i).getBidPrice()) {
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s\n", "BID ID", "ITEM NAME", "SELLER EMAIL",
							"BUYER EMAIL", "BID PRICE"));
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", list1.get(i).getBidId(), list1.get(i).getItemName(), list1.get(i).getSellerEmail(), list1.get(i).getBuyerEmail() ,list1.get(i).getBidPrice()));			
				}
			}
		}
		else {
				System.out.println("Error!");
		}
		
	}
	public static void updatePrice(ArrayList<bid> list1) {
		
		int id = Helper.readInt("Enter Bid id: > ");
		double upPrice = Helper.readDouble("Enter new price to update : > ");
		
		
		for(int i = 0; i < list1.size() ; i++) {
			if(id == list1.get(i).getBidId()) {
				list1.get(i).setBidPrice(upPrice);
				
				System.out.println("Price Updated!");
			}
			
		}
		
	}
	
}