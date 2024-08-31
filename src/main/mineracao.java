package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import regrasAssociacao.Regras;

/** Prof: Pablo Florentino 
Disciplina: INF010 
Alunos: Lucas Fonseca e Liane Barbosa, Sarah Andrade 
E-mail: 20192160024@ifba.edu.br / 20202160012@ifba.edu.br / 20221160014@ifba.edu.br */
public class mineracao {
	public static void main(String [] args) {
		
		List<String> chaves = new ArrayList<>();
		chaves.add("leite");
		chaves.add("cafe");
		chaves.add("cerveja");
		chaves.add("pao");
		chaves.add("manteiga");
		chaves.add("arroz");
		chaves.add("feijao");

		List<Map<String, Boolean>> transacoes = new ArrayList<>();
		transacoes.add(Map.of("leite", false, "cafe", true, "cerveja", false, "pao", true, "manteiga", true, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", true, "cafe", false, "cerveja", true, "pao", true, "manteiga", true, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", false, "cafe", true, "cerveja", false, "pao", true, "manteiga", true, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", true, "cafe", true, "cerveja", false, "pao", true, "manteiga", true, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", true, "pao", false, "manteiga", false, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", false, "pao", false, "manteiga", true, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", false, "pao", true, "manteiga", false, "arroz", false, "feijao", false));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", false, "pao", false, "manteiga", false, "arroz", false, "feijao", true));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", false, "pao", false, "manteiga", false, "arroz", true, "feijao", true));
		transacoes.add(Map.of("leite", false, "cafe", false, "cerveja", false, "pao", false, "manteiga", false, "arroz", true, "feijao", false));

		
		Regras regras = new Regras(chaves,transacoes);
		regras.calcularRegras();
		
	}
}
