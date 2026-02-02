import java.util.Comparator;

public class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public int getrollno() {
		return rollno;
	}
	public String getname() {
		return name;
	}
	public String getaddress() {
		return address;
	}
}
//sorting by rollno ascending
class SortRollNo implements Comparator<Student>{
    @Override
    
    public int compare(Student s1, Student s2){
        return s1.getrollno() - s2.getrollno();
    }
}
//sort by name
class SortName implements Comparator<Student>{
	
    @Override
    
    public int compare(Student s1, Student s2) {
        return s1.getname().compareToIgnoreCase(s2.getname());
    }
    
}