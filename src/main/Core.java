package main;

import java.util.ArrayList;

public class Core {
	
	static int id=10000;
	ArrayList<Customer> customers = new ArrayList<Customer>();
	private int currentID;
	private String currentPassword;
	
	
	public Core(){
	}
	

	public void addAcc(){

    	}

 	public void addMortage(){

    	}

    	public void delAcc(int accID, String password){

    	}

    	public void deposit(double value, int pin, int accID){

    	}

    	public String query(int pin, int accID){

        	return "";
    	}

    	public void withDr(double value, int pin, int accID){

    	}

    	public String listAcc(int customer){

        	return "";
    	}

    	public String showAll(int manPin){

        	return "";
    	}

    	public boolean signIn(String password, int customerID){
        	return false;
    	}

    	public void signUp(String password, String lastname, String firstname, String birthDate, int age){
		Customer c = new Customer( password, lastname, firstname, birthDate);
		c.setCustomerID(id);
		customers.add(c);
		this.id++;
    	}

    	public String translog(){
        	return "";
    	}

    	private void setCurrentID(int id){
        	this.currentID=id;
    	}

    	private void setCurrentPassword(String password){
        	this.currentPassword=password;
    	}

    	public void logOut(){

    	}

    	public int askGuardian(){
        	return 0;
    	}

    	public int askAccType(){
        	return 0;
    	}

    	public int askMortgage(){
        	return 0;
    	}

    	public void message(String mess){

    	}

    	public void transaction(int fromID, int targetID, int pin, double value){
			Account from;
			Account target;

    		if (currentID == 0){
				/*Error Message*/
			}
			else{
				for (int i = 0; i < customers.size(); i++){
					from = customers.get(i).lookUpAccount(fromID);
				}
				for (int i = 0; i < customers.size(); i++){
					target = customers.get(i).lookUpAccount(targetID);
				}
			}
    	}
	
	
	
}
