
public class Student {

	private String name;
	private String studentId;
	private String departmentName;
	
	public Student(String name, String studentId, String departmentName) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.departmentName = departmentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
