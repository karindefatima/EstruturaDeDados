import java.util.Scanner;
public class Ex25 {
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
	}
}
