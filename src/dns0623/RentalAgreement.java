package dns0623;

import java.util.Date;
import java.io.*;

public class RentalAgreement {
	
	private String ToolCode;
	private String ToolType;
	private String Brand;
	private int RentalDays;
	private Date RentalDate;
	private int ChargeDays;
	private double PreDiscount;
	private int Discount;
	private double DiscountAmount;
	private double FinalCharge;
	
	public RentalAgreement(String toolCode, String toolType, String brand, int rentalDays, Date rentalDate,
			int chargeDays, double preDiscount, int discount, double discountAmount, double finalCharge) {
		ToolCode = toolCode;
		ToolType = toolType;
		Brand = brand;
		RentalDays = rentalDays;
		RentalDate = rentalDate;
		ChargeDays = chargeDays;
		PreDiscount = preDiscount;
		Discount = discount;
		DiscountAmount = discountAmount;
		FinalCharge = finalCharge;
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
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
		System.out.print("Tool code: ");
		System.out.println(ToolCode);
	}
	
}
