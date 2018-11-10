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
	}
}
