public class ContaBancariaConstrutores {

    public static class ContaBancaria {
        String numeroConta;
        double saldo;
        String titular;

        public ContaBancaria(String numeroConta, String titular) {
            this.numeroConta = numeroConta; 
            this.titular = titular;
            this.saldo = 0.0; 
        }

        void exibirDados() {
            System.out.println("Bem vindo(a) " + titular + ", o número da sua conta é " + numeroConta);
            System.out.println("***********************************************");
        }

        void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso! Saldo atualizado: R$ " + this.saldo);
                System.out.println("***********************************************");
            } else {
                System.out.println("Valor inválido para depósito. O valor deve ser positivo.");
                System.out.println("***********************************************");
            }
        }

        void sacar(double valor) {
            if (valor > 0 && this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque efetuado com sucesso!");
                System.out.println("Seu saldo atual é: R$ " + this.saldo);
                System.out.println("***********************************************");
            } else {
                System.out.println("Saque inválido. Valor negativo ou saldo insuficiente.");
                System.out.println("***********************************************");
            }
        }
    }
    
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("1234-1", "Vinicius Pontes");
        conta1.exibirDados();
        conta1.depositar(1000);
        conta1.sacar(50);
        
        conta1.sacar(2000); 
    }
}
