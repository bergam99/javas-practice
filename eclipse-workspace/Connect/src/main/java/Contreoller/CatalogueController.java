package Contreoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/catalogue")
public class CatalogueController extends HttpServlet {
		System.out.println("catalogue fonctionne");
	private static final long serialVersionUID = 1L;
		System.out.println("catalogue fonctionne");



    public CatalogueController() {
    	System.out.println("catalogue fonctionne");

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---in catalog controller ---");

		request.getRequestDispatcher("/catalogue.jsp").forward(request, response);
		System.out.println("catalogue fonctionne");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("catalogue fonctionne");

	}

}
