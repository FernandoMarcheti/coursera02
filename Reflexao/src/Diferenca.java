
public class Diferenca {

	String propriedade;
	Object objVelho;
	Object objNovo;

	public Diferenca(String propriedade, Object objVelho, Object objNovo) {
		super();
		this.propriedade = propriedade;
		this.objVelho = objVelho;
		this.objNovo = objNovo;
	}

	public String getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}

	public Object getObjVelho() {
		return objVelho;
	}

	public void setObjVelho(Object objVelho) {
		this.objVelho = objVelho;
	}

	public Object getObjNovo() {
		return objNovo;
	}

	public void setObjNovo(Object objNovo) {
		this.objNovo = objNovo;
	}

	@Override
	public String toString() {
		return "Diferenca [propriedade=" + propriedade + ", objVelho=" + objVelho + ", objNovo=" + objNovo + "]";
	}

}
