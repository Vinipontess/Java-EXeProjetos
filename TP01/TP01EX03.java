import java.util.Scanner;
import java.lang.Math;

class TP01EX03{
	public static void main (String[] args){
		
		//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

		double diagonal;
		double area;
		double raiz2 = Math.sqrt(2);

		Scanner scan = new Scanner(System.in); 
		System.out.println("Calcular área do quadrado apenas com o valor ad diagonal (escrever em centímetros)");
		System.out.println("");
		System.out.println("Digite o valor da diagonal.");
		diagonal = scan.nextDouble();
		double lado = diagonal/raiz2;
		area = Math.pow(lado, 2);
		System.out.printf("A área do seu quadrado é de %.1f", area);
		System.out.printf("cm");
	}
}

//Vinícius Pontes e Eduardo Barbosa