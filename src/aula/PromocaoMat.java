package aula;

public class PromocaoMat {
	public static void main(String []args) {
		double d = 100.99;
		int i = 100;
		/*
		 * aqui ocorre a promoção matemática
		 * i é convertido para double e então multiplicado
		 * 
		 */
		d = d * i;
		
		long x = 12345;
		float pi = 3.14f;
		x = x * (long) pi;
		//ou então, converte apenas o resultado
		x = (long) (x * pi);
		System.out.println(x);
	}

}
