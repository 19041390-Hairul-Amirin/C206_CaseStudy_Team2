import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Item i1;
	private ArrayList<Item> itemList;
	private User u1;
	private ArrayList<User> UserList;


	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		i1 = new Item("Ball", "Round Ball", 10, 2, "20/8/2020", "25/8/2020");

	}

	@After
	public void tearDown() throws Exception {
		i1 = null;
		itemList = null;
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test // Done by Hairul
	public void addItemTest() {
		assertNotNull("Check if there is valid item arraylist to add to", itemList);
		ItemDB.addItem(itemList);

		assertEquals("Check that Item arraylist size is 1", 1, itemList.size());
		assertSame("Check that Item is added", i1, itemList.get(0));
	}

	@Test // Done by Hairul
	public void retrieveAllItemTest() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid item arraylist to retrieve item", itemList);

		String allItem = ItemDB.retrieveAllItem(itemList);
		String testOutput = "";
		assertEquals("Test that the retrieved itemList is empty?", testOutput, allItem);

	}

	@Test // Done by Hairul
	public void deleteItemTest() {

		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", itemList);

		// check if arraylist has an item inside
		assertEquals("Test that CustomerList arraylist size is 1", 1, itemList.size());

		// remove customer
		itemList.remove(0);

		// Test if the code list has worked
		assertEquals("Test that ItemList arraylist size is 1", 0, itemList.size());
	}

	@Test// Done by Hairul
	public void updateItemTest() {
		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", itemList);
		
		//update for item
		i1=new Item("Box", "Round Ball", 11, 2, "20/10/2020", "25/10/2020");
		itemList.set(0,i1);
		
		//check if item updated
		assertEquals("Test if name values are added into ArrayList ",i1.getName(),itemList.get(0).getName());
		assertEquals("Test if description values are added into ArrayList ",i1.getDescription(),itemList.get(0).getDescription());
		assertEquals("Test if bid increament values are added into ArrayList ",i1.getMinIncrement(),itemList.get(0).getMinIncrement());


	}
	@Test// Done by Hairul
	public void searchItemTest() {
		assertNotNull("check if arraryList is empty", itemList);
		assertNotNull("Test if there is valid item arraylist to retrieve item", itemList);
		
	}
	@Test// Done by Junwei
	
	public void deleteTest() {
		//check that user list is not null.
		assertNotNull("Check if there is no empty user List, UserList");
		// remove customer
		UserList.remove(0);
	}
	
	@Test// Done by Junwei
	public void addTest() {
	// check if arraylist has an item inside
		assertEquals("Test that UserList arraylist size is 1", 1, UserList.size());
	}
	
	@Test // Done by Junwei
	public void viewTest() {
		//check that user is added into UserList
		assertEquals("Check that User arraylist size is 1", 1, UserList.size());
		assertSame("Check that User is added", u1, UserList.get(0));
		
			
		}
		  
	}


