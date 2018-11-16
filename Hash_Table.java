package tugas4;
import java.util.Enumeration;

import java.util.Hashtable;

	public class Hash_Table {
		
		public static void main(String args[]) {

		// Create a hash map

		Hashtable balance = new Hashtable();

		Enumeration names;

		String str;

		double bal;



		balance.put("Berlian", new Double(560.67));

		balance.put("Appir", new Double(4506.5));

		balance.put("Zoek", new Double(-56.70));

		balance.put("Ganteng", new Double(123.43));

		balance.put("Qirun", new Double(-456.5));



		// Show all balances in hash table.

		names = balance.keys();

		while(names.hasMoreElements()) {

		str = (String) names.nextElement();

		System.out.println(str + ": " +

		balance.get(str));

		}

		System.out.println();

		// Deposit 1,000 into Zara's account

		bal = ((Double)balance.get("Berlian")).doubleValue();

		balance.put("Berlian", new Double(bal+1000));

		System.out.println("Berlian's new balance: " +

		balance.get("Berlian"));

		}
	}
