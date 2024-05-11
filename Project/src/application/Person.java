package application;
//5ls
public abstract class Person {
private String name;
private String contactNumber;
private String email;

public Person() {}


public Person(String name,String contactNumber) {
	
	this.name=name;
    setContactNumber(contactNumber);
}

public Person(String name,String contactNumber,String email) {
	
	setEmail(email);
	this.name=name;
    setContactNumber(contactNumber);
}
public abstract String identifyRole();

 public void setName(String name) {
	this.name=name;
}
 public void setContactNumber(String contactNumber)  throws IllegalArgumentException {
     if (isValidContactNumber(contactNumber)) {
         this.contactNumber = contactNumber;
     } else {
         throw new IllegalArgumentException("Invalid Contact number!");
     }
}
 public void setEmail(String Email) {
	 if (isValidEmail(Email)==0) {
		 this.email=Email;
     } else {
         throw new IllegalArgumentException("Invalid Email!");
     }
	}
 public String getName()
 {
	 return this.name;
 }
 public String getNumber()
 {
	 return this.contactNumber;
 }
 public String getEmail()
 {
	 return this.email;
 }
 private boolean isValidContactNumber(String contactNumber) {
     return contactNumber.length() == 11;
 }
 private int isValidEmail(String email) {
	 String x = email.substring(email.length()-4, email.length());
     return x.compareTo(".com");
 }
 
}
