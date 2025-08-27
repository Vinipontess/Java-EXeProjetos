import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


public class HashSeteHashMap
{
	public static void main(String[] args) {
	    //Entendendo o HashSet
	    Set<String> emails = new HashSet<>();
	    emails.add("pontesivini@gmail.com");
	    emails.add("vouentrarnoitau@gmail.com");
	    emails.add("aprendendojava@gmail.com");
	    emails.add("pontesivini@gmail.com"); //entendendo na prática que HashSet não deixa repetir números diferente do arrayList
	    System.out.println("Sua lista já tem " + emails.size() + " convidados");
	    System.out.println("Enviando os emails para os convidados");
	    System.out.println("---------------------");
	    for(String email : emails){
	        System.out.println("- " + email);
	        
	        //Entendendo o HashMap
	    }System.out.println("");
	    System.out.println("---HashMap Catalogo---");
	    System.out.println("");
	    Map<String, Double> catalogo = new HashMap<>();
	    catalogo.put("Carne", 30.00);
	    catalogo.put("Frango", 20.00);
	    catalogo.put("Calabresa", 15.00);
	    
	    System.out.println("Consultando o preço da carne...");
	    System.out.println("O preço da carne está R$" + catalogo.get("Carne"));
	    System.out.println("------------------------");
	    System.out.println("Catálogo completo");
	    
	    
	    for(Map.Entry<String, Double> entry : catalogo.entrySet()){
	        String produto = entry.getKey();
	        Double preco = entry.getValue();
	        System.out.println("Produto: " + produto + " | Preço: R$" + preco);
	        
	    }
	    
	}
}
