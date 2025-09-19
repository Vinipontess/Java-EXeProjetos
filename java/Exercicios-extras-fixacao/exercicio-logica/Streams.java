import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;



class Funcionario{
    private String nome;
    private double salario;
    private String departamento;

    //meu construtor
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //meus getters

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }

    //meus setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


public class Streams{
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Tuller", 10000, "TI");
        Funcionario f2 = new Funcionario("Sofia", 2000, "Financeiro");
        Funcionario f3 = new Funcionario("Vinicius", 8000, "TI");
        Funcionario f4 = new Funcionario("Ana", 5000, "Marketing");
        Funcionario f5 = new Funcionario("João", 3000, "Comercial");
        Funcionario f6 = new Funcionario("Maria", 10000, "Comercial");
        Funcionario f7 = new Funcionario("Rafael", 8000, "Comercial");

        List<Funcionario> funcionarios = List.of(f1, f2, f3, f4, f5, f6, f7);

        List<String> nomes = funcionarios.stream()
            .filter(funcionario -> funcionario.getDepartamento().equals("Comercial") && funcionario.getSalario() > 7000)
            .map(funcionario -> funcionario.getNome())
            .sorted()
            .collect(Collectors.toList());

        System.out.println(nomes);
        
    }
}