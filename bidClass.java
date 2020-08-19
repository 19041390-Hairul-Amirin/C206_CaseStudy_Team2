/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19026820, Aug 19, 2020 12:06:39 PM
 */

/**
 * @author 19026820
 *
 */
public class bidClass {
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
	public bidClass(int bidId, String itemName, String sellerEmail, String buyerEmail, double bidPrice) {
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
