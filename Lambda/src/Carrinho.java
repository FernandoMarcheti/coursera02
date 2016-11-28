import java.util.List;

public class Carrinho {

	List<Produto> produtos;

	public Carrinho(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}
	
	public void acrescimo(int porcentagem, Condicao<Produto> condicao){
		for (Produto produto : produtos) {
			if(condicao.acrescimo(produto)){
				produto.setValor(produto.getValor() * porcentagem / 100 + produto.getValor());
			}
		}
	}
}


