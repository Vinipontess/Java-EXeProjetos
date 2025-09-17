public class Fatura{
    private String numero;
    ArrayList<String> detalhamentos = new ArrayList<>();
    private double valorTotal;
    private boolean paga;

    public Fatura(String numero){
        this.numero = numero;
        this.valorTotal = 0.0;
        this.paga = false;
    }

    //getters e setters
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public boolean isPaga(){
        return paga;
    }
    public void setPaga(boolean paga){
        this.paga = paga;
    }
    public ArrayList<String> getDetalhamentos(){
        return detalhamentos;
    }
    public void adicionarDetalhamento(String detalhamento, double valor){
        this.detalhamentos.add(detalhamento + ": " + valor);
        this.valorTotal += valor;
    }

    public void imprimirFatura(){
        System.out.println("Fatura Numero: " + getNumero());
        System.out.println("Detalhamentos:");
        for(String detalhamento : detalhamentos){
            System.out.println(detalhamento);
        }
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Status: " + (isPaga() ? "Paga" : "Nao Paga"));
    }   

    public void pagarFatura(){
        if(!isPaga()){
            setPaga(true);
            System.out.println("Fatura " + getNumero() + " foi paga com sucesso.");
        } else {
            System.out.println("Fatura " + getNumero() + " ja esta paga.");
        }
    }

    public void parcelarFatura(int numeroParcelas){
        if(numeroParcelas <= 0){
            System.out.println("Numero de parcelas deve ser maior que zero.");
            return;
        }
        double juros = (getValorTotal() * 0.05) * numeroParcelas;
        double valorParcela = (juros) / numeroParcelas;
        System.out.println("Fatura " + getNumero() + " parcelada em " + numeroParcelas + " vezes de " + valorParcela);
    }   
}