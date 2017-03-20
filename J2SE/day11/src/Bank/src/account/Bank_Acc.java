package account;

import java.util.*;
import java.io.*;
public class Bank_Acc implements Comparable<Bank_Acc>
{
	private int id;
	private String name;
	private String type;
	private double balance;
	private GregorianCalendar doc;
	
	public Bank_Acc(int id, String name, String type, double balance,
			GregorianCalendar doc
			) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.doc = doc;
	}

	public GregorianCalendar getDoc() {
		return doc;
	}

	public void setDoc(GregorianCalendar doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Bank_Acc [id=" + id + ", name=" + name + ", type=" + type
				+ ", balance=" + balance+ ", doc=" + doc.getTime() +"]";
				
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public int compareTo(Bank_Acc o) {
		
		return (int)(balance-o.balance);
	}

}