package br.com.meuprojeto.leitorcsv;

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