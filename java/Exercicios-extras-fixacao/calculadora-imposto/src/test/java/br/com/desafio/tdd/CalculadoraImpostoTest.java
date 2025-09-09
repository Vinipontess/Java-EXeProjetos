package br.com.desafio.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CalculadoraImpostoTest 
{

    @Test
    public void ImpostoemZero()
    {
        //preparar
        CalculadoraImposto calc = new CalculadoraImposto(1500);

        //executar
        double imposto = calc.calcularImposto();

        //testar
        assertTrue(imposto == 0);
    }

    @Test
    public void ImpostoemDezPorCento()
    {
        //preparar
        CalculadoraImposto calc = new CalculadoraImposto(4000);

        //executar
        double imposto = calc.calcularImposto();

        //testar
        assertTrue(imposto == 150);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SalarioInvalido()
    {
        CalculadoraImposto calc = new CalculadoraImposto(-1500);

        calc.calcularImposto();
    }
}
