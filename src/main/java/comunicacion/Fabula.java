package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	//constructor
	public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}
	
	//otros metodos
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*1*palabrasPagina;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		
		return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+ensenanza;
		
	}
	//metodos get y set	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza=ensenanza;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}

}
