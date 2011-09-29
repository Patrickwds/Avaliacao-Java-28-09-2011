
public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		
		double resultado = valoresDeEntrada[0];
		
		for(int i = 0; i < valoresDeEntrada.length; i++) {
			if(valoresDeEntrada[i] < resultado){
				resultado = valoresDeEntrada[i];
			}
		}
		
		return resultado;
		}
	
	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		
		double resultado = valoresDeEntrada[0];
		
		for(int i = 0; i < valoresDeEntrada.length; i++){
			if(valoresDeEntrada[i] > resultado){
				resultado = valoresDeEntrada[i];
			}
		}
		
		return resultado;
		}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
		
		int quantnumeros = (int) valoresDeEntrada.length;
		
		return quantnumeros;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		
		double total = 0.0;
		
		for(int i = 0; i < valoresDeEntrada.length; i++){
			total += valoresDeEntrada[i];
		}		
		double mediaNumeros = (total/valoresDeEntrada.length);
		
		return mediaNumeros;
		}
	
	public static double[] calcula(double[] valoresDeEntrada) {
		
		double valores[] = new double[4];
		valores[0] = calculaValorMinimo(valoresDeEntrada);
		valores[1] = calculaValorMaximo(valoresDeEntrada);
		valores[2] = calculaQuantidade(valoresDeEntrada);
		valores[3] = calculaMedia(valoresDeEntrada);
		
		return valores;
	}

}
