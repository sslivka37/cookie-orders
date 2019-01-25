import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cookie.orders.CookieOrder;
import cookie.orders.MasterOrder;

public class CookieTest {
	
	 @Test
	    public void shouldReturnTotalBoxeAsOne() {
	        MasterOrder underTest = new MasterOrder();
	        underTest.addOrder(new CookieOrder("", 1));
	        int check = underTest.getTotalBoxes();
	        assertEquals(1, check);
	    }

	    @Test
	    public void shouldReturnTotalBoxesAsTwo() {
	        MasterOrder underTest = new MasterOrder();
	        underTest.addOrder(new CookieOrder("", 1));
	        underTest.addOrder(new CookieOrder("", 1));
	        int check = underTest.getTotalBoxes();
	        assertEquals(2, check);
	    }

	    @Test
	    public void shouldReturnTotalBoxesAsOneAfterRemoval() {
	        MasterOrder underTest = new MasterOrder();
	        underTest.addOrder(new CookieOrder("plain", 1));
	        underTest.addOrder(new CookieOrder("mint", 1));
	        underTest.removeVariety("plain");
	        int check = underTest.getTotalBoxes();
	        assertEquals(1, check);
	    }

	    @Test
	    public void shouldReturnTotalBoxesAsOneAfterRemovalOfAllPlain() {
	        MasterOrder underTest = new MasterOrder();
	        underTest.addOrder(new CookieOrder("plain", 1));
	        underTest.addOrder(new CookieOrder("plain", 1));
	        underTest.addOrder(new CookieOrder("mint", 1));
	        underTest.removeVariety("plain");
	        int check = underTest.getTotalBoxes();
	        assertEquals(1, check);

	    }
	}


