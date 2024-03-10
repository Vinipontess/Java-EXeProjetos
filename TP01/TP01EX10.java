
//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.		

import java.util.Scanner;
class TP01EX10{
	public static void main(String[] args){
	double temperatura;
	double temperaturaF;
	Scanner scan = new Scanner (System.in);
	System.out.println("Conversor de temperatura C° para F°");
	System.out.println("");
	System.out.println("Digite a temperatura em graus Celsius");
	temperatura = scan.nextDouble();
	temperaturaF = temperatura*1.8+32;
	System.out.printf ("A temperatura em Fahrenheit é " + "%.1f", temperaturaF);
	System.out.printf ("F°");
			
	}
}

// Vinícius Pontes e Eduardo Barbosa