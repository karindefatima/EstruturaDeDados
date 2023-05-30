import java.util.Scanner;
public class Ex30 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Entre uma String:");
		String st = scan.nextLine();
		inverterString(st);
	}
    public static void inverterString(String st){
		String newSt = "";
		for (int i = st.length() - 1; i >= 0; i--){
           newSt += st.charAt(i);
        }
		System.out.print(newSt);
	}
}
