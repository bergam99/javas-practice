package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet({"/accueil",""})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("login", "");
		request.setAttribute("pass", "");
		
		String name = "franck";
		request.setAttribute("name", name);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		request.setAttribute("login", login);
		
		
		if(login.equals("franck") && pass.equals("1234")) {
			
			HttpSession session = request.getSession();
		
			session.setAttribute("login", login);
			session.setAttribute("pass", pass);
			
			response.sendRedirect(request.getContextPath() + "/connexion");
			
			
		} else {

			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		
		
		
	}

}
