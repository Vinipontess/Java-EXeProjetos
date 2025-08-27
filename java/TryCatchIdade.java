import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        boolean entradaValida = false;

        while (!entradaValida) { 
            try {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();
                entradaValida = true; 
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número inteiro. Tente novamente.");
                scanner.next(); 
            }
        }

        System.out.println("Obrigado! Sua idade é: " + idade);
        
        scanner.close();
        System.out.println("Fim do programa.");
    }
}
