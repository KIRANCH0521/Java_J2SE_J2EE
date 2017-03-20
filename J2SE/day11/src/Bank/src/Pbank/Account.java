package Pbank;
import java.text.SimpleDateFormat;
import java.util.*;
public class Account implements Comparable<Account> {
	private int id;
	private String name;
	private String type;
	private int balance;
	private GregorianCalendar doc;
	
	
	public Account(int id, String name, String type, int balance,GregorianCalendar g)throws Exception {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.balance = balance;
		
		doc=g;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public GregorianCalendar getDoc() {
		return doc;
	}
	public void setDoc(GregorianCalendar doc) {
		this.doc = doc;
	}
	@Override
	public int compareTo(Account o) {
		return balance-o.getBalance();
	};
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String toString()
	{
		//System.out.printf("DateOfCreation=%tD",doc);
		return " accounts[id="+id+" name="+name+" type="+type+"balance="+balance+"DateOfCreation="+doc.getTime()+"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
