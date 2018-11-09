package asoa;
import java.util.ArrayList;
/*
 * %el metodo calcula si una cierta serie sigue una distribucion uniforme 
%PARAMETROS
% serie: serie pseudoaleatoria a evaluar
% ni: numero de subintervalis que analisaremos
% alpha: es el minimo error que podemos cometer al rechazar la hipotesis cuando esta es
% verdadera [0;1]

%RETORNO
%valores: VECTOR DE VALORES OBTENIDOS DE LA APLICACION DE METODO DE CHI^2
%[FRECUENCIA OBSERVADA, FRECUENCIA ESPERADA, COCIENTES]
%ho: resultado final de la aplicacion de metodo {true, false}
%chi2o: el valor de chi obtenido 
%chi2t: el valor de la tabla de chi de acuerdo a los grados de libertad (ni-1) y
%nivel de significancia (alpha)
*/
public class Chi2 {


	private ArrayList<Double> serie = new ArrayList<Double>();
	private int ni;
	private double alpha;
	private ArrayList<Double> fo = new ArrayList<Double>();
	private ArrayList<Double> fe = new ArrayList<Double>();
	private ArrayList<Double> cocientesDiferencias = new ArrayList<Double>();
	private double chi2Obtenido;
	private boolean h0;

		public Chi2(ArrayList<Double> serie, int ni, double alpha ) {
		this.setSerie(serie);
		this.setNi(ni);
		this.setAlpha(alpha);
	}
	
	/**
	 * BLOQUE SE SETERS Y GETERS
	 * */
	public ArrayList<Double> getSerie() {
		return serie;
	}
	public void setSerie(ArrayList<Double> serie) {
		this.serie = serie;
	}
	public int getNi() {
		return ni;
	}
	public void setNi(int ni) {
		this.ni = ni;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}
	public ArrayList<Double> getFo() {
		return fo;
	}
	public void setFo(ArrayList<Double> fo) {
		this.fo = fo;
	}
	public ArrayList<Double> getFe() {
		return fe;
	}
	public void setFe(ArrayList<Double> fe) {
		this.fe = fe;
	}
	public ArrayList<Double> getCocientesDiferencias() {
		return cocientesDiferencias;
	}
	public void setCocientesDiferencias(ArrayList<Double> cocientesDiferencias) {
		this.cocientesDiferencias = cocientesDiferencias;
	}
	public double getChi2Obtenido() {
		return chi2Obtenido;
	}
	public void setChi2Obtenido(double chi2Obtenido) {
		this.chi2Obtenido = chi2Obtenido;
	}
	public boolean getH0() {
		return h0;
	}
	public void setH0(boolean h0) {
		this.h0 = h0;
	}

	//Vector de frecuencia esperada
	public void obtenerFrecuenciaEsperada() {
		double valor;
		int n = this.getSerie().size();
		for (int i=0;i< this.getNi();i++) {
			valor = (double) (n / this.getNi());
			this.getFe().add(valor);
		}
	}
	
	//Vector de frecuencia obtenidas
	public void obtenerFrecuenciaObtenida() {
		int n = this.getSerie().size();
		for (int i=0;i< this.getNi();i++) {
			for (int k = 0; k < n; i++) {
				if((this.getSerie().get(k)> (i-1))&& (this.getSerie().get(k)<= i/this.getNi())) {
					this.getFo().add(this.getFo().get(i)+1);
				}
			}
		}
	}
	
	public void cocientes(){
		double valor;
		for (int i=0; i<this.getNi();i++) {
			valor = (double) Math.sqrt(this.getFo().get(i) - this.getFe().get(i))/(this.getFe().get(i));
			this.getCocientesDiferencias().add(i, valor );			
		}
	}
	
	
	//coc es el cocinete y se define como vector 
	
	public void TestHipotesis() {
		double chi2t = new Chi2Tabla().getValue(1-this.getAlpha(), this.getNi()-1 );
		
		if ( this.getChi2Obtenido() < chi2t ){
			this.setH0(true);
		}else {
			this.setH0(false);
		}
	}
}
