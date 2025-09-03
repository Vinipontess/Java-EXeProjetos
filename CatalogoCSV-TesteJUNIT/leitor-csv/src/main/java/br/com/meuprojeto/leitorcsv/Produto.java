package br.com.meuprojeto.leitorcsv;

public class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    //meu contrutor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    // meus getters
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    // Meus setters

    public void setNome(String novoNome){
        this.nome = novoNome;
        System.out.println("Nome do produto atualizado com sucesso!");
    }

    public void setPreco(double novoPreco){
        if(novoPreco < preco){
            this.preco = novoPreco;
            System.out.println("Novo preço atualizado para o produto! ENTROU NA PROMOÇÃO");
        }
        else{
            this.preco = novoPreco;
            System.out.println("Novo preço para o produto e ele aumentou!! Agora o valor é de R$" + this.preco);
        }
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
        System.out.println("Nova quantidade no estoque: " + this.quantidade);
    }

    //Métodos
    public void ValordoEstoque(){
        double valorEstoque = this.preco * this.quantidade;
        System.out.println("O valor total do estoque é de R$" + valorEstoque);
    }

}