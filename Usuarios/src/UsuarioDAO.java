import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	public void salvar(Usuario usuario){
		final String sql = "insert into usuario (usuario, nome, email) values (?, ?, ?);";
		try(Connection c = ConexaoMySQL.getConexao()){
			try(PreparedStatement ps = c.prepareStatement(sql)){
				ps.setString(1, usuario.getUsuario());
				ps.setString(2, usuario.getNome());
				ps.setString(3, usuario.getEmail());
				
				ps.execute();
			};
		} catch (Exception e) {
		}
	}
	
	public List<Usuario> get(){
		List<Usuario> usuarios = new ArrayList<>();
		final String sql = "select * from usuario";
		try(Connection c = ConexaoMySQL.getConexao()){
			try(PreparedStatement ps = c.prepareStatement(sql)){
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					Usuario usuario = new Usuario();
					usuario.setEmail(rs.getString("email"));
					usuario.setNome(rs.getString("nome"));
					usuario.setUsuario(rs.getString("usuario"));
					usuarios.add(usuario);
				}
			}
		} catch (Exception e) {
		}
		return usuarios;
	}
}