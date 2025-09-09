import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.OptionalDouble;

public class ExercicioProduto{
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 2500.00, 10));
        produtos.add(new Produto("Smartphone", 1500.00, 20));
        produtos.add(new Produto("Tablet", 800.00, 15));
        produtos.add(new Produto("Monitor", 1200.00, 5));
        produtos.add(new Produto("Teclado", 200.00, 30));
        produtos.add(new Produto("Mouse", 100.00, 8));

        OptionalDouble media = produtos.stream().filter(p -> p.getQuantidade() > 10)
        .mapToDouble(p -> p.getPreco())
        .average();

        if(media.isPresent()){
            System.out.println("A média dos preços dos produtos com estoque maior que 10 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há produtos com quantidade maior que 10.");
    }
}}