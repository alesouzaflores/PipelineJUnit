package teste;

import org.junit.*;

import aplicacao.Calculadora;

public class CalculadoraTeste {

	@Test
	public void testeSoma() {
		double resultado;
		
		Calculadora calculadora = new Calculadora();
		resultado = calculadora.soma(10.0, 5.0);
		Assert.assertEquals(5.0, resultado, 0);
	}
	
	@Test
	public void testeSubtracao() {
		double resultado;
		
		Calculadora calculadora = new Calculadora();
		resultado = calculadora.subtracao(10.0, 5.0);
		Assert.assertEquals(5.0, resultado, 0);
	}
	
	@Test
	public void testeMultiplicacao() {
		double resultado;
		
		Calculadora calculadora = new Calculadora();
		resultado = calculadora.multiplicacao(10.0, 5.0);
		Assert.assertEquals(50.0, resultado, 0);
	}
	
	@Test
	public void testeDivisao() {
		double resultado;
		
		Calculadora calculadora = new Calculadora();
		resultado = calculadora.divisao(10.0, 5.0);
		Assert.assertEquals(2.0, resultado, 0);
	}
	
}
