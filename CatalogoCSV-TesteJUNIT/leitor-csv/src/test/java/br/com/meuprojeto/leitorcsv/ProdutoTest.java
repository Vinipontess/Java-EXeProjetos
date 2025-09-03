package br.com.meuprojeto.leitorcsv;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProdutoTest 
{

    @Test
    public void TestandoConstrutor() // aqui eu testo o construtor
    {
        Produto produto = new Produto("Caneta", 2.50, 200);
        assertTrue(produto.getNome().equals("Caneta"));
        assertTrue(produto.getPreco() == 2.50);
        assertTrue(produto.getQuantidade() == 200);
    }
    @Test
    public void TestandoSetters() //aqui eu testo os setters
    {
        Produto produto = new Produto("Caneta", 2.50, 200);
        produto.setNome("Lápis");
        produto.setPreco(1.50);
        produto.setQuantidade(300);
        assertTrue(produto.getNome().equals("Lápis"));
        assertTrue(produto.getPreco() == 1.50);
        assertTrue(produto.getQuantidade() == 300);
    }
    //neste proximo estou testando o método ValordoEstoque
    @Test
    public void ValordoEstoque(){
        Produto produto = new Produto("Caderno", 15.00, 100);
        double valorEstoque = produto.getPreco() * produto.getQuantidade();
        assertTrue(valorEstoque == 1500.00);
    }
}
