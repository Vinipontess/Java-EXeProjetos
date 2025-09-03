package br.com.aprendizadojava;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidacaoCPFTest {

    @Test
    public void deveRetornarVerdadeiroParaCPFCom11Caracteres() {
        // Arrange
        ValidacaoCPF validacao = new ValidacaoCPF();
        String cpfValido = "12345678901";
        
        // Act
        boolean resultado = validacao.isCPFValido(cpfValido);
        
        // Assert
        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalsoParaCPFComMenosDe11Caracteres() {
        // Arrange
        ValidacaoCPF validacao = new ValidacaoCPF();
        String cpfInvalido = "12345";
        
        // Act
        boolean resultado = validacao.isCPFValido(cpfInvalido);
        
        // Assert
        assertFalse(resultado);
    }
    
    @Test
    public void deveRetornarFalsoParaCPFNulo() {
        // Arrange
        ValidacaoCPF validacao = new ValidacaoCPF();
        String cpfNulo = null;
        
        // Act
        boolean resultado = validacao.isCPFValido(cpfNulo);
        
        // Assert
        assertFalse(resultado);
    }
}