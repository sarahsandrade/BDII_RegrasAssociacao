package regrasAssociacao;

public class Suporte {
	private int xy;
	private int total;
	
	public Suporte(int xy,int total) {
		this.xy=xy;
		this.total=total;
	}
	
	public double calcularSuporte() {
		return (double)xy/total;
	}
}
