package firstjdbc;
import java.sql.*;

public class ServiceImpl implements Service {

	Createconnection c=new Createconnection();
	Connection con;
	@Override
	public boolean insrt(Account a) {
		boolean isCreated=false;
		try{
		con=c.getCon();
		PreparedStatement pst=con.prepareStatement(Query.insert);
		pst.setInt(1, a.getAccno());
		pst.setString(2, a.getName());
		pst.setDouble(3, a.getBalance());
		
		if(pst.executeUpdate()==1)
		{
			isCreated=true;
		}
		
			
		}
		catch (Exception e) {
				e.printStackTrace();
		}
	
		return isCreated;
	}

	@Override
	public void delete(int accno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrive(int accno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrivAll() {
		// TODO Auto-generated method stub
		
	}

}
