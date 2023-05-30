import java.util.Scanner;
public class Ex29 {
	private static Scanner scan = new Scanner(System.in);
	private static int[] vetor;
	public static void main(String[] args) {
		System.out.print("Entre o tamanho do vetor:");
		int length = scan.nextInt();
		lerVetor(length);
		printVetor();
	   	alterarVetor();
	   	printVetor();
	}

	public static void lerVetor(int tam){
		vetor = new int[tam];
		for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre o número da posição " + i + ":");
            vetor[i] = scan.nextInt();
        }
	}

	public static void printVetor(){
		for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]:" + vetor[i] + "\n");
        }
	}
	public static void alterarVetor(){
		int aux;
		for(int i = vetor.length - 1; i > 0; i--){
			aux = vetor[i - 1];
			vetor[i - 1] = vetor[i];
			vetor[i] = aux;
		}
	}
}