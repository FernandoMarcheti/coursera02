import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/buscar")
public class BuscarServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parameter = req.getParameter("produto");
		TiposProduto tiposProduto = new TiposProduto();
		List<String> produtos = tiposProduto.get(parameter);
		req.setAttribute("produto", produtos);
		req.getRequestDispatcher("tipos.jsp").forward(req, resp);
	}

}
