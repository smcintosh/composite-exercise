package ca.mcgill.ecse321.designpatterns.composite;

public class File implements Component {
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	@Override
	public String ls() {
		return name;
	}
}
