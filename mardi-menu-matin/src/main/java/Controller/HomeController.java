package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"", "/accueil"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HomeController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--- in home controller ---");
		
		String category = "";
		if(request.getParameter("cat-Femme") != null) {
			category = (String) request.getParameter("cat-Femme");
			System.out.println("---- " + category + " -----");
		} else if(request.getParameter("cat-Homme") != null) {
			category = (String) request.getParameter("cat-Homme");
			System.out.println("---- " + category + " -----");
		} else if(request.getParameter("cat-Enfant") != null) {
			category = request.getParameter("cat-Enfant");
			System.out.println("---- " + category + " -----");
		}
		
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
