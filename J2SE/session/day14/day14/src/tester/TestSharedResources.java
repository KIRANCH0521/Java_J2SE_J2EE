package tester;

import javax.swing.JOptionPane;

import thrds.DeptHandler;
import model.Emp;
import helper.UtilsFile;

public class TestSharedResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// create shared utils class inst
			UtilsFile u1 = new UtilsFile();
			// emp data
			Emp[] emps = { new Emp(101, "aa", "RND", 12345),
					new Emp(10, "bb", "SALES", 5000),
					new Emp(50, "cc", "PROD", 1234) };
			// create thrd names & thrds -- array based--will be started
			// internally
			String[] names = { "W1", "W2", "W3" };
			DeptHandler[] depts = new DeptHandler[names.length];
			for (int i = 0; i < names.length; i++) {// thrds are --- rdy state
				depts[i] = new DeptHandler(names[i], emps[i], u1);
			}
			// when user prompts ---stop --- stop all thrds
			JOptionPane.showConfirmDialog(null, "Press OK to stop");
			// stop thrds
			for (int i = 0; i < names.length; i++)
				depts[i].stop();
			// ensure no orphans & then terminate main
			for (int i = 0; i < names.length; i++)
				depts[i].getT().join();
			u1.close();
			System.out.println("main over");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
