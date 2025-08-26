import java.util.ArrayList;
import java.util.List;
//classe principal --
public class SistemadeFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Gerente gerente1 = new Gerente("Tuller", 15000, "Desenvolvimento");
        Programador programador1 = new Programador("Vinicius", 8000, "Java");
        Programador programador2 = new Programador("Luan", 8000, "C#");
        Programador programador3 = new Programador("Cesar", 10000, "JavaScript");
        Gerente gerente2 = new Gerente("Antonio", 15000, "Projetos");


        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        funcionarios.add(programador1);
        funcionarios.add(programador2);
        funcionarios.add(programador3);


        for(Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário Base: R$" + funcionario.getSalario());
            System.out.println("Salário com Benefícios: R$" + funcionario.calcularSalario());
            System.out.println("-----------------------------");
        }
    }
}


abstract class Funcionario{
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
    public void aumentarSalario(double porcentagem){
        if(porcentagem > 0){
            salario += (porcentagem/100)*salario;
            System.out.println("O salário aumentou em " + porcentagem + "% seu novo salário é R$" + salario);
        }else{
            System.out.println("Porcentagem inválida");
        }
    }

    public abstract double calcularSalario();

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
    @Override
    public double calcularSalario(){
        double salarioBase = getSalario();
        return salarioBase + (salarioBase * 0.2);}
} 

class Programador extends Funcionario{
    private String linguagem;

    public Programador(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return this.linguagem;
    }

    public void setLinguagem(String novaLinguagem){
        System.out.println("Para migrar a " + novaLinguagem + " será necessário solicitar ao RH, pois terá de haver um cargo disponível");
    }

    @Override
    public double calcularSalario(){
        double salarioBase = getSalario();
        return salarioBase + (salarioBase * 0.1);
}}

