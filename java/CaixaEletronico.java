import java.util.Scanner;
public class CaixaEletronico
{ 
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double saldo = 2500;
        int menu = 0;

        while(menu != 4){
            System.out.println("Menu:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Realizar saque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            menu = scanner.nextInt();
            if (menu > 4 || menu < 1) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (menu){
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                break;
                case 2:
                    double deposito;
                    System.out.print("Digite o valor do depósito: ");
                    deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 3:
                    double saque;
                    System.out.println("Digite o valor do saque: ");
                    saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo){
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
                    }else{
                        System.out.println("Valor inválido para saque ou saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                }
            
        }
     }
}
