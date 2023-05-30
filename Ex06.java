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