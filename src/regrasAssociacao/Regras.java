package regrasAssociacao;

import java.util.List;
import java.util.Map;

public class Regras {
	private List<String> chaves;
	private List<Map<String,Boolean>> transacoes;
	
	public Regras (List<String> chaves,List<Map<String,Boolean>> transacoes) {
		this.chaves=chaves;
		this.transacoes=transacoes;
	}
	
	public void calcularRegras() {
	    int total = transacoes.size();

	 
	    for (String chave1 : chaves) {
	        for (String chave2 : chaves) {
	            if (!chave1.equals(chave2)) {
	                int x = 0;  // 
	                int xy = 0; // 

	                for (Map<String, Boolean> transacao : transacoes) {
	                    Boolean valor1 = transacao.get(chave1);
	                    Boolean valor2 = transacao.get(chave2);

	                    if (valor1 != null && valor2 != null) {
	                        if (valor1 && valor2) {
	                            xy += 1;  
	                            x+=1;
	                        }
	                        if (valor1) {
	                            x += 1;  
	                        }
	                    }
	                }

	                Confianca confianca = new Confianca(x, xy);
	                Suporte suporte = new Suporte(xy, total);
	                System.out.println("Regra: " + chave1 + " -> " + chave2 + 
	                                   " | Suporte: " + suporte.calcularSuporte() + 
	                                   " | Confiança: " + confianca.calculoConfianca());
	            }
	        }
	    }
	}


 
}
