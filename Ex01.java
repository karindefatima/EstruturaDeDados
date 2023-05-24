/*Inicialize variáveis adequadas para: sua idade, sua altura, primeira letra do seu nome, seu nome completo.
 * Depois exiba os dados na tela.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int idade = 27;
		float altura = 1.60f;
		char lnome = 'K';
		String nome = new String("Karin de Fátima Rodrigues Oliveira");
		
		System.out.printf("Idade: %d \nAltura: %f \nPrimeira letra do nome: %c \nNome Completo: %s", idade,altura,lnome,nome);
		
	}
}
