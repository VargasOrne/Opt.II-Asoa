package asoa;

import java.util.*;
import java.util.ArrayList;
import java.math.*;

public class NumeroIndice {
	/*
	 	%metodo que genera la muestra aleatoria que se ajuste a la distribucion
		%pasada como parametro distribucin, por medio de los numeros que se 
		%encuentran en la serie pseudoaleatoria parada como parametro
		
		x=distribucion(1,:);
		Fx=distribucion(2,:);
		%aplico metodo de los numeros indices
		n=length(serie);
		
		k = 1;
		for k =1:n
		    j = 1;
		    while serie(k) > Fx(j); 
		        j = j + 1;
		    end
		        Muestra(k) = x(j);
		end
	 */
	
	private ArrayList<Double> x = new ArrayList();
	private ArrayList<Double> Fx = new ArrayList();
	private ArrayList<Double> muestra = new ArrayList();
	private ArrayList<Double> serie = new ArrayList();
	private int j;
	private int k;

	public ArrayList<Double> getX() {
		return x;
	}
	public void setX(ArrayList<Double> x) {
		this.x=x;
	}
	
	
	public ArrayList<Double> getFx(){
		return Fx;
	}
	public void setFx(ArrayList<Double> Fx){
		this.Fx= Fx;
	}
	
	
	public ArrayList<Double> getMuestra(){
		return muestra;
	}
	public void setMuestra(ArrayList<Double> muestra) {
		this.muestra=muestra;
	}
	
	
	public ArrayList<Double> getSerie(){
		return serie;
	}
	public void setSerie(ArrayList<Double> serie) {
		this.serie=serie;
	}
	
	
	public void NumIndice() {
		int n= this.getSerie().size();
//		for (int k=0;k <this.getN;k++) {
		for (int k=0;k <5;k++) {  //asigno un valor, que k sea menor que 5
			while (this.getSerie().get((int)k)> this.getFx().get((int)j));
			j=j+1;
			}
			//this.setMuetra().get(k)= this.setX().get(j);
			}
		}
	
