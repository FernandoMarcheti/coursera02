import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {

		Pessoa p1 = new Pessoa("Fernando", "Marcheti", 29);
		Pessoa p2 = new Pessoa("Fernando", "Marcheti", 30);
		
		List<Diferenca> diferencas = Comparador.getDiferencas(p1, p2);
		
		diferencas.forEach(System.out::println);
	}

}
