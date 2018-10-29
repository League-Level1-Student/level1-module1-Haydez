public class PARTdOS {
	private String name;
	private String superpower;
	PARTdOS(String name, String superpower){
		this.name = name;
		this.superpower = superpower;
	}
	void setName(String name) {
		this.name = name;
	}
	void setSuperpower (String superpower) {
		this.superpower = superpower;
	}
	
	String getName() {
		return name;
	}
	String getSuperpower() {
		return superpower;
	}
	public String toString() {
		return name + " has a superpower, " + superpower;
	}
}
