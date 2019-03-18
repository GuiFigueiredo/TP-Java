package calculadora;

public class FuncoesMatematicas {
	
	public double soma (double a, double b) {
		
		double resultado = a+b;
		return resultado;
		
		
	}
	public double subtrair (double a, double b) {
		
		double resultado = a-b;
		return resultado;
		
	}
	public double multiplicar(double a, double b) {
		
		double resultado = a*b;
		return resultado;
		
	}
	public double dividir (double a, double b) {
		
		double resultado = a/b;
		return resultado;
		
		
	}
	public double porcentagem (double a, double b) {
		
		double resultado = (a*b)/100;
		return resultado;
	}
	public double raiz (double a) {
		
		return Math.sqrt(a);
	}
}
