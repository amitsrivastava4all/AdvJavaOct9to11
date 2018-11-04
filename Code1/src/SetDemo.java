import java.util.TreeSet;

class Customer implements Comparable<Customer>{
	int id;
	String name;
	double balance;
	Customer(int id, String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public int compareTo(Customer customer) {
		return this.name.compareToIgnoreCase(customer.name);
	}
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" Balance "+balance;
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Customer> customerSet = new TreeSet<>();  // Default Comparable
		TreeSet<Customer> customerSet 
		= new TreeSet<>((first,second)->first.name.compareToIgnoreCase(second.name));
		
		customerSet.add(new Customer(1001,"Ram",9999));
		customerSet.add(new Customer(1001,"Ram",9999));
		customerSet.add(new Customer(1001,"Ram",9999));
		customerSet.add(new Customer(1002,"Amit",2999));
		customerSet.add(new Customer(1002,"Amit",2999));
		System.out.println(customerSet);
		
		

	}

}
