package br.com.aprendizadojava;

public class ValidacaoCPF {
    
    // Regra simplificada: um CPF válido deve ter exatamente 11 caracteres.
    public boolean isCPFValido(String cpf) {
        if (cpf == null) {
            return false;
        }
        return cpf.length() == 11;
    }
}