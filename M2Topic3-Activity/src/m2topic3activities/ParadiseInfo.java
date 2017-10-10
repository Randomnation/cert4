package m2topic3activities;
import javax.swing.JOptionPane;

public class ParadiseInfo {

	public static void main(String[] args) {
		
		double price;
		double discount;
		double savings;
		String discountprice, discountrate;
		
		discountprice = JOptionPane.showInputDialog(null, "Enter cutoff price for discount", "Discount Price", JOptionPane.INFORMATION_MESSAGE);
		price = Double.parseDouble(discountprice);

		discountrate = JOptionPane.showInputDialog(null, "Enter discount rate as a whole number", "Discount Rate", JOptionPane.INFORMATION_MESSAGE);
		discount = Double.parseDouble(discountrate);
		
		displayInfo();
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service over $" + price);
		System.out.println("Discount of " + discount + "%");
		System.out.println("That's a saving of at $" + savings);

	}
	
	public static void displayInfo() {
		
		System.out.println("Paradise Spa wants to pamper you.");
		System.out.println("We will make you look good");
	
	}
	
	public static double computeDiscountInfo(double pr, double dscnt) {
		
		double savings;
		savings = pr * dscnt/100;
		return savings;
	}

}
