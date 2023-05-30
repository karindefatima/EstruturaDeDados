import java.util.Scanner;
public class Ex26 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre o número de linhas da matriz:");
		int m = scan.nextInt();
		System.out.print("Entre o número de colunas da matriz:");
		int n = scan.nextInt();
		int[][] matriz = new int[m][n];
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++){
				System.out.print("Entre o número da posição " + i +"," + j + ":");
				matriz[i][j] = scan.nextInt();
			}  
        }
		for (int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("Matriz["+i+"]["+j+"]:" +matriz[i][j] );
			}  
        }
	}
}
