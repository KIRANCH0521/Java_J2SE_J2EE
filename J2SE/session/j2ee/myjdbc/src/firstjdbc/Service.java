package firstjdbc;

public interface Service {

	public boolean insrt(Account a);
	public void delete(int accno);
	public void update(Account a);
	public void retrive(int accno);
	public void retrivAll();
	
}
