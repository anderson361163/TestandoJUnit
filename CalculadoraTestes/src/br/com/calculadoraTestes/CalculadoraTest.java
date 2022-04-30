package br.com.calculadoraTestes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/* 
 * Por convenção tem que ser o mesmo nome da classe testado
 * seguida do sufixo Test
 */
public class CalculadoraTest {

	/*
	 * Todas as IDEs, possui ele instalado;
	 * Como não temos métodos main, essa anotação
	 * executa eles;
	 */
	@Test 
	public void deveriaTestarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,7);
		
		/* A classe assert serve para verificar se está correto os valores
		 * ela possui varios métodos, para ver a igualdade basta colocar o 
		 * método assertEquals, o primeiro valor é o que é esperado e o segundo
		 * e a variavel a ser testada.
		 */
		Assert.assertEquals(10, soma);
		
	}
	
}
