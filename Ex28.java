import java.util.Scanner;
public class Ex28 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre o tamanho do vetor:");
		int length = scan.nextInt();
		int i;
		int[] vetor = new int[length];
        for (i = 0; i < length; i++) {
            System.out.println("Entre o número da posição " + i + ":");
            vetor[i] = scan.nextInt();
        }
        i = 0;
        while (i < vetor.length){
            System.out.print("Vetor["+i+"]: "+ vetor[i] + "\n");
            i++;
        }
		maiorNumero(vetor);
		menorNumero(vetor);
	}
	public static void maiorNumero(int[] vetor){
		int maior = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior)
			maior = vetor[i];
        }
		System.out.print("Maior Número:" +maior);
	}
	public static void menorNumero(int[] vetor){
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor)
			menor = vetor[i];
            
        }
		System.out.print("Menor Número:" +menor);
	}
}
