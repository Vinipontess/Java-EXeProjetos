import java.util.Scanner;

public class Logica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int anoInput = scanner.nextInt();
        scanner.close();
        Ano ano = new Ano(anoInput);

        if(ano.isBissexto()){
            System.out.println(ano.getAno() + " é um ano bissexto.");
        }else{
            System.out.println(ano.getAno() + " não é um ano bissexto.");}
}

static class Ano{
    private int ano;

    //Meu construtor
    public Ano(int ano){
        this.ano = ano;
    }

    //meu getter
    public int getAno(){
        return ano;
    }
    //meu setter
    public void setAno(int ano){
        this.ano = ano;
    }

    //meu metodo bissexto
    public boolean isBissexto(){
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}}