package zad_3;

import java.util.Date;
import java.util.regex.*;

public class LoanApplication {
private String firstName;
private String surname;
private String pesel;
private String nip;
private String bankAccountNumber;
private Date dateOfBirth;
private String gender;

public LoanApplication(String firstName, String surname, String pesel, String nip, String bankAccountNumber, Date dateOfBirth, String gender){ 
	this.firstName = firstName;
	this.surname = surname;
	this.pesel = pesel;
	this.nip = nip;
	this.bankAccountNumber = bankAccountNumber;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
}
public LoanApplication() {}

 private boolean checkFirstName(String firstName){
	 if (firstName == null)
		 return false;
	 else if(firstName.length() < 2 )
         return false;
	 else if (! validatePattern(firstName , "^[a-zA-Z]*$" ))
		 return false;
	 else 
		 return true;
 }
 private boolean checkDateOfBirth(Date dateOfBirth, String pesel){
 if (dateOfBirth == pesel)
	 return true;
 }
public String getFirstName(){
	return firstName;
}
public void setFirstName(String firstName ){
	if (checkFirstName(firstName))
		this.firstName = firstName;
	else 
		System.out.println("First Name Error:" + firstName);
}
public String getSurname(){
	return surname;
}

public void setSurname(String surname){
	this.surname = surname;
}

public String getPesel(){
	return pesel;
}

public void setPesel(String pesel){
	this.pesel = pesel;

}public String getNip(){
	return nip;
}

public void setNip(String nip){
	this.nip = nip;
}
public String getBankAccountNumber(){
	return bankAccountNumber;
}
public void setBankAccountNumber( String bankAccountNumber){
	this.bankAccountNumber = bankAccountNumber;
}

public Date getDate(){
	return dateOfBirth;
}
public void setDate(Date dateOfBirth){
	this.dateOfBirth = dateOfBirth;
}
public String getGender(){
	return gender;
}

public void setGender(String gender){
	this.gender = gender;
}
@Override 
public String toString(){
	return "Applicant [firstName=" + firstName + ", surname=" + surname + ", pesel=" + pesel + ", nip=" + nip
			+ ", bankAccountNumber=" + bankAccountNumber + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
+ "]";
}

static private boolean validatePattern(String valData, String patternString){
	Pattern pattern = Pattern.compile(patternString);
	Matcher matcher = pattern.matcher(valData);
	if(!matcher.matches())
		return false;
	else 
		return true;
	
}

}
