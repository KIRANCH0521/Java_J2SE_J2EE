package shpcart;
import java.util.*;
public class TestCustomer {
	static int idc=0;
	static HashMap<Integer,Customer> hm=new HashMap<>();
	public static void main(String[] args) {
		

		Book[] b1={new Book("java","madhura","cdac",500,3),new Book("dotnet","delhi mam","fast",850,3), new Book("web","sole","hyderabad",3000,3)};
		
		/*Customer[]	c1={new Customer(101,"nani"),new Customer(102,"prat"), new Customer(35,"raj")};
		for(Customer c: c1)
		{rwft
			hm.put(c.getId(),c);
		}*/
		Scanner sc=new Scanner(System.in);
		
		boolean flag=false;
		while(!flag)
		{
			
		
		System.out.println("enter the choice");
		System.out.println("press 1 for signup \n press 2 for display all customer deta1ils");
		System.out.println("press 3 for sort customers as per email and display \n press 4 to delete account");
		System.out.println("press 5 for login \n press 6 to exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				
					System.out.println("enter your name,password and email");
					
					Customer c=new Customer(++idc,sc.next(),sc.next(),sc.next());
					hm.put(c.getId(),c);
					System.out.println("login successfull");
					System.out.println("PLEASE REMEMBER YOUR ID "+idc);
					break;
					
		case 2:
					System.out.println("the details of all the customers are");
					Collection<Customer> cus=hm.values();
					for(Customer c1:cus)
					{
						System.out.println("customer via collection"+c1);
					}
					System.out.println("customer via hm"+hm);
					break;
					
		case 3:
					Collection<Customer> col=hm.values();
					ArrayList<Customer> al=new ArrayList<>(col);
					Collections.sort(al);
					System.out.println("sorted as per email"+al);
					
					break;
					
		case 4:
					System.out.println("enter id and password to delete your account");
					int idn=sc.nextInt();
					String dpass=sc.next();
					if(hm.get(idn).getPassword().equals(dpass))
					{
						hm.remove(idn);
						System.out.println("your account is deleted");

					}
					else
					{
					System.out.println("your password is incorrect");
					}
					System.out.println("current status of the hm is"+hm);
					break;
					
		case 5:
					System.out.println("enter id and password");
					int ida=sc.nextInt();
					String password=sc.next();
					if(hm.get(ida).getPassword().equals(password))
					{
						System.out.println("congrats login SCCCESSFULL !!!");
						boolean flag1=false;
						while(!flag1)
						{															
						System.out.println("PRESS 1 FOR PURCHASING BOOKS \n PRESS 2 FOR DISPLAYING YOUR CART \n PRESS 3 FOR REMOVING ITEMS FROM YOUR CART ");
						System.out.println("PRESS 4 TO LOGOUT");
						int choice=sc.nextInt();
						switch(choice)
						{
						case 1:
								System.out.println("THE BOOKS IN LIBRARY ARE ");
								for(Book b:b1)
								{
									System.out.println(b);
								}
								System.out.println("enter the book name which you want to add to cart");
								String b_nam=sc.next();
								for(Book B:b1)
								{
									if((B.getName().equals(b_nam)))
									{
										if(B.getQuantity()>0)
										{
										hm.get(ida).addToCart(new Book(B.getName(),B.getAuthor(),B.getDesc(),B.getPrice(),1));
										B.setQuantity(B.getQuantity()-1);
										hm.get(ida).setAmt(hm.get(ida).getAmt()+B.getPrice());
										break;
										}
										else
										{
											System.out.println("the book you want is currently not available");
										}
									}
									
								}
									
								
									break;
								
						case 2:
										System.out.println("the book in cart are");
										hm.get(ida).inCart();
										break;
										
						case 3:
										System.out.println("enter book name which you want to remove from the cart");
										hm.get(ida).removeFromCart(sc.next());
										break;
										
						case 4:
										flag1=true;
										break;
										
								
								
						}
						}
					}
					else
					{
						System.out.println("sorry login failed please try again with correct id and password");
						
					}
					break;
					
					
					
		case 6:
					flag=true;
					break;
					
		
				
		
		}
		}
		
	}
	public static boolean checkCustomer(int idc, String nam) 
	{
		if(hm.containsKey(idc))
		{
			return hm.get(idc).getName().equalsIgnoreCase(nam);
		}
		return false;
	}
	

}