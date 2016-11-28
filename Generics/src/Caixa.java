import java.util.LinkedList;
import java.util.List;

public class Caixa<E> {

	private List<E> elementos = new LinkedList<>();
	private int qtdeElementos = 0;

	public void adiciona(E elemento){
		this.elementos.add(elemento);
		this.qtdeElementos++;
	}
	
	public void adiciona(Caixa<? extends E> elementos){
		this.elementos.addAll(elementos.elementos);
	}
	
	public E remove(E elemento){
		for(int i = 0; i < this.elementos.size(); i++){
			if(elementos.get(i).equals(elemento))
				this.qtdeElementos--;
				return elementos.remove(i);
		}
		throw new RuntimeException("Elemento Indisponível");
	}
	
	public void removeTudo(List<E> elementos){
		this.elementos.removeAll(elementos);
	}
	
	public int getTotalElementos(){
		return this.qtdeElementos;
	}
}
