class Funcionario{
    private String nome;
    private double salario;
    
    //construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    //getters
    public String getNome(){
        return this.nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    //Setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setSalario(double salario){
        System.out.println("O salário não pode ser alterado desta forma, solicite ao RH");
    }
    
    //Métodos
    void aumentarSalario(double porcentagem){
        if(porcentagem > 0){
            salario += (porcentagem/100)*salario;
            System.out.println("O salário aumentou em " + porcentagem + "% seu novo salário é R$" + salario);
        }else{
            System.out.println("Porcentagem inválida");
        }
    }
} //fim classe funcionario

class Gerente extends Funcionario{
    private String departamento;
    
    //construtor
    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setDepartamento(String novoDepartamento){
        System.out.println("Para migrar ao " + novoDepartamento + " será necessário solicitar ao RH");
    }
} 


public class Herancas
{
	public static void main(String[] args) {
		Gerente gerenteComercial = new Gerente("Vinicius", 10000, "Comercial");
	    System.out.println(gerenteComercial.getNome() + " " + gerenteComercial.getSalario() + " " + gerenteComercial.getDepartamento());
	    gerenteComercial.aumentarSalario(10);
	}
}
