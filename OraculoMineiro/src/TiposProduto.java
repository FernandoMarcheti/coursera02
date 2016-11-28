import java.util.ArrayList;
import java.util.List;

public class TiposProduto {

	public List<String> get(String tipoProduto){
		List<String> lista = new ArrayList<>();
		if("doce de leite".equals(tipoProduto)){
			lista.add("doce de leito 1");
			lista.add("doce de leito 2");
			lista.add("doce de leito 3");
		} else if ("queijo".equals(tipoProduto)){
			lista.add("queijo 1");
			lista.add("queijo 2");
			lista.add("queijo 3");
		}
		return lista;
	}
}
