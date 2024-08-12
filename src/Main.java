import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer(111,"sruj","hyd","preeamil.com");
		System.out.println(customer1.customerId+"\t"+ customer1.name+"\t"+customer1.email+"\t"+customer1.location);
		
		Customer customer=new Customer();
		System.out.println(customer.customerId+"\t"+ customer.name+"\t"+customer.email+"\t"+customer.location);

		List<Customer> customers=new ArrayList<>();
		customers.add(customer1);
		customers.add(customer);
		System.out.print("Before sorting:");
		
		for(Customer cust:customers)
			 System.out.println(cust);
		
		
		Collections.sort(customers);
		
		
		System.out.print("After sorting:");
		 for(Customer cust:customers)
			 System.out.println(cust);
		
		//TreeMap<customerId,String> details;
		System.out.println("Customer details with location Bangalore are:");
		for(Customer c:customers)
		{
			if(c.getLocation().equals("Bangalore"))
			{
				System.out.println(Customer.details.get(c.getCustomerId()));
			}
		}
	}
}
