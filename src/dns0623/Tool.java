package dns0623;

public class Tool {
	
	private String ToolCode;
	private String ToolType;
	private String Brand;
	private double DailyCharge;
	private boolean WeakDay;
	private boolean Weakend;
	private boolean Holiday;
	
	public Tool(String toolCode, String toolType, String brand, double dailyCharge, boolean weakDay, boolean weakend,
			boolean holiday) {
		super();
		ToolCode = toolCode;
		ToolType = toolType;
		Brand = brand;
		DailyCharge = dailyCharge;
		WeakDay = weakDay;
		Weakend = weakend;
		Holiday = holiday;
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
	public double getDailyCharge() {
		return DailyCharge;
	}
	public void setDailyCharge(double dailyCharge) {
		DailyCharge = dailyCharge;
	}
	public boolean isWeakDay() {
		return WeakDay;
	}
	public void setWeakDay(boolean weakDay) {
		WeakDay = weakDay;
	}
	public boolean isWeakend() {
		return Weakend;
	}
	public void setWeakend(boolean weakend) {
		Weakend = weakend;
	}
	public boolean isHoliday() {
		return Holiday;
	}
	public void setHoliday(boolean holiday) {
		Holiday = holiday;
	}
	
	


}
