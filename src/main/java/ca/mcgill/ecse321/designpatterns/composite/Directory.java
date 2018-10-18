package ca.mcgill.ecse321.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
	private String name;
	private List<Component> children;
	
	public Directory(String name) {
		this.name = name;
		children = new ArrayList<Component>();
	}
	
	public void add(Component comp) {
		children.add(comp);
	}
	
	@Override
	public String ls() {
		String rtn = name;
		
		for (Component comp : children) {
			rtn += System.lineSeparator() + comp.ls(); 
		}
		
		return rtn;
	}
}
