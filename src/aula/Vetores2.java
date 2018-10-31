package aula;

public class Vetores2 {
	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		
		matriz [0][0] = 1;
		matriz [0][1] = 10;
		matriz [0][2] = 20;
				
		matriz [1][0] = 2;
		matriz [1][1] = 20;
		matriz [1][2] = 40;
								
		matriz [2][0] = 3;
		matriz [2][1] = 52;
		matriz [2][2] = 74;

	int mult = 1;	
	for(int i = 0; i <= 2; i++){
		for(int j = 0;  j <= 2; j++){
			System.out.print(matriz[i][j] + " ");
			if(i==0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0){
				mult = matriz[i][j] * mult;
				}
			
			}
		System.out.println("");
		}
	System.out.println(mult);
	}
}