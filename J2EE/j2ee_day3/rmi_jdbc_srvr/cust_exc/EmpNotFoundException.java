package cust_exc;

public class EmpNotFoundException extends Exception {
	public EmpNotFoundException(String msg) {
		super(msg);
	}
}