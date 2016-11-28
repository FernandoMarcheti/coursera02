import java.util.List;

public class Main {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setEmail("fernandomarcheti@gmail.com");
		usuario.setNome("Fernando Marcheti");
		usuario.setUsuario("fmarcheti");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		List<Usuario> list = usuarioDAO.get();
		list.forEach(System.out::println);
	}
}
