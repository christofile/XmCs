package L2S3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {
	@Id
	@Column(name = "Id")
	private int student_id;
	@Column(name = "FirstName")
	private String student_FirstName;
	@Column(name = "LastName")
	private String student_LastName;
	@Column(name = "email")
	private String student_email;
	@Column(name = "phone")
	private int student_phone;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_FirstName() {
		return student_FirstName;
	}
	public void setStudent_FirstName(String student_FirstName) {
		this.student_FirstName = student_FirstName;
	}
	public String getStudent_LastName() {
		return student_LastName;
	}
	public void setStudent_LastName(String student_LastName) {
		this.student_LastName = student_LastName;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public int getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(int student_phone) {
		this.student_phone = student_phone;
	}

	
}
