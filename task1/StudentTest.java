import java.util.ListIterator;
import java.util.Vector;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> vector = new Vector<>(3,3);
		Student student1 = new Student("Mike", "11000", "Computer Science");
		Student student2 = new Student("David", "11002", "Computer Science");
		Student student3 = new Student("Chris", "11003", "Mathematics");
		Student student4 = new Student("Tyson", "11004", "Information Systems");
		vector.add(student1);
		vector.add(student2);
		vector.add(student3);
		System.out.println("The current capacity of Vector is "+vector.capacity());
		vector.add(student4);
		System.out.println("The current capacity of Vector is "+vector.capacity());
		ListIterator<Student> listIterator = vector.listIterator();
		while(listIterator.hasNext()) {
			Student student = listIterator.next();
			System.out.println("Forward Iteration********");
			System.out.println("Student Name "+student.getName());
		}
		
		while(listIterator.hasPrevious()) {
			Student student = listIterator.previous();
			System.out.println("Backwards Iteration********");
			System.out.println("Student Name "+student.getName());
		}

	}

}
