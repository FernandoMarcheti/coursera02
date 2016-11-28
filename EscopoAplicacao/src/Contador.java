
public class Contador {

	private String nome;
	private int qtde;

	public Contador(String nome) {
		super();
		this.nome = nome;
	}

	public void count(){
		this.qtde++;
	}
	
	@Override
	public String toString() {
		return this.nome + " = " + this.qtde;
	}
}
