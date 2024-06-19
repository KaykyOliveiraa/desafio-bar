package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bill;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cerveja = 5.0;
		double refrigerante = 3.0;
		double  espetinho = 7.0;
		
		System.out.print("SEXO: ");
		char sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = cerveja * sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refrigerante = refrigerante * sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetinho = espetinho * sc.nextInt();
		
		
		Bill bill = new Bill();
		
		
		double consumo =  + bill.feeding(cerveja, refrigerante, espetinho);
		double couvert = bill.cover();
		double ingresso = bill.ticket(sexo);
		double total = bill.total(consumo, couvert, ingresso);
	
		
		System.out.println("");
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + String.format("%.2f", consumo));
		if(consumo > 30) {
			System.out.println("Isento de Couvert");
			total = total - couvert;
		}else {
			System.out.println("Couvert = R$ " + String.format("%.2f", couvert));
		}
		System.out.println("Ingresso = R$ " + String.format("%.2f", ingresso));
		
		
		System.out.println("");
		System.out.println("Valor a pagar = R$ " + String.format("%.2f", total));
	}

}
