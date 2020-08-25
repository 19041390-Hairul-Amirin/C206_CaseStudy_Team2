import java.util.ArrayList;

public class UserMethod {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		ArrayList<User> UserList = new ArrayList<User>();

	    int option = 0;
	    while (option!=5 ) {
	    	UserMethod.menu();
	      option = Helper.readInt("Enter option > ");
	      
	      if (option == 1) {
	        // View all user
	    	  UserMethod.veiwAllUser(UserList);
	        
	      }else if (option ==2) {
	        
	        //ADD item
	    	  UserMethod.itemTypeMenu();
	        int itemType = Helper.readInt("Enter option to select item type > ");  
	        if(itemType==1){
	          //Add User
	        	UserMethod.addUser(UserList);
	        }else if (itemType == 2) {
	          //ADD item
	          
	        }else if (itemType == 3) {
	          // Add deal
	          
	        }else if (itemType ==4) {
	          // Add category
	        
	        }else {
	          System.out.println("INVALID TYPE");
	        }
	      }else if (option == 3) {
	        //Delete item
	    	  UserMethod.DeleteMenu();
	        int DeleteItem = Helper.readInt("Enter option to select item type > ");  
	        
	        if(DeleteItem==1){
	          //Delete User
	        	UserMethod.deleteuser(UserList);
	        }else if (DeleteItem == 2) {
	          //Delete item
	          
	        }else if (DeleteItem == 3) {
	          // Delete deal
	          
	        }else if(DeleteItem == 4) {
	          // Delete category
	          
	        }else {
	          System.out.println("INVALID TYPE");
	        }
	      }else if (option ==4) {
	        System.out.println("BYE!");
	      }else {
	        System.out.println("Invalid option");
	      }
	      }
	    }

	  private static void deleteuser(ArrayList<User> UserList) {
		  UserMethod.veiwAllUser(UserList);
	    String email = Helper.readString("Enter email to delete: ");
	    for (int i = 0; i < UserList.size(); i++) {
	      if(email.equals(UserList.get(i).getEmail())) {
	        UserList.remove(i);
	        System.out.println("User deleted");
	      }else {
	        System.out.println("User cannot be deleted");
	      }
	    }
	  }

	  private static void DeleteMenu() {
	    // TODO Auto-generated method stub
		  UserMethod.setHeader("DELETE ITEM");
	    System.out.println("1. User");
	    System.out.println("2. item");
	    System.out.println("3. deal");
	    System.out.println("4. category");
	  }

	  private static void menu() {
	    // TODO Auto-generated method stub
		  UserMethod.setHeader("CAMPUS ONLINE AUCTION SHOP");
	    System.out.println("1. Display Inventory");
	    System.out.println("2. Add Item");
	    System.out.println("3. Delete Item");
	    System.out.println("4. Exit");
	    System.out.println("5. Update User");
	    System.out.println("6. View User");
	  }

	  private static void itemTypeMenu() {
	    // TODO Auto-generated method stub
		  UserMethod.setHeader("ITEM TYPE");
	    System.out.println("1. User");
	    System.out.println("2. item");
	    System.out.println("3. deal");
	    System.out.println("4. category");
	  }

	  private static void veiwAllUser(ArrayList<User> UserList) {
	    // TODO Auto-generated method stub
		  UserMethod.setHeader("USER LIST");
	    String output = String.format("%-10s %-10s %-20s %-10s \n", "name", "role", "email", "password");
	    for (int i = 0; i < UserList.size(); i++) {
	      output += String.format("%-10s %-20s %5s %-5s \n", UserList.get(i).getName(),
	          UserList.get(i).getRole(),UserList.get(i).getEmail(),UserList.get(i).getPassword());
	    }
	    System.out.println(output);
	  }
	  
	  private static void addUser(ArrayList<User> UserList) {

	    String name = Helper.readString("Enter name: ");
	    String role = Helper.readString("Enter role: ");
	    String email = Helper.readString("Enter email: ");
	    String password = Helper.readString("Enter password: ");
	    
	    UserList.add(new User (name, role, email, password));
	    System.out.println("User added");
	  }
	  
	  //can't do
	  public static void searchKeyword(ArrayList<User> UserList) {
			
			String User = Helper.readString("Enter User: > " );
			Helper.readInt("Enter New User ID: > ");
			Helper.readInt("Enter ID: >");
			
			for(int i=0 ; i<UserList.size();i++) {
				if(User == UserList.get(i).getName()) {
				System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", UserList.get(i).getName(), UserList.get(i).getEmail()));		
				}
				else if(User == UserList.get(i).getEmail()) {
					System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s", UserList.get(i).getName(), UserList.get(i).getEmail()));
				}
				else {
					System.out.println("Error!");
				}
			}
			// can't do
		}
		public static void UserList(ArrayList<User> UserList) {
			
			Helper.readInt("Enter User: > ");
			Helper.readDouble("Enter new User to update : > ");
			
			
				}
			
		

	  private static void setHeader(String header) {
	    // TODO Auto-generated method stub
	    Helper.line(80, "-");
	    System.out.println(header);
	    Helper.line(80, "-");
	    
	    
	  }
	}
