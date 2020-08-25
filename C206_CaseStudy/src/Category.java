
public class Category {
	private String name;
	

	public Category(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
        String nam="";
        nam= String.format("%-10s\n",name);
                return nam;
    }
	
	
}