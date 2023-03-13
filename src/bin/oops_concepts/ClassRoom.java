package oops_concepts;

public class ClassRoom {
	

	/**
	 * Data Encapsulation also called as Data Hiding
	 * Hiding the member variables of a class from other classes
	 */
	 
	private String sub;
	private int studCount;
	
	public void displayDetails() {
		
		System.out.println("This " + sub + " has " + studCount + "Students");
		
	}

	
	public String getSubj() {
		return sub;
	}

	public void setSubj(String subj) {
		this.sub = subj;
	}

	public int getStudCount() {
		return studCount;
	}

	public void setStudCount(int studCount) {
		this.studCount = studCount;
	}

	
}
