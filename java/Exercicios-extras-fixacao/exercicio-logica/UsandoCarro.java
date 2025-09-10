import java.util.Scanner;

public class UsandoCarro{
    public static void main(String[] args){
        int aux = 10;
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "azul");
        Scanner scanner = new Scanner(System.in);
        while(aux != 0){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Exibir informações do seu carro");
            System.out.println("0 - Sair");
            aux = scanner.nextInt();
            scanner.nextLine();
            switch(aux){
                case 1:
                System.out.println("Quanto você deseja acelerar?");
                int incremento = scanner.nextInt();
                carro1.acelerar(incremento);
                System.out.println("--------------------");
                break;
                case 2:
                System.out.println("Quanto você deseja frear?");
                int decremento = scanner.nextInt();
                carro1.frear(decremento);
                System.out.println("--------------------");
                break;
                case 3:
                System.out.println("--------------------");
                carro1.exibirInfo();
                System.out.println("--------------------");
                break;
                case 0:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
                
        }
    }
}