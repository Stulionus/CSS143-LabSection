package Labs.Lab9;

public class Student implements Comparable<Student>, Cloneable{
	private String name;
	private double GPA;

	public Student(String name, double GPA) {
		this.name = name;
		this.GPA = GPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public double getGPA() {
		return GPA;
	}

	@Override
	public int compareTo(Student other) {
		return Double.compare(this.GPA, other.GPA);
	}

	public Student clone() {
		try {
			return (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should not happen since Student implements Cloneable
			throw new AssertionError();
		}
	}

}
