package dns0623;

import java.util.Calendar;
import java.util.Date;

public class RentalAgreement {
	
	private Tool rentalTool;
	private int RentalDays;
	private Date RentalDate;
	private int ChargeDays;
	private Date DueDate;
	private double PreDiscount;
	private int Discount;
	private double DiscountAmount;
	private double FinalCharge;
	

	
	public RentalAgreement(Tool rTool, int rentalDays, Date rentalDate,
			int discount) {
		rentalTool = rTool;
		//ToolCode = toolCode;
		//ToolType = toolType;
		//Brand = brand;
		RentalDays = rentalDays;
		RentalDate = rentalDate;
		ChargeDays = findChargeDays(rentalDays,rentalDate,rTool.isWeakend(), rTool.isHoliday());
		DueDate = findDueDate( rentalDays, rentalDate);//dueDate;//Find your due date value here using the rental date and adding the chargeDays too it.
		//DailyCharge = dailyCharge;
		PreDiscount = findPreDiscount(rTool.getDailyCharge(),ChargeDays);//Find the prediscount charge
		Discount = discount;
		DiscountAmount = findDiscountAmount(PreDiscount, discount);//find how much money they're saving
		FinalCharge = findFinalCharge(PreDiscount, DiscountAmount);//find final charge
		
		//use calender instance to find weekdays and holidays
	}
	
	private int findChargeDays(int days, Date Rdate, boolean weekends, boolean holidays) {
		Calendar C = Calendar.getInstance();
		C.setTime(Rdate);
		
		Calendar TheForth = Calendar.getInstance();
		
		TheForth.set(Calendar.YEAR, C.get(Calendar.YEAR));
		
		TheForth.set(Calendar.DAY_OF_MONTH, 4);
		
		TheForth.set(Calendar.MONTH, Calendar.JULY);
		
		if(TheForth.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			TheForth.add(Calendar.DATE, -1);
		}
		
		if(TheForth.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			TheForth.add(Calendar.DATE, 1);
		}
		
		int fdays = 0;
		int i = 0;
		while(i<days) {
			C.add(Calendar.DATE, i);
			int dayOfTheWeek = C.get(Calendar.DAY_OF_WEEK);
			if(weekends == true) {
				if(dayOfTheWeek == Calendar.SUNDAY || dayOfTheWeek == Calendar.SATURDAY) {
					fdays++;
				}
			}
			if(holidays == true) {
				if(TheForth.getTime() == C.getTime()) {
					fdays++;
				}
				if(C.get(Calendar.DAY_OF_MONTH) == Calendar.SEPTEMBER && C.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY && C.get(Calendar.DAY_OF_MONTH) < 8) {
					fdays++;
				}
			}
			i++;
		}
		return days - fdays;
	}
	
	private Date findDueDate(int days, Date Rdate) {
		Calendar C = Calendar.getInstance();
		C.setTime(Rdate);
		C.add(Calendar.DATE,days);
		return C.getTime();
	}
	
	private double findPreDiscount(double dcharge, int Charday) {
		return dcharge*Charday;
	}
	
	private double findDiscountAmount(double PreChar, int Percent) {
		return PreChar*Percent*.01;
	}
	
	private double findFinalCharge(double PreChar, double disAmount) {
		return PreChar - disAmount;
	}
	
	public void printRentalAgreement() {
		
		Calendar C = Calendar.getInstance();
		
		System.out.println("Rental Agreement");
		System.out.print("Tool code: ");
		System.out.println(rentalTool.getToolCode());
		System.out.print("Tool type: ");
		System.out.println(rentalTool.getToolType());
		System.out.print("Brand: ");
		System.out.println(rentalTool.getBrand());
		System.out.print("Rental Days: ");
		System.out.println(RentalDays);
		C.setTime(RentalDate);
		System.out.printf("Check out Date: %d/%d/%d%n", C.get(Calendar.MONTH)+1,C.get(Calendar.DAY_OF_MONTH),C.get(Calendar.YEAR)-2000);
		C.setTime(DueDate);
		System.out.printf("Due Date: %d/%d/%d%n", C.get(Calendar.MONTH)+1,C.get(Calendar.DAY_OF_MONTH),C.get(Calendar.YEAR)-2000);
		System.out.printf("Daily Rental Charge: $%4.2f%n", rentalTool.getDailyCharge());
		System.out.print("Charge Days: ");
		System.out.println(ChargeDays);
		System.out.printf("Pre-discount Charge: $%4.2f%n", PreDiscount);
		System.out.print("Discount Percent: ");
		System.out.print(Discount);
		System.out.println("%");
		System.out.printf("Discount Amount: $%4.2f%n", DiscountAmount);
		System.out.printf("Final Charge: $%4.2f%n", FinalCharge);
	}
	
}
