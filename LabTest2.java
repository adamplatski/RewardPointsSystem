
public class LabTest2 {

	public static void main(String[] args) {
		System.out.print("Welcome to Price Saver discount store");
		
		ClubCard cc1 = new ClubCard();
		ClubCard cc2 = new ClubCard("Alex Baxter",4512,14.50);
		ClubCard cc = new ClubCard();
		
		cc1.display();
		cc2.display();
		
		cc.keyboardMemberInfo();
		cc.keyboardPurchase();
		cc.display();
		
		

	}



}