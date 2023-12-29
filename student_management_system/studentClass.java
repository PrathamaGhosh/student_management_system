package student_management_system;

public class studentClass {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentEmail;
	private String studentCity;
	
	public studentClass(int studentId, String studentName, String studentPhone, String studentEmail,String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.studentCity = studentCity;
	}

	public studentClass(String studentName, String studentPhone, String studentEmail, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.studentCity = studentCity;
	}

	public studentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "studentClass [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone="
				+ studentPhone + ", studentEmail=" + studentEmail + ", studentCity=" + studentCity + "]";
	}
	
	

}
