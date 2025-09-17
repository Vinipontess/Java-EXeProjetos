import java.util.Scanner;

public class Logica{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();

        for(int i = 1; i<=n; i++){
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}