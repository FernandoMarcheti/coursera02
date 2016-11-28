import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("T�nis", 300.0));
		produtos.add(new Produto("Camisa", 200.0));
		produtos.add(new Produto("Cal�a", 250.0));
		
		produtos.forEach(System.out::println);
		
		Carrinho carrinho = new Carrinho(produtos);
		carrinho.acrescimo(10, p -> p.getValor() < 200);
		
		produtos.forEach(System.out::println);
	}
}
