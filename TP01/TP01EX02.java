import java.util.Scanner;

class TP01EX02{
	public static void main (String[] args){
		
	//2 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
	
	int lado;
	
	System.out.println("Calcular a área do quadrado (Digite o tamanho em centímetros)");
	System.out.println("");
	System.out.println("Digite o tamanho de um dos lados do seu quadrado");
	Scanner scan = new Scanner(System.in);
	lado = scan.nextInt();
	int area = lado*lado;
	System.out.println("");
	System.out.println("A área do seu quadrado é de " + area + "cm");
	}
}

//Vinícius Pontes e Eduardo Barbosa