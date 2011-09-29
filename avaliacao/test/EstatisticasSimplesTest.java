import static org.junit.Assert.*;

import org.junit.Test;

public class EstatisticasSimplesTest {

	@Test
	public void deveCalcularValorMinimoEntreDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
		assertEquals(5, valorMinimoCalculado, 0);
	}
	
	@Test
	public void deveCalcularValorMinimoEntreDoisValoresDois() {
		double valoresDeEntrada[] =  {9,5,4};
		double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
		assertEquals(4, valorMinimoCalculado, 0);
	}
	
	@Test
	public void deveCalcularValorMaximoEntreDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valorMaximoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
		assertEquals(9, valorMaximoCalculado, 0);
	}
	
	@Test
	public void deveCalcularValorMaximoEntreDoisValoresDois() {
		double valoresDeEntrada[] =  {10,9,5};
		double valorMaximoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
		assertEquals(10, valorMaximoCalculado, 0);
	}
	
	@Test
	public void deveCalcularQuantidadeDeValores() {
		double valoresDeEntrada[] =  {9,5};
		int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
		assertEquals(2, quantidadeDeValores);
	}
	
	@Test
	public void deveCalcularQuantidadeDeValoresDois() {
		double valoresDeEntrada[] =  {9,8,7,6,5,4,3,2,1};
		int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
		assertEquals(9, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
		assertEquals(7, mediaDeValores, 0);
	}
	
	@Test
	public void deveCalcularMediaDeDoisValoresDois() {
		double valoresDeEntrada[] =  {9,5,4};
		double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
		assertEquals(6, mediaDeValores, 0);
	}
	
	@Test
	public void deveEfetuarTodosCalculosParaDoisValores() {
		double valoresDeEntrada[] =  {9,5};
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] {5,9,2,7}, valoresDeSaida, 0);		
	}
}