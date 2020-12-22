import java.util.Scanner;

public class ClubCard {

	private String name ;
	private int memberID;
	private double bonusPoints;
	
	Scanner input = new Scanner(System.in);


	public ClubCard() {
		
		name = "unknown";
		memberID = -1;
		bonusPoints = 0.0;
		
	}
	
	public ClubCard(String name, int memberID, double bonusPoints) {
		this.name = name;
		this.memberID = memberID;
		this.bonusPoints = bonusPoints;
	}
	
	public void keyboardMemberInfo() {
		
		System.out.print("\nEnter Name: ");
		name = input.nextLine();
		
		System.out.print("\nEnter member ID: ");
		memberID = input.nextInt();
		
		System.out.print("\nEnter bonus points: ");
		bonusPoints = input.nextDouble();
	}
		
	
	
	public void keyboardPurchase() {
		
	
		double price = 0;
		boolean priceChecker = false;
		
		while (!priceChecker) {
		
			System.out.print("\nEnter purchase amount: $");
			price = input.nextDouble();
		
			if (price < 0) {
				System.out.print("\npurchase must be greater than 0\n");
			}
			else {
				priceChecker = true;
			}
		
		}
		System.out.printf("\na $%.2f purchase has earned a $%.2f discount \n",price,calculateDiscount(price));
}
	
	private double calculateDiscount(double purchase) {
	
	
	bonusPoints = ((purchase/100) + bonusPoints);
	
	double discount = 0;
	
	if (purchase > 1000) {
		discount = purchase * 0.20;
	}
	else if (purchase > 500) {
		discount = purchase * 0.15;
	}
	else if(purchase <= 500) {
		discount = purchase * 0.10;
	}
	
	return discount;
	}
	
	public void display() {
		
		System.out.println("\nName:"+name);
		System.out.println("Member ID:" +memberID);
		System.out.println("Bonus Points:"+bonusPoints);
	}
		
		
	}