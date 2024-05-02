//5ls
public abstract class Person {
private String name;
private String contactNumber;
private String email;

public Person(String name,String contactNumber,String email) {
	
	this.email=email;
	this.name=name;
    setContactNumber(contactNumber);
}
public abstract String identifyRole();

 public void setName(String name) {
	this.name=name;
}
 public void setContactNumber(String contactNumber) {
     if (isValidContactNumber(contactNumber)) {
         this.contactNumber = contactNumber;
     } else {
         throw new IllegalArgumentException("Invalid Contact number!");
     }
}
 public void setEmail(String Email) {
		this.email=Email;
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
 
}
