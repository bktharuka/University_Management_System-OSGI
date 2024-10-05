package studentpublisher;

public class Student {

  String ID, name,  address, contactNo, year, gender;
  
  public Student() {
	  
  }
  
	public Student(String iD, String name,  String address, String contactNo, String year , String gender) {
		super();
		
		ID = iD; 
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.year = year;
		this.gender = gender;
	}
	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}
	
	public String getGender() {
		return gender; 
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
  
}
