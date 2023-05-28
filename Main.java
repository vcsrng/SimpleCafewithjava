// Nama		: Vincent
// NIM		: 2502011505
// Kelas	: LH01
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		ArrayList<String> menu1 = new ArrayList <>();
		ArrayList<Integer> price1 = new ArrayList <>();
		Scanner sc = new Scanner(System.in);
		int choose;
		
		do {
		System.out.println("+============+");
		System.out.println("| Blues Café |");
		System.out.println("+============+");
		System.out.println("1. Add Order");
		System.out.println("2. Show All Orders");
		System.out.println("3. Remove Order");
		System.out.println("4. Exit");
		System.out.print(">> ");
		choose = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("");
		}
		switch(choose) {
			case 1:
				String menu = "";
				int price;
				// do {
					System.out.print("Insert Order menu: ");
					menu = sc.nextLine();
				// }while(!(menu.endsWith("Coffee")));
				do {
					System.out.print("Insert Price[1000-100000]: ");
					price = sc.nextInt();
					sc.nextLine();
				}while(price < 1000 | price > 100000);
				System.out.println("Order has been added to cart.");
				menu1.add(menu);
				price1.add(price);
				sc.nextLine();
				for(int i = 0; i < 10; i++) {
					System.out.println("");
				}
				break;

			case 2:
				if(menu1.isEmpty()) {
					System.out.println("There is no order...");
					System.out.println("Press enter to continues...");
					sc.nextLine();
				}else {
				int total = 0;
				System.out.println("+===========================+");
				System.out.printf("|  No  |  Drink  |  Price  |" );
				System.out.println("\n+============================+");
				for(int i = 0; i < menu1.size(); i++) {
					System.out.printf("%s %s %s %s %s %s %s", "|",(i+1),"|" ,menu1.get(i),"|", price1.get(i),"|");
					System.out.println("\n+===========================+");
					total += price1.get(i);
				}
				total *= 82.5/100;
				System.out.println("Price Total = " + total);
				System.out.println("*The price with 10% for the tax and 7.5% for the services in total");
				System.out.println("Press enter to continues...");
				sc.nextLine();
				}
				for(int i = 0; i < 10; i++) {
					System.out.println("");
				}
				break;

			case 3:
				if(menu1.isEmpty()) {
					System.out.println("There is no order...");
					System.out.println("Press enter to continues...");
					sc.nextLine();
				}else {
				int remove;
				do {
				System.out.println("+===========================+");
				System.out.printf("|  No  |  Drink  |  Price  |" );
				System.out.println("\n+============================+");
				for(int i = 0; i < menu1.size(); i++) {
					System.out.printf("%s %s %s %s %s %s %s", "|",(i+1),"|" , menu1.get(i),"|", price1.get(i),"|");
					System.out.println("\n+===========================+");
				}
				System.out.print("Choose Order to remove: ");
				remove = sc.nextInt();
				sc.nextLine();
				remove -= 1;
				menu1.remove(remove);
				price1.remove(remove);
				for(int i = 0; i < 10; i++) {
					System.out.println("");
				}
				System.out.println("order has been removed...");
				sc.nextLine();
				}while(remove > price1.size());
				}
				for(int i = 0; i < 10; i++) {
					System.out.println("");
				}
				break;
				
			case 4:
				System.out.println("Thank you for ordering...");
				sc.nextLine();
				break;
		}
		}while(choose != 4);
	}

	public static void main(String[] args) {
		new Main();
	}

}
