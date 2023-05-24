/*Construa um programa que gerencia a conta de uma pizzaria.
Preço do refrigerante: R$ 1,50. Preço da fatia de pizza: R$ 3,00. Taxa do garçom: 10%.
Receba do usuário: a quantidade de refrigerantes, a quantidade de fatias e a quantidade de pessoas na mesa.
Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa.
*/

import java.util.Scanner;

public class Ex06 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Entre o número de refrigerantes:");
		int refrigerante = scan.nextInt();
		
		System.out.print("Entre o número de fatias de pizza:");
		int pizza = scan.nextInt();
		
		System.out.print("Entre o número de pessoas:");
		int pessoas = scan.nextInt();
		
		double prefrigerante = 1.50;
		double ppizza = 3.00;
		double taxa = 0.01;
		double resultst = ((refrigerante * prefrigerante) + (pizza * ppizza));
		double resultct = ((((refrigerante * prefrigerante) + (pizza * ppizza)) * taxa) + resultst);
		double rateio = (resultct/pessoas);
		
		System.out.printf("====== Conta ====== \n"
						+ "Conta sem taxa: %f\n"
						+ "Conta com taxa: %f\n"
						+ "Rateio: %f\n",resultst,resultct, rateio);
		
		

	}

}