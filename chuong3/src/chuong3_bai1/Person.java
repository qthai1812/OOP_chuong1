package chuong3_bai1;

public class Person {
	private String name;
	private String dob;
	private String pob;
	private String dender;
	private String email;
	private String phone;

	public Person() {
	}

	public Person(String name, String dob, String pob, String dender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.dender = dender;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public String getDender() {
		return dender;
	}

	public void setDender(String dender) {
		this.dender = dender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", dender=" + dender + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
