import java.util.Scanner;

class TP01EX01{
	public static void main(String[] args){

		//1 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.		

		int altura;
		int base;

		Scanner scan = new Scanner(System.in);
		System.out.println("Calcular a área de um retângulo (digite o tamanho em centímetros)");
		System.out.println("");
		System.out.println("Digite a altura do seu retângulo");
		altura = scan.nextInt();
		System.out.println("Perfeito! Agora digite a base do seu retângulo ");
		base = scan.nextInt();
		int area = altura*base;
		System.out.println("A área do seu retângulo é de " + area + "cm");
		
	}
}

// Vinícius Pontes e Eduardo Barbosa
