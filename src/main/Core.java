package main;

import java.util.ArrayList;

public class Core {
	
	private Customer currentCustomer;	
	private int id=10000;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
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
	
	public Customer getCurrentCustomer(){
		return currentCustomer;
	}
	public int findCustomer(int id){
		for(int i = 0; i<customers.size();i++){
			if(customers.get(i).getCustomerID()==id){
				currentCustomer = customers.get(i);
				return 1;
			}
		}
		return 0;
	}
	
	public boolean signIn(String pw, int id){
		boolean test= false;
		if (findCustomer(id)==1){
			String UserPassword = currentCustomer.getPassword();
			if(UserPassword.equals(pw)){
				test = true;
			}
		}
		return test;
	}
	
	public Customer getCustomer(int i){
		return customers.get(i);
	}
}
