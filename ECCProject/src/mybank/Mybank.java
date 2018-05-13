package mybank;

import java.util.ArrayList;
import java.util.Scanner;

public class Mybank {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Scanner sc = new Scanner(System.in);
		String name;
		int id,trid,choice;
		double balance,valueExist,amount,withdraw;
		do {
			System.out.println("1. Add Customer");
			System.out.println("2. Display Customer by id");
			System.out.println("3. Display All customer");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			System.out.println("6. Transfer");
			System.out.println("7. Exit");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("enter your name");
				name = sc.next();
				System.out.println("enter balance");
				balance = sc.nextDouble();
				id = customerManager.addCustomer(name, balance);
				System.out.println("customer added successfully with id-->" + id);
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.println("enter your id");
				id = sc.nextInt();
				Customer cust = customerManager.displayCustomer(id);
				if(cust != null) {
					System.out.println(cust);
				}
				else {
					System.out.println("record not found");
				}
				System.out.println("-----------------------------------");
				break;
			case 3:
				ArrayList<Customer>customers = customerManager.displayAllCustomers();
				System.out.println(customers);
				break;
			case 4:
				System.out.println("enter your id");
				id  = sc.nextInt();
				valueExist = customerManager.deposit(id, 1.0, true);
				if(valueExist == 1) {
					System.out.println("enter the amouont to be deposited");
					balance = sc.nextDouble();
					double totalAmount = customerManager.deposit(id, balance, false);
					System.out.println("deposited to id-->"+ id +"and deposited-->" + balance );
					}
				else {
					System.out.println("No records found with the mentioned id");
				}
				System.out.println("--------------------------------------");
				break;
			case 5:
				System.out.println("enter your id");
				id = sc.nextInt();
				valueExist = customerManager.withdraw(id, 1.0, true);
				if(valueExist == 1) {
					System.out.println("enter amount to be withdrawn");
					withdraw = sc.nextDouble();
					amount = customerManager.withdraw(id, withdraw, false);
					System.out.println("withdrawn from id-->"+id+"remaining amount-->"+amount);
				}
				System.out.println("--------------------------------------");
				break;
			case 6:
				System.out.println("enter your id");
				id  = sc.nextInt();
				System.out.println("enter transfer id");
				trid = sc.nextInt();
				valueExist = customerManager.transfer(id, trid, 1.0, true);
				if(valueExist == 1) {
					System.out.println("enter the amount to be transfered");
					amount = sc.nextDouble();
					balance = customerManager.transfer(id, trid, amount, false);
					System.out.println("amount transfered-->" + balance);
				}
				System.out.println("--------------------------------------");
				break;
			}
		}while(choice != 7);
		System.out.println("--------------");
			sc.close();
	}

}
