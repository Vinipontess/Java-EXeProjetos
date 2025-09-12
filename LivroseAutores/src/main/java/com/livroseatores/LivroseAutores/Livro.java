import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Livro{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String titulo;
    private int anoDePublicacao;

    @ManyToOne
    @JoinColumn(name = "autor_id");
    private Autor autor;

    //Construtor vazio por conta do JPA
    public class Livro() {
    }

    //Getters

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    
    public Autor getAutor() {
        return autor;
    }

    //setters

    public void setId(Long id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}