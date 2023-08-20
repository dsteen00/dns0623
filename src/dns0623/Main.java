package dns0623;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		RentalStore DerrickStore = new RentalStore();
		Scanner UserInput = new Scanner(System.in);
		String Tcode = new String();
		int discount = 0;
		Calendar RentalDate = Calendar.getInstance();
		int RentDay = 0;
		int RentMonth = 0;
		int RentYear = 0;
		int DaysRented = 0;
		
		try {
			System.out.println("Derrick's Tool Rental");
			System.out.print("Enter Tool Code:");
			Tcode = getToolCode(DerrickStore, UserInput);
			System.out.printf("You have requested %s%n", Tcode);
			System.out.println("Enter Year for Rental YYYY:");
			RentYear = getRentalYear(UserInput);
			System.out.println("Enter Month for Rental MM:");
			RentMonth = getRentalMonth(UserInput);
			System.out.println("Enter Date for Rental DD:");
			RentDay = getRentalDate(RentMonth, UserInput);
			System.out.println("Number of days renting:");
			DaysRented = getRentalDays(UserInput);
			System.out.println("Discount 0%-100%:");
			discount = getDiscount(UserInput);
			RentalDate.set(RentYear, RentMonth, RentDay);
			RentalAgreement Rental = new RentalAgreement(DerrickStore.returnTool(Tcode),DaysRented,RentalDate.getTime(),discount);
			Rental.printRentalAgreement();
		}
		
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		UserInput.close();
			
	}
	
	public static String getToolCode(RentalStore RS, Scanner UI) {
	
		String i = UI.nextLine();

		List<String> ToolList = RS.getCodeList();
		if (!ToolList.contains(i)) {
			throw new IllegalArgumentException("Please Enter a valid tool code");
		}
		return i;
	}
	
	public static int getRentalDate(int month, Scanner UI) {
		int i = UI.nextInt();
		if ((month == 4 || month == 6 || month == 9 || month == 11) && (i > 30 || i<0)) {
			throw new IllegalArgumentException("Please Enter a valid date");
		}
		if (month == 2 && (i > 29 || i<0)) {
			throw new IllegalArgumentException("Please Enter a valid date");
		}
		if (i>31) {
			throw new IllegalArgumentException("Please Enter a valid date");
		}
		return i;
	}
	
	public static int getRentalMonth(Scanner UI) {
		int i = UI.nextInt();
		if (i<0 || i >12) {
			throw new IllegalArgumentException("Please Enter a valid month");
		}
		return i;
	}
	
	public static int getRentalYear(Scanner UI) {
		int i = UI.nextInt();
		if (i<1000 || i > 9999) {
			throw new IllegalArgumentException("Please Enter a valid year");
		}
		return i;
	}
	
	public static int getRentalDays(Scanner UI) {
		int i = UI.nextInt();
		if (i<0) {
			throw new IllegalArgumentException("Please Enter a number greater than 0");
		}
		return i;
	}
	
	public static int getDiscount(Scanner UI) {
		int i = UI.nextInt();
		if (i<0 || i >100) {
			throw new IllegalArgumentException("Please Enter a number between 0 and 100");
		}
		return i;
	}
	

}
