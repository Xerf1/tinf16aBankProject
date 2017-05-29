package main;
import java.time.LocalDate;
import java.util.*;

public class Customer {
	
	protected int customerID;
	protected String password;
	private String firstName;
	private String lastName;
	private int age;
	private String birthDate;
	
	public Customer(String pw, String ln, String n, String bd){
		this.password = pw;
		this.lastName = ln;
		this.firstName = n;
		this.birthDate = bd;
	}

	ArrayList<Integer> acc = new ArrayList<>();
	ArrayList<Integer> mort = new ArrayList<>();
	ArrayList<Integer> transaction = new ArrayList<>();



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setfirstName(String name) {
		this.firstName = name;
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

	public String getBirthDate() {
		return birthDate;
	}

	public String getPassword() {
		return password;
	}

	
	
	public void addAcc(Customer customer){
		
	}
		
	public void addMortage(){
	}

	public void delAcc(int accID){
	}

	public void getBalance(int accID, int pin){
	}

	public void getAllBalance(int accID){

	}

	public void deposit(double value, int pin, int accID){
	}

	public void widthDrawl(double value, int pin, int accID){
	}

	public Transaction getTransaction(int index){
		return x;
	}

	public int countTransactions(){
		return x;
	}

	public void transaction(Core.Account from, Core.Account target, double amount){

	}

	public Core.Account lookUpAccount(int id){
		return x;
	}

}
