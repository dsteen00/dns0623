package dns0623;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	List<Tool> ToolList = new ArrayList<Tool>();

	public List<Tool> getToolList() {
		return ToolList;
	}

	public void addTool(Tool T1) {
		ToolList.add(T1);
	}
	
	public void addTool(String tC, String tT, String bd, double dC, boolean wD, boolean wd,
			boolean hy) {
		Tool T1 = new Tool(tC,tT,bd,dC,wD,wd,hy);
		ToolList.add(T1);
	}
	
	public void removeTool(Tool T1) {
		ToolList.remove(T1);
	}
	

}
