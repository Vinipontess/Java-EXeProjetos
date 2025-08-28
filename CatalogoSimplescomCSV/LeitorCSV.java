import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class LeitorCSV{
    public static void main (String [] args){
    
        Path path = Paths.get("produtos.csv");
        Scanner scanner = new Scanner(System.in);
        int aux = 1;

        while(aux != 0){
            System.out.println("------Menu------");
            System.out.println("Escolha uma das opções");
            System.out.println("1. Listar Produtos");
            System.out.println("2. Buscar produto");
            System.out.println("3. Sair");
            aux = scanner.nextInt();
            switch (aux){
                case 1:
                try{
                    List<String> linhasLidas = Files.readAllLines(path);
                    for(int i = 0; i < linhasLidas.size(); i++){
                        String linha = linhasLidas.get(i);
                        String[] partes = linha.split(",");
                        String nome = partes[0];
                        double preco = Double.parseDouble(partes[1]);
                        int quantidade = Integer.parseInt(partes[2]);
                        
                        Produto produto = new Produto(nome, preco, quantidade);
                        
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Preço: R$" + produto.getPreco());
                        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                        System.out.println("-----------------------------");
                    }
                }
                catch(IOException e){
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                break;
                case 2:
                try{
                    String procurarProduto;
                    boolean encontrado = false;
                    System.out.println("Digite o nome do produto que deseja buscar:");
                    procurarProduto = scanner.next();
                    List<String> linhasLidas = Files.readAllLines(path);
                    for(String linha : linhasLidas){
                        if(linha.toLowerCase().contains(procurarProduto.toLowerCase())){
                            System.out.println("Produto encontrado:");
                            System.out.println("Produto, Preço e estoque:");
                            System.out.println(linha);
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Produto não encontrado");
                    }
                }
                catch(IOException e){
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                break;
                case 3:
                System.out.println("Sistema encerrado");
                aux = 0;
                break;
                default:
                System.out.println("Digite uma das opções que há no menu");
            }
        }

}}

class Produto{
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
        String sn = "s";
        System.out.println("Tem certeza que vai realizar esta promoção? O valor do produto passará a ser R$" + novoPreco + "(s/n) s = sim e n = não");
        if(sn == "s"){
            this.preco = novoPreco;
            System.out.println("Novo preço atualizado para o produto!");
        }else{
            System.out.println("Alteração cancelada!");
        }}
        else{
            this.preco = novoPreco;
            System.out.println("Novo preço para o produto, agora o valor é de R$" + this.preco);
        }
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
        System.out.println("Nova quantidade no estoque: " + this.quantidade);
    }


}
