package dns0623;

import java.util.*;

public class RentalStore {
	
	private List<Tool> ToolList = new ArrayList<Tool>();
	private List<String> CodeList = new ArrayList<String>();
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
	
	public Tool returnTool(String ToolRequested) {
		
		int i = CodeList.indexOf(ToolRequested);
		Tool ReturnTool = ToolList.get(i);
		return ReturnTool;
		
	}

	public List<String> getCodeList() {
		return CodeList;
	}

}
