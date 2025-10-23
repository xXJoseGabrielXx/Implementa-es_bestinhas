import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String adjetivo1, adjetivo2, pronome1, verbo1, pronome2, objeto;
	    
	    Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um adjetivo:");
		adjetivo1 = scanner.nextLine();
		System.out.println("Escreva um adjetivo:");
		adjetivo2 = scanner.nextLine();
		System.out.println("Escreva um pronome:");
		pronome2 = scanner.nextLine();
		System.out.println("Escreva um sujeito:");
		pronome1 = scanner.nextLine();
		System.out.println("Escreva um verbo:");
		verbo1 = scanner.nextLine();
		System.out.println("Escreva um objeto de pronome feminino:");
		objeto = scanner.nextLine();
		
		System.out.println("Um belo dia " + pronome1 + " teve a bela ideia de fazer " + verbo1);
		System.out.println("Mas " + pronome2 + " escolheu dar a " + objeto + " para " + adjetivo2);
		System.out.println("e " + adjetivo1 + " resolveu comer o " + objeto);
		
		scanner.close();
	}
}