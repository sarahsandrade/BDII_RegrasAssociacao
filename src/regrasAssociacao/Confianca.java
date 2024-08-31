package regrasAssociacao;

public class Confianca {
	private int x;
	private int xy;
	public Confianca(int x,int xy) {
		this.x=x;
		this.xy=xy;
	}
	public double calculoConfianca() {
		return (double)xy/x;
	}
	
	
}
