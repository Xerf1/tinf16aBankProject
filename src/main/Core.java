package main;

import java.util.ArrayList;

public class Core {
	
	int id=10000;
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Core(){
	}
	
	public void SignUp(String pw, String ln, String n, String bd){
		Customer c = new Customer(pw, ln, n, bd);
		c.setCustomerID(id);
		customers.add(c);
		generateID();
	}
	public void generateID(){
		this.id++;
	}
	public int getCurrentID(){
		return this.id;
	}
	
	public boolean signIn(String pw, int id){
		boolean test= false;
		
		return test;
	}
}
