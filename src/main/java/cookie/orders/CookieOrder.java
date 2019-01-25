package cookie.orders;

public class CookieOrder {
	private int numBoxes;
	private String variety;



	public int getNumBoxes(){
	    return numBoxes;
	}

	public String getVariety(){
	    return variety;
	}

	public CookieOrder(String variety, int numBoxes){
	    this.numBoxes = numBoxes;
	    this.variety = variety;

	}

}
