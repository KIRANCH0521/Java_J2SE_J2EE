package Pbank;
import java.util.*;
import java.io.*;
public class TestAcount {
	static int id=0;
	public static void main (String [] s)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Account> hm=new HashMap<>();
		boolean flag=false;
		
		while(!flag)
		{
			System.out.println("press 1 to create account \n press 2 for sort account using id \n press 3 for sort as per account balance ");
			System.out.println("press 4 for sort as creation date \n press 5 for writing data to the binary file");
			switch(sc.nextInt())
			{
			case 1:
					System.out.println("enter name,type of account,balance and year,month,day");
					Account a=new Account(++id,sc.next(),sc.next(),sc.nextInt(),new GregorianCalendar(sc.nextInt(),sc.nextInt()-1,sc.nextInt()));
					hm.put(a.getId(),a);
					break;	
					
			case 2:
					System.out.println("sorted accounts as per id");
					TreeMap<Integer, Account> tm=new TreeMap<>(hm);
					System.out.println(tm);
					break;
					
			case 3:
					System.out.println("sorted as per account balance");
					Collection<Account> col=hm.values();
					List<Account> l=new ArrayList<>(col);
					Collections.sort(l);
					System.out.println(l);
					break;
					
			case 4:
					System.out.println("sorting as per creation date");
					Collection<Account> cl=hm.values();
					List<Account> li=new ArrayList<>(cl);
					Collections.sort(li,new Comparator<Account>() {
						@Override
						public int compare(Account o1, Account o2) {
							
							return o1.getDoc().compareTo(o2.getDoc());
						}
					});
					System.out.println(li);
					break;
					
			case 5:
					try(DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:/java@45/day11/acount.dat")))){
						Collection<Account> cll=hm.values();
						List<Account> lis=new ArrayList<>(cll);
						
						Iterator<Account> itr=lis.iterator();
						
						while(itr.hasNext())
						{							
							Account a1=itr.next();
							dout.writeInt(a1.getId());
							dout.writeChars(a1.getName());
							dout.writeChars(a1.getType());
							dout.writeInt(a1.getBalance());
							System.out.println("data writen in file");
						}
						
						
					}
					catch (Exception e) {
						e.getStackTrace();
					}
						
					break;
					
			case 6:
						flag=true;
						break;
					
					
			}
		}
	}
	

}

