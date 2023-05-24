/*Construa um programa que calcule o rendimento mensal de um investimento em poupança. Variáveis: investimento inicial, investimento
mensal, quantidade de meses, saldo acumulado, taxa de juros mensal, rendimento mensal.*/
import java.util.Scanner;

public class Ex20 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Entre o investimento inicial: ");
		double invInicial = scan.nextDouble();
		
		System.out.print("Entre o investimento mensal: ");
		double invMensal= scan.nextDouble();
		
		System.out.print("Entre a quantidade de meses: ");
		double qtdMeses= scan.nextDouble();
		
		
		double saldo = invInicial;
		
		System.out.print("Entre a taxa de juros mensal: ");
		double taxaJuros= scan.nextDouble();
			
		for (int i = 1; i <= qtdMeses; i++) {
            double rendMensal = (saldo + invMensal) * (taxaJuros);
            saldo += invMensal + rendMensal;
            System.out.print("\nRendimento Mensal:" + rendMensal);
            System.out.print("\nSaldo: \n" + saldo);
        }
		
	}

}
