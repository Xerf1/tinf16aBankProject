package main;
import java.time.LocalDate;
import java.util.Date;

public class Customer {
	
	private int customerID;	
	private String password;
	private String name;
	private String lastName;
	private int age;
	private String birthDate;
	
	public Customer(String pw, String ln, String n, String bd){
		this.password = pw;
		this.lastName = ln;
		this.name = n;
		this.birthDate = bd;
		//setAge konvertieren
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public void addAcc(Customer customer){
		
	}
		
	public void addMortage(){
	}

	public void delAcc(){
	}

	public void query(){
	}

	public void deposit(){
	}

	public void widthDrawl(){
	}
}
