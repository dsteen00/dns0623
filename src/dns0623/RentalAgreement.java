package dns0623;

import java.util.Date;

public class RentalAgreement {
	
	private String ToolCode;
	private String ToolType;
	private String Brand;
	private int RentalDays;
	private Date RentalDate;
	private int ChargeDays;
	private Date DueDate;
	private double DailyCharge;
	private double PreDiscount;
	private int Discount;
	private double DiscountAmount;
	private double FinalCharge;
	

	
	public RentalAgreement(String toolCode, String toolType, String brand, int rentalDays, Date rentalDate,
			int chargeDays, Date dueDate, double dailyCharge, double preDiscount, int discount, double discountAmount,
			double finalCharge) {
		ToolCode = toolCode;
		ToolType = toolType;
		Brand = brand;
		RentalDays = rentalDays;
		RentalDate = rentalDate;
		ChargeDays = chargeDays;
		DueDate = dueDate;//Find your due date value here using the rental date and adding the chargeDays too it.
		DailyCharge = dailyCharge;
		PreDiscount = preDiscount;//Find the prediscount charge
		Discount = discount;
		DiscountAmount = discountAmount;//find how much money they're saving
		FinalCharge = finalCharge;//find final charge
		
		//use calender instance to find weekdays and holidays
	}
	
	public String getToolCode() {
		return ToolCode;
	}
	public void setToolCode(String toolCode) {
		ToolCode = toolCode;
	}
	public String getToolType() {
		return ToolType;
	}
	public void setToolType(String toolType) {
		ToolType = toolType;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRentalDays() {
		return RentalDays;
	}
	public void setRentalDays(int rentalDays) {
		RentalDays = rentalDays;
	}
	public Date getRentalDate() {
		return RentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		RentalDate = rentalDate;
	}
	public int getChargeDays() {
		return ChargeDays;
	}
	public void setChargeDays(int chargeDays) {
		ChargeDays = chargeDays;
	}
	public double getPreDiscount() {
		return PreDiscount;
	}
	public void setPreDiscount(double preDiscount) {
		PreDiscount = preDiscount;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public double getDiscountAmount() {
		return DiscountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		DiscountAmount = discountAmount;
	}
	public double getFinalCharge() {
		return FinalCharge;
	}
	public void setFinalCharge(double finalCharge) {
		FinalCharge = finalCharge;
	}
	
	public void printRentalAgreement() {
		System.out.println("Rental Agreement");
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool type: ");
		System.out.println(ToolType);
		System.out.print("Brand: ");
		System.out.println(Brand);
		System.out.print("Rental Days: ");
		System.out.println(RentalDays);
		System.out.print("Check out Date: ");
		System.out.println(RentalDate);
		System.out.print("Due Date: ");
		System.out.println(DueDate);
		System.out.print("Daily Rental Charge: $");
		System.out.println(ToolCode);
		System.out.print("Charge Days: ");
		System.out.println(DailyCharge);
		System.out.print("Pre-discount Charge: $");
		System.out.println(PreDiscount);
		System.out.print("Discount Percent: ");
		System.out.print(Discount);
		System.out.println("%");
		System.out.print("Discount Amount: $");
		System.out.println(DiscountAmount);
		System.out.print("Final Charge: $");
		System.out.println(FinalCharge);
	}
	
}
