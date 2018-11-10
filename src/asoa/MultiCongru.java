package asoa;
	
	import java.util.*;
	import java.math.*;
	import java.util.ArrayList;
	

	public class MultiCongru {
		//public static void main(String[] args) {
			/*Scanner entrada = new Scanner(System.in); 
			int semilla, cmultiplicativa,modulo; 
			int i, r;  
			double serie;  
			System.out.println("Escriba una semilla: ");
			semilla = entrada.nextInt();
			System.out.print("Escriba una constante multiplicativa: ");
			cmultiplicativa= entrada.nextInt();
			System.out.print("Escriba el módulo: ");
			modulo = entrada.nextInt();
			*/
			private int r;
			private int semilla;
			private int cmultiplicativa;
			private int modulo;
			private double serie;
		//	private ArrayList serie = new ArrayList();
			
			//Get y Set
			public int getR(){
				return r;
			}
			public void setR(int r){
				this.r = r;
			}
			
			public int getSemilla(){
				return semilla;
			}
			public void setSemilla(int semilla) {
				this.semilla = semilla;
			}
			
			
			public int getModulo() {
				return modulo;
			}
			public void setModulo(int modulo) {
				this.modulo = modulo;
			}
			
			public int getCmultiplicativa() {
				return cmultiplicativa;
			}
			public void setCmultiplicativa(int cmultiplicativa) {
				this.cmultiplicativa= cmultiplicativa;
			}
			public double getSerie() {
				return serie;
			}
			public void setSerie(double serie) {
				this.serie= serie;
			}
		/*
			public ArrayList<Double> getSerie() {
				return serie;
			}
			public void setSerie(ArrayList<Double> serie) {
				this.serie= serie;
			}
			*/
			public void congruencia() {
				int i;
				//con i<20 se le pide que solamente genere 20 numeros
				for (i=1; i<=20; i++){
				   r = (cmultiplicativa*semilla) % modulo;   
				   serie = (double)r / (double)(modulo-1);
				   //System.out.printf("%d. %d (%.4f)\n", i ,r ,serie ); 
				   semilla = r;  
				}
			}
			}