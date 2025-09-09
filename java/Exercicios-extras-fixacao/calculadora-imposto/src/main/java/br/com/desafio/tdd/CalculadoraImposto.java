package br.com.desafio.tdd;

public class CalculadoraImposto{
    double salario;

    //meu construtor
    public CalculadoraImposto(double salario) {
        this.salario = salario;
    }

    //meus getters
    public double getSalario() {
        return salario;
    }
    //meus setters
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //método
    public double calcularImposto(){
        if(salario < 0){
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        } else if(salario < 2500){
            return 0;
        } else {
            salario = salario - 2500;
            return salario * 0.1;
        }
    }
}