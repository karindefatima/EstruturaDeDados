import java.util.Scanner;

public class Ex12 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Entre as quatro notas do aluno:\n");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		
		double media = ((nota1 + nota2 + nota3 + nota4)/4); 
		 if(media >= 7) {
		    	System.out.println("APROVADO!");
		    }
		    else {
		    	if(media >=3.5) {
		    		System.out.println("PROVA FINAL!");
		    	}
		    	else {
		    		System.out.println("REPROVADO!");
		    	}
		    
		    }

		    System.out.println("");

	}

}