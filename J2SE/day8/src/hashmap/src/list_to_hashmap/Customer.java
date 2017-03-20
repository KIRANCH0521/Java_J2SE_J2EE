package list_to_hashmap;

import java.util.*;
public class Customer implements Comparable<Customer>{
	private int id;
	private String email;
	private GregorianCalendar dob;
	private String items;
	private ContactInfo ci;
	public class ContactInfo
	{
		public int countrycode;
		public int statecode;
		public int zipcode;
		ContactInfo(int cc,int sc,int zc)
		{
			countrycode=cc;
			statecode=sc;
			zipcode=zc;
		}
	}
	@Override
	public String toString() {
		System.out.printf("dob=%tD  ",dob);
		return "Customer [id=" + id + ", email=" + email +", contrycode=" + ci.countrycode + "statecode="+ci.statecode+"zipcode="+ci.zipcode+"]";
		
	}
	public Customer(int id, String email, GregorianCalendar dob) {
		this.id = id;
		this.email = email;
		this.dob = dob;
	}
	
	public void createContactInfo(int cc,int sc,int zc)
	{
		ci=new ContactInfo(cc,sc,zc);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GregorianCalendar getDob() {
		return dob;
	}
	public void setDob(GregorianCalendar dob) {
		this.dob = dob;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	@Override
	public int compareTo(Customer o) {
		if(o instanceof Customer)
			return email.compareTo(o.getEmail());
		return -1;
	}

	
}
