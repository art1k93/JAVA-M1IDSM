package ua.khnue.Sheiko06;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;


public class Main {
	
	final static String tableFormat = "| %-2d | %-20s | %-14s | %-14s | %-14s |%n";
	
	public static void getTableHeader() {
		System.out.format("+------------------------------------------------------------------------------+%n");
		System.out.format("| #  | Last Name            | Salary, grn.   | Withheld, grn. | Given, grn.    |%n");
		System.out.format("|----+----------------------+----------------+----------------+----------------|%n");
	}
	
	public static void getTableFooter() {
		System.out.format("+------------------------------------------------------------------------------+%n\n");
	}

	public static void main(String[] args) {		
		double sumWithheld = 0;
		double sumNetSalary = 0;
		double sumRawSalary = 0;
		
		Map<Integer, Employee> company = new HashMap<Integer, Employee>(); 
		
		company.put(1, new Employee("Washington", 3_000));
		company.put(2, new Employee("Adams", 6_000));
		company.put(3, new Employee("Jefferson", 9_000));
		company.put(4, new Employee("Madison", 11_000));
		company.put(5, new Employee("Monroe", 13_000));
		
		for(Entry<Integer, Employee> entry : company.entrySet()) {
			entry.getValue().setWithheld();
			entry.getValue().setNetSalary();
			sumRawSalary = entry.getValue().getRawSalary();
			sumWithheld += entry.getValue().getWithheld();
			sumNetSalary += entry.getValue().getNetSalary();
		}

		// Show final table
		getTableHeader();
		company.forEach((k,v) -> {
			System.out.format(tableFormat, k, v.getLastName(), v.getRawSalary(), v.getWithheld(), v.getNetSalary());
		});
		getTableFooter();

		System.out.println("Summary:");
		System.out.printf("Raw salary: %s grn.\nWithheld: %s grn.\nNet salary: %s grn.",
				sumRawSalary, sumWithheld, sumNetSalary);
	}
}
