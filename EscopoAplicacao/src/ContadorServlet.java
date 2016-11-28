import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contar")
public class ContadorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getAttribute("contador") == null){
			req.setAttribute("contador", new Contador("request"));
		}
		((Contador)req.getAttribute("contador")).count();
		
		if(req.getSession().getAttribute("contador") == null){
			req.getSession().setAttribute("contador", new Contador("session"));
		}
		((Contador)req.getSession().getAttribute("contador")).count();
		
		if(req.getServletContext().getAttribute("contador") == null){
			req.getServletContext().setAttribute("contador", new Contador("application"));
		}
		((Contador)req.getServletContext().getAttribute("contador")).count();
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body>");
		writer.append("<h1>" + req.getAttribute("contador")  + "</h1>");
		writer.append("<h1>" + req.getSession().getAttribute("contador")  + "</h1>");
		writer.append("<h1>" + req.getServletContext().getAttribute("contador")  + "</h1>");
		writer.append("</body></html>");
	}
}
