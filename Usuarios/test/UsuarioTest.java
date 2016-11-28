import static org.junit.Assert.assertEquals;

import java.util.List;

import org.dbunit.Assertion;
import org.dbunit.DatabaseUnitException;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

	private JdbcDatabaseTester tester;
	
	@Before
	public void setup() throws Exception {
		tester = new JdbcDatabaseTester("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/usuario?useSSL=false", "root", "root");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		tester.setDataSet(loader.load("/usuarios.xml"));
		tester.onSetup();
	}
	
	@Test
	public void testGet() {
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> list = dao.get();
		assertEquals(2, list.size());
		assertEquals("joao", list.get(0).getUsuario());
	}
	
	@Test
	public void testInsert() throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("fer@gmail.com");
		usuario.setNome("fer");
		usuario.setUsuario("fm");
		UsuarioDAO dao = new UsuarioDAO();
		dao.salvar(usuario);

		IDataSet currentDataSet = tester.getConnection().createDataSet();
		ITable currentTable = currentDataSet.getTable("USUARIO");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataSet = loader.load("/usuarios_insert.xml");
		ITable expectedTable = expectedDataSet.getTable("USUARIO");
		
		Assertion.assertEquals(expectedTable, currentTable);
	}

}
