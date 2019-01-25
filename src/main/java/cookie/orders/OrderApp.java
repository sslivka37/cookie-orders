package cookie.orders;

import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		    MasterOrder myOrder = new MasterOrder();
		    myOrder.addOrder(new CookieOrder("Tagalongs", 1));
		    myOrder.addOrder(new CookieOrder("Thin Mints", 5));
		    myOrder.addOrder(new CookieOrder("Samoas", 2));
		    myOrder.addOrder(new CookieOrder("Tagalongs", 3));

		    System.out.println("Total boxes ordered: " +  myOrder.getTotalBoxes());

		    System.out.println("What would you like to remove? (variety or none)");
		    String varietyToRemove = input.nextLine();

		    myOrder.removeVariety(varietyToRemove);

		    System.out.println("Your final order");
		    myOrder.showOrder();

		}
		

	}


