package ua.khnue.Sheiko07;

import java.util.Scanner;

public class Main {
	
	public static Company company = null;
	static Scanner sc = new Scanner(System.in);
	
	public static void actions(int a) {
		switch (a) {
		case -1:
			System.out.println(
					"\n1. Создать компанию\n" +
					"2. Отобразить список коллег\n" +
					"3. Загрузить тестовый список коллег\n" +
					"4. Загрузить список коллег из файла\n" +
					"5. Добавить нового коллегу\n" +
					"6. Удалить коллегу по номеру в списке\n" +
					"7. Сохранить список коллег в файл\n" +
					"8. Выйти\n"
					);
			break;
		case 1:
			company = new Company();
			company.initialise();
			break;
		case 2:
			company.show();
			break;
		case 3:
			company.insertDefault();
			break;
		case 4:
			company.open("hm_colleaguesList.txt");
			break;
		case 5:
			company.addNewColleague();
			break;
		case 6:
			company.deleteColleague();
			break;
		case 7:
			company.save("hm_colleaguesList.txt");
			break;
		case 8:
			System.exit(0);
			break;
		default:
			System.out.println("Неизвестное действие.");
		}
	}
	

	public static void main(String[] args) {
		int pressed;
		while (true) {
			actions(-1); // show menu
			pressed = sc.nextInt();
			if (company == null && pressed != 1 && pressed != 8) {
				System.out.println("Компания не создана, выполнить действие невозможно.");
			} else if (pressed > 0 && pressed < 9){
				actions(pressed);
			} else {
				System.out.println("Неверный формат ввода. Попробуйте еще раз.");
			}
		}
	}

}
