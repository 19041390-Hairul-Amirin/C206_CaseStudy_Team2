import java.time.LocalDate;

public class Item {
	private String Name;
	private String Description;
	private double StartPrice;
	private double minIncrement;
	private String startDate;
	private String endDate;
	
	


	public Item(String name,String description, double StartPrice, double minIncrement,String startDate,
			String endDate) {
		this.Name=name;
		this.Description = description;
		this.StartPrice = StartPrice;
		this.minIncrement = minIncrement;
		this.startDate = startDate;
		this.endDate = endDate;
	}




	public String getStartDate() {
		return startDate;
	}


	public String getEndDate() {
		return endDate;
	}




	public String getDescription() {
		return Description;
	}



	public double getStartPrice() {
		return StartPrice;
	}


	public double getMinIncrement() {
		return minIncrement;
	}
	
	public String getName() {
		return Name;
	}



	
	
	
	
}
