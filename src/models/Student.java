package models;

public class Student {
	private String studentId;
	private String fullName;
	private String dateOfBirth;
	private String address;
	private String gender;
	private String timeImport;
	
	public Student() {
	
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTimeImport() {
		return timeImport;
	}

	public void setTimeImport(String timeImport) {
		this.timeImport = timeImport;
	}
}
