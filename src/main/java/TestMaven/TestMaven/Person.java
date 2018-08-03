package TestMaven.TestMaven;

public class Person {
	
	String address="";
	String phone="";
	
	public String prints() {
		System.out.println("Phone Number is: "+phone);
		return phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
