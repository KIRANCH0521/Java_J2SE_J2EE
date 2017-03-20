package account;

import java.util.*;
public class TestComparator implements Comparator<Bank_Acc> {

	@Override
	public int compare(Bank_Acc o1, Bank_Acc o2) {
		
		Calendar d1=o1.getDoc();
		Calendar d2=o2.getDoc();
		return d1.get(Calendar.YEAR)-d1.get(Calendar.YEAR);
	}
}