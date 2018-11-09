package asoa;
	
	import java.util.*;
	import java.math.*;
	import java.util.ArrayList;
	

	public class MultiCongru {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in); 
			
			int semilla, cmultiplicativa,modulo; 
			int i, r;  
			double serie;  
			 
			
			System.out.println("Escriba una semilla: ");
			semilla = entrada.nextInt();
			System.out.print("Escriba una constante multiplicativa: ");
			cmultiplicativa= entrada.nextInt();
			System.out.print("Escriba el módulo: ");
			modulo = entrada.nextInt();
			
			//con i<20 se le pide que solamente genere 20 numeros
			for (i=1; i<=20; i++){
			   r = (cmultiplicativa*semilla) % modulo;   
			   serie = (double)r / (double)(modulo-1);
			   System.out.printf("%d. %d (%.4f)\n", i ,r ,serie ); 
			   semilla = r;  
			}

		}
	
}
