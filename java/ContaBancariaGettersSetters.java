public class ContaBancariaGettersSetters {

    public static class ContaBancaria {
        private String numeroConta;
        private double saldo;
        private String titular;

        //Meus construtores
        public ContaBancaria(String numeroConta, String titular) {
            this.numeroConta = numeroConta; 
            this.titular = titular;
            this.saldo = 0.0; 
        }

        //Getters

        public String getNumeroConta(){
            return this.numeroConta;
        }

        public double getSaldo(){
            return this.saldo;
        }

        public String getTitular(){
            return this.titular;
        }

        //Setters - em lembrei da aula do Tuller sobre ter validação no setter para que não precise validar toda vez na main

        public void setNumeroConta(String NumeroNovo){
                System.out.println("O número da conta não pode ser alterado " + this.titular);
        }

        public void setSaldo(double novoSaldo){
        
                System.out.println("O saldo só pode ser alterado através de deposito e saque " + this.titular);
        }

        public void setTitular(String novoTitular){
            this.titular = novoTitular;
            System.out.println("Mudança realizada em até 24h, envie o comprovante de mudança de titular no email Itau@queroserdoitau.com.br");
        }

        void exibirDados() {
            System.out.println("Bem vindo(a) " + titular + ", o número da sua conta é " + numeroConta);
            System.out.println("***********************************************");
        }

        public void depositar(double valor) {
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
        System.out.println(conta1.titular);
        conta1.setSaldo(1000);

    }
}
