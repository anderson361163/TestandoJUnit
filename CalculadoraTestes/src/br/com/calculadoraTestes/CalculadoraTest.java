package br.com.calculadoraTestes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/* 
 * Por conven��o tem que ser o mesmo nome da classe testado
 * seguida do sufixo Test
 */
public class CalculadoraTest {

	/*
	 * Todas as IDEs, possui ele instalado;
	 * Como n�o temos m�todos main, essa anota��o
	 * executa eles;
	 */
	@Test 
	public void deveriaTestarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,7);
		
		/* A classe assert serve para verificar se est� correto os valores
		 * ela possui varios m�todos, para ver a igualdade basta colocar o 
		 * m�todo assertEquals, o primeiro valor � o que � esperado e o segundo
		 * e a variavel a ser testada.
		 */
		Assert.assertEquals(10, soma);
		
	}
	
}
