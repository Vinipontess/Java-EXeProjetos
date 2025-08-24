public class CaixaEletronicoPOO{  

    public static class contaBancaria{
        int numeroConta;
        double saldo = 2500;
        String titularConta;
  
        void exibirDados(){
            System.out.println("Bem vindo(a) de volta " + titularConta);
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Saldo atual: " + saldo);
            System.out.println("******************************************************************");
        }
        void depositar (double valor){
            if (valor > 0){
                saldo += valor;
                System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);  
                System.out.println("******************************************************************");
            }else{
                System.out.println("Valor inválido para depósito.");
                System.out.println("******************************************************************");
            }
        }
        void saque (double valor){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Saque realizado com sucesso, seu saldo atualizado agora é R$" + saldo);
                System.out.println("******************************************************************");
            }
        }
    }

    public static void main(String [] args){
        contaBancaria conta1 = new contaBancaria();
        conta1.titularConta = "Vinicius";
        conta1.numeroConta = 001;
        conta1.exibirDados();
        conta1.depositar(1000);
        conta1.saque(2000);
    }
}
