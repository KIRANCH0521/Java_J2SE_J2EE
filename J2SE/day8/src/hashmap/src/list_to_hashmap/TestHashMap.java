package list_to_hashmap;

import java.util.HashMap;
import java.util.*;

public class TestHashMap {
	static int idn=0;
	
	public static void main(String[] args)throws Exception {
		HashMap<Integer, Customer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		Customer cust=null;
		
		int ch=0;
		
		boolean flag=false;
		while(!flag)
		{	
		System.out.println("press 1 for create account\n press 2 for display customer details");
		System.out.println("press 3 for sort as per email and display \n press 4 to remove customer & display");
		System.out.println("press 5 for exit");
		ch=sc.nextInt();		
		switch(ch)
		{
		case 1:
			System.out.println("enter the email ,date of berth as per (year,month,day)");
				cust=new Customer(++idn,sc.next(),new GregorianCalendar(sc.nextInt(),sc.nextInt()-1,sc.nextInt()));
				if(checkEmail(cust.getEmail()))
				{
					System.out.println("enter contact info contrycode,state code,zip code");
					cust.createContactInfo(sc.nextInt(), sc.nextInt(), sc.nextInt());
					hm.put(cust.getId(),cust);					
				}
				System.out.println("the hash map is "+hm);
				break;
					
		case 2:
					System.out.println("enter the id which you want to search");
					int idn=sc.nextInt();
					if(hm.containsKey(idn))
					{
						System.out.println("the element which you want to search is "+hm.get(idn));
					}
					break;
			
		case 3:
					System.out.println("sorting as per email  ");
					Collection<Customer> col=hm.values();
					ArrayList<Customer> al=new ArrayList<>(col);
					Collections.sort(al);
					System.out.println(al);
					break;
				
		case 4:
					System.out.println("enter the id to br removed ");
					idn=sc.nextInt();
					if(hm.containsKey(idn))
					{
						hm.remove(idn);
					}
					System.out.println("the current status of hm is "+hm);
					break;
					
				
		case 5:
					flag=true;
					break;
		}
		}
		}
	

	static boolean checkEmail(String e) throws EmailExce
	{
		if(e.contains("@"))
		{
			return true;
		}
		else
		{
			throw new EmailExce("Invalid email Exception");
			
		}
		//return false;
	}
	
}

