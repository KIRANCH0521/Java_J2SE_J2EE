package thrds;

import model.Emp;
import helper.UtilsFile;

public class DeptHandler implements Runnable {
	private Thread t;
	private boolean exit;
	private UtilsFile u;
	private Emp e;
	
	public DeptHandler(String nm,Emp e,UtilsFile u) {
		this.e=e;
		this.u=u;
		t=new Thread(this,nm);//new
		t.start();//rdy
	}

	@Override
	public void run() {
		// keep on writing emp info --- by invoking writeData
		// on common utils cls inst
		System.out.println("started "+t.getName());
		try {
			while (!exit) {
				synchronized (u) {
					u.writeData(e);
				}
				
				Thread.sleep(300);
			}
		} catch (Exception e2) {
			System.out.println("exc in thrd " + t.getName());
		}
		System.out.println("over "+t.getName());

	}
	public void stop()
	{
		exit=true;
	}

	public Thread getT() {
		return t;
	}
	

}
