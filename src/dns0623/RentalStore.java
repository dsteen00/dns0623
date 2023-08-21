package dns0623;

import java.util.*;

public class RentalStore {
	
	private List<Tool> ToolList = new ArrayList<Tool>();
	private List<String> CodeList = new ArrayList<String>();
	private Scanner UserInput = new Scanner(System.in);
	private String Tcode = new String();
	private int discount = 0;
	private Calendar RentalDate = Calendar.getInstance();
	private int RentDay = 0;
	private int RentMonth = 0;
	private int RentYear = 0;
	private int DaysRented = 0;
	
	public RentalStore() {
		Tool ChainsawTool = new Tool("CHNS","Chainsaw","Stihl",1.49,true,false,true);
		Tool LadderTool = new Tool("LADW","Ladder","Werner",1.99,true,true,false);
		Tool JAKDTool = new Tool("JAKD","Jackhammer","DeWalt",2.99,true,false,true);
		Tool JAKRTool = new Tool("JAKR","Jackhammer","Ridgid",2.99,true,false,true);
		
		ToolList.add(ChainsawTool);
		ToolList.add(LadderTool);
		ToolList.add(JAKDTool);
		ToolList.add(JAKRTool);
		
		CodeList.add("CHNS");
		CodeList.add("LADW");
		CodeList.add("JAKD");
		CodeList.add("JAKR");
		
	}
	
	
	
	//RentalStore DerrickStore = new RentalStore();
	public void runStore() {
		int j = 0;
		while(j == 0) {
			try {
				System.out.println("Derrick's Tool Rental");
				System.out.print("Enter Tool Code:");
				Tcode = getToolCode(CodeList, UserInput);
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
				RentalAgreement Rental = new RentalAgreement(returnTool(Tcode),DaysRented,RentalDate.getTime(),discount);
				Rental.printRentalAgreement();
				j++;
			}
	
			catch(IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
		UserInput.close();
	}
	
	public static String getToolCode(List<String> TL, Scanner UI) {
		String i = UI.nextLine();
		if (!TL.contains(i)) {
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
		if (i<1 || i >13) {
			throw new IllegalArgumentException("Please Enter a valid month");
		}
		return i-1;
	}
	
	public static int getRentalYear(Scanner UI) {
		int i = UI.nextInt();
		if (i<2000 || i > 2999) {
			throw new IllegalArgumentException("Please Enter a valid year");
		}
		return i;
	}
	
	public static int getRentalDays(Scanner UI) {
		int i = UI.nextInt();
		if (i<=0) {
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
	
	public Tool returnTool(String ToolRequested) {
		
		int i = CodeList.indexOf(ToolRequested);
		Tool ReturnTool = ToolList.get(i);
		return ReturnTool;
		
	}

	public List<String> getCodeList() {
		return CodeList;
	}

}
