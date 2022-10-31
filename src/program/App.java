package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		

		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		if(bill.gender == 'm') {
			bill.ticket = 10.00;
		}
		else if(bill.gender == 'f') {
			bill.ticket = 8.00;
		}
		
		
		if(bill.feeding() < 30) {
			System.out.println("RELATÓRIO: ");
			System.out.printf("Consumo =  R$ %.2f%n", bill.feeding());
			System.out.printf("Couvert =  R$ %.2f%n", bill.cover);
			System.out.printf("Ingresso =  R$ %.2f%n", bill.ticket);
			System.out.println();
			System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());
			
		}
		else {
			
			System.out.println("RELATÓRIO: ");
			System.out.printf("Consumo =  R$ %.2f%n", bill.feeding());
			System.out.println("Isento de Couvert.");
			System.out.printf("Ingresso =  R$ %.2f%n", bill.ticket);
			System.out.println();
			System.out.printf("Valor a pagar = R$ %.2f%n", bill.total() - bill.cover);
			
		}
		
			
		
		sc.close();
	}

}
