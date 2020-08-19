


public class bid{
	private int bidId;
	private String itemName;
	private String sellerEmail;
	private String buyerEmail;
	private double bidPrice;
	/**
	 * @param bidId
	 * @param itemName
	 * @param sellerEmail
	 * @param buyerEmail
	 * @param bidPrice
	 */
	public bid(int bidId, String itemName, String sellerEmail, String buyerEmail, double bidPrice) {
		super();
		this.bidId = bidId;
		this.itemName = itemName;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.bidPrice = bidPrice;
	}
	public int getBidId() {
		return bidId;
	}
	public String getItemName() {
		return itemName;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public double getBidPrice() {
		return bidPrice;
	}
	
	
	
	
	
}
