import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/soma")
public class Somar extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		int p1 = Integer.parseInt(req.getParameter("p1"));
		int p2 = Integer.parseInt(req.getParameter("p2"));
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body>");
		writer.append("Total das parcelar: " + (p1 + p2));
		writer.append("</body></html>");
	}
}
