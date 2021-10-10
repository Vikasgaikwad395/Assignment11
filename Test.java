class Customer{
				
				int CustomerId;
				String CustomerName;
				double CustomerContact;
				
				
				
			public Customer(int CustomerId, String CustomerName, double CustomerContact ) {
				
				this.CustomerId = CustomerId;
				this.CustomerName = CustomerName;
				this.CustomerContact = CustomerContact;
				
			}
			
			public String toString() {
				return CustomerId +" "+CustomerName+" "+CustomerContact;
			}
}
	class Address{
		String City;
		String State;
		String Country;
	
			public Address(String City, String State, String Country) {
				this.City = City;
				this.State = State;
				this.Country = Country;
				
			}
			public String toString() {
				return City+" "+State+" "+Country;
			}
}

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer(101,"Ram",1546976);
		Customer c1 = new Customer(102,"Ganj",1466985);
		

		System.out.println(c.toString());
		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println(c.equals(c1));
		
		Address a1 =  new Address("Nashik","Maharastra","India");
		Address a2  = new Address("Nashik","Maharastra","India");
		
		System.out.println(a1.toString());
		System.out.println(a1);
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a2));
	}

}
