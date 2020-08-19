import java.util.ArrayList;

public class AuctionShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option=0;
		
		while (option !=4) {
			option = Helper.readInt("Enter an option > ");
			
			
			ItemDB.InputItem();
			ItemDB.AddItem(null, null);
			
			
		}
		
		
	}

	
	

	
	
	







	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	

	
}
