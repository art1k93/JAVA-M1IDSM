package ua.khnue.Sheiko07;

public class ResultTable {
	
	final static String tableFormat = "| %-2d | %-20s | %-14s | %-14s | %-14s |%n";
	
	public static void getTableHeader() {
		System.out.format("+------------------------------------------------------------------------------+%n");
		System.out.format("| #  | Фамилия              | Зарплата, грн. | Удержано, грн. | Выдано, грн.   |%n");
		System.out.format("|----+----------------------+----------------+----------------+----------------|%n");
	}
	
	public static void getTableFooter() {
		System.out.format("+------------------------------------------------------------------------------+%n\n");
	}
	
}
