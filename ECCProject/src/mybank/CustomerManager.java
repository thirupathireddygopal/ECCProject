package mybank;

import java.util.ArrayList;

public class CustomerManager {
	
	private ArrayList<Customer> customersList = new ArrayList<Customer>();
		
	public int addCustomer(String name,double balance) {
		Customer customer = new Customer(name, balance);
		customersList.add(customer);
		return customer.getId();
	}
	
	public Customer displayCustomer(int id){
		for(Customer cust : customersList) {
			if(cust.getId() == id) {
				return cust;
			}
			else {
				System.out.println("customer not found");
			}
		}		
		return null;
	}
	
	public ArrayList<Customer> displayAllCustomers(){
		return customersList;
	}
	
	public double deposit(int id,double add,boolean check) {
		for(Customer cust:customersList) {
			if(check){
				if(cust.getId() == id) {
					return 1;
				}
			}
			else if(cust.getId() == id) {
					cust.setBalance(cust.getBalance() + add);
					return cust.getBalance();
			}
		}
		return 0;
	}
	
	public double withdraw(int id,double withdraw,boolean check) {
		for(Customer cust : customersList) {
			if(check) {
				if(cust.getId() == id) {
					return 1;
				}
			}
			else if(cust.getId() == id) {
					cust.setBalance(cust.getBalance() - withdraw);
					return cust.getBalance();
			}
		}
		return 0;
	}
	
	public double transfer(int id,int trid,double transfer,boolean check) {
		double draw = 0;
		for(Customer cust : customersList) {
			if(check) {
				if(cust.getId() == id) {
					for(Customer cust1 : customersList) {
						if(cust1.getId() == trid) {
							return 1;
						}
					}
				}
			}
			else {
				draw = withdraw(id, transfer, true);
				deposit(trid, draw, true);
				return draw;
				}
			}
		return 0;
	}

}
