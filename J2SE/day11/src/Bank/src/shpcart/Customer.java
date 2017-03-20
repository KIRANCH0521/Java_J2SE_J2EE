package shpcart;

import java.util.*;

public class Customer implements Comparable<Customer> {

	
	private int id;
	private String name;
	private String password;
	private String email;	
	ArrayList<Book> book;
	private double amt; 
	
	public void removeFromCart(String s)
	{
		Iterator<Book> itr=book.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			double price=b.getPrice();
			if(b.getName().equals(s))
			{
				itr.remove();
				amt-=price;
			}
			System.out.println("book_name= "+b.getName()+" book_author= "+b.getAuthor()+" price= "+b.getPrice()+" description= "+b.getDesc()+" total_ammount= "+amt+"]");
		}
	}
	public ArrayList<Book> getBook() {
		return book;
	}

	public void setBook(ArrayList<Book> book) {
		this.book = book;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public Customer(int id, String name,String password,String email) {
		super();
		this.id = id;
		this.name = name;
		this.password=password;
		this.email=email;
		book=new ArrayList<>();
	}

	public void addToCart(Book bo)
	{
		
		book.add(bo);
	}
	public void inCart()
	{
		Iterator<Book> itr=book.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println("book_name= "+b.getName()+" book_author= "+b.getAuthor()+" price= "+b.getPrice()+" description= "+b.getDesc()+"]");
		}
		System.out.println(" total_ammount= "+amt);
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" +name+" email="+email+"]";
	}
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void bookOnCart(Book b)
	{
		book=new ArrayList<>();
		book.add(b);
	}
		
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int compareTo(Customer o)
	{
		return email.compareTo(((Customer)o).getEmail());
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
