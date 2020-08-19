import java.time.LocalDate;

public class Item {
	private int ID;
	private String Description;
	private String Price;
	private String minIncrement;
	private Boolean IsAvailable;
	private LocalDate startDate;
	private LocalDate endDate;
	
	


	public Item(int ID, String description, String price, String minIncrement, Boolean isAvailable, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.ID = ID;
		this.Description = description;
		Price = price;
		this.minIncrement = minIncrement;
		IsAvailable = isAvailable;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public int getID() {
		return ID;
	}


	public String getDescription() {
		return Description;
	}



	public String getPrice() {
		return Price;
	}


	public String getMinIncrement() {
		return minIncrement;
	}



	public Boolean getIsAvailable() {
		return IsAvailable;
	}


	public void setIsAvailable(Boolean isAvailable) {
		IsAvailable = isAvailable;
	}
	
	
	
}
