package m2topic3activities;
import javax.swing.JOptionPane;

public class CreateSpaServices {

	public static void main(String[] args) {
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		firstService = getData(firstService);
		secondService = getData(secondService);
		
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
		
	}
	
	public static SpaService getData(SpaService s) {
		
		double price;
		String service = JOptionPane.showInputDialog(null, "Enter Service", "Service Details", JOptionPane.INFORMATION_MESSAGE);
		String serviceprice = JOptionPane.showInputDialog(null, "Enter Price", "Service Price Details", JOptionPane.INFORMATION_MESSAGE);
		price = Double.parseDouble(serviceprice);
		
		s.setServiceDescription(service);
		s.setPrice(price);
		
		return s;
	}

}
