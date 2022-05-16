package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	//constructor
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	//otros metodos
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;	
	}
	
	public String toString() {
		String a="";
		String b=", ";
		for (int i=0;i<this.letras.length;i++) {
			String c=this.letras[i];
			a=a.concat(c);
			a=a.concat(b);
		}
		return a;
	}
	
	//metodos get y set
	
	public String[] getLetras(){
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public static void main(String Args[]) {
		Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
				new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
				"Alfabeto latino");
		System.out.println(alfabeto);
	}
}
