import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Item i1;
	private ArrayList<Item> itemList;

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

	@Test
	public void addItemTest() {
		assertNotNull("Check if there is valid Camcorder arraylist to add to", itemList);
		ItemDB.addItem(itemList);

		assertEquals("Check that Item arraylist size is 1", 1, itemList.size());
		assertSame("Check that Item is added", i1, itemList.get(0));
	}

	@Test
	public void retrieveAllItem() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", itemList);

		String allItem = ItemDB.retrieveAllItem(itemList);
		String testOutput = "";
		assertEquals("Test that the retrieved itemList is empty?", testOutput, allItem);

	}

	@Test
	public void deleteItemTest() {

	}

}
