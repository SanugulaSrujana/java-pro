import java.util.TreeMap;

public class Customer implements Comparable<Customer> 
{
	static TreeMap<Integer,String> details=new TreeMap<>();;
	int customerId;
	String name;
	String location;
	String email;
	Customer()
	{
		this.customerId=101;
		this.setName("nandu");
		this.setLocation("Bangalore");
		this.email="xyz@gamil.com";
		String det=this.getName()+"\t"+this.email+"\t"+this.getLocation();
		details.put(this.customerId,det);
	}
	Customer(int customerId,String name,String location,String email)
	{
		this.customerId=customerId;
		this.setName(name);
		this.setLocation(location);
		this.email=email;
		String det=this.getName()+"\t"+this.email+"\t"+this.getLocation();
		details.put(this.customerId,det);
	}
	
	
	@Override
	public int compareTo(Customer customer) {
		return this.getName().compareTo(customer.getName());
	}
	
	public int getCustomerId()
	{
		return this.customerId;
	}
	
	public String toString()
	{
		return this.customerId+"\t"+this.email+"\t"+this.getLocation()+"\t"+this.getName();
	}
	public void setCustomerId(int id)
	{
		this.customerId=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
