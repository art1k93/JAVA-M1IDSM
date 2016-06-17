package ua.khnue.Sheiko07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Company {

	double sumWithheld, sumNetSalary, sumRawSalary;
	private Map<Integer, Employee> colleaguesList = null;

	public void initialise() {
		colleaguesList = new HashMap<Integer, Employee>();
	}

	public void setColleaguesList(HashMap<Integer, Employee> c) {
		colleaguesList = c;
		setSummary();
	}

	public Map<Integer, Employee> getColleaguesList() {
		return colleaguesList;
	}

	public void setSummary() {
		sumWithheld = 0;
		sumNetSalary = 0;
		sumRawSalary = 0;
		for (Entry<Integer, Employee> entry : getColleaguesList().entrySet()) {
			sumRawSalary += entry.getValue().getRawSalary();
			sumWithheld += entry.getValue().getWithheld();
			sumNetSalary += entry.getValue().getNetSalary();
		}
	}

	public double getSumWithheld() {
		return sumWithheld;
	}

	public double getSumNetSalary() {
		return sumNetSalary;
	}

	public double getSumRawSalary() {
		return sumRawSalary;
	}
	
	public void show() {

		ResultTable.getTableHeader();
		getColleaguesList().forEach((k, v) -> {
			System.out.format(ResultTable.tableFormat, k, v.getLastName(), v.getRawSalary(), v.getWithheld(),
					v.getNetSalary());
		});
		ResultTable.getTableFooter();

		System.out.println("Всего:");
		System.out.printf("Зарплата: %s грн.\nУдержано: %s грн.\nВыдано: %s грн.", sumRawSalary, sumWithheld,
				sumNetSalary);
	}

	public void insertDefault() {
		colleaguesList.put(1, new Employee("Вашингтон", 3_000));
		colleaguesList.put(2, new Employee("Адамс", 6_000));
		colleaguesList.put(3, new Employee("Джефферсон", 9_000));
		colleaguesList.put(4, new Employee("Мэдисон", 11_000));
		colleaguesList.put(5, new Employee("Монро", 13_000));
		setSummary();
	}
	
	@SuppressWarnings("unchecked")
	public void open(String filename) {
		try {
			FileInputStream r = new FileInputStream(filename);
			ObjectInputStream o = new ObjectInputStream(r);
			Object colleaguesList = o.readObject();
			setColleaguesList((HashMap<Integer, Employee>) colleaguesList);
			o.close();
			r.close();
		} catch (Exception e) {
			System.out.println("Input error. Does file exist?");
		}
	}

	public void addNewColleague() {
		String lastName;
		double rawSalary;
		System.out.println("Создание нового коллеги\n-----------------------------");
		System.out.println("Фамилия:");
		lastName = Main.sc.next();
		System.out.println("Размер заработной платы:");
		rawSalary = Main.sc.nextDouble();
		colleaguesList.put(colleaguesList.size() + 1, new Employee(lastName, rawSalary));
		setSummary();
	}
	
	public void deleteColleague() {
		System.out.println("Удаление коллеги по номеру в списке\n-----------------------------");
		System.out.println("Укажите номер:");
		int pressed;
		while (true) {
			pressed = Main.sc.nextInt();
			if (pressed > 0 && pressed < colleaguesList.size() + 1) {
				String msg = "Коллега с фамилией " + colleaguesList.get(pressed).getLastName() + " был удален.";
				colleaguesList.remove(pressed);
				System.out.println(msg);
				setSummary();
				break;
			} else {
				System.out.print("Неверный номер. Попробовать еще раз? Y/N\n");
				String isTryAgain = Main.sc.next();
				if (isTryAgain.equals("Y") || isTryAgain.equals("y")) {
					deleteColleague();
				} else if (isTryAgain.equals("N") || isTryAgain.equals("n")) {
					break;
				} else {
					System.out.print("Неверный вариант ответа. Операция была прервана\n");
					break;
				}
			}
		}
	}
	
	public void save(String filename) {
		try {
			FileOutputStream w = new FileOutputStream(filename);
			ObjectOutputStream o = new ObjectOutputStream(w);
			o.writeObject(colleaguesList);
			o.close();
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
