import java.util.Scanner;
public class Ex27 {
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
		inverterVetor(vetor);
	}
    public static void inverterVetor(int[] vetor){
		int[] vetorInvertido = new int[vetor.length];
		int tam = vetor.length;
		for (int i = 0; i < vetor.length; i++) {
			tam--;
			vetorInvertido[i] = vetor[tam];
		}

		int i = 0;
		while (i < vetorInvertido.length){
		 System.out.print("VetorInvertido["+i+"]: "+ vetorInvertido[i] + "\n");
		 i++;
	 }
	}
}