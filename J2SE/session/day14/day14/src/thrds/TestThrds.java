package thrds;

public class TestThrds {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// display dtls of main thrd
		Thread t=Thread.currentThread();
		System.out.println(t);//name,prio,tg
		t.setName("newMain");
		System.out.println(t);
		//create child thrds --- to test concurrency
		NewThrd t1=new NewThrd("one");
		NewThrd t2=new NewThrd("two");
		
		NewThrd t3=new NewThrd("three");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("in thrd " + t.getName() + " #" + i);
			Thread.sleep(1000);
		}
		System.out.println("main over....");

	}

}
