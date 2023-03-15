package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import Entity.User;

@WebServlet({"", "/accueil"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("login", "");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(request.getParameter("deco") != null) {
			session.invalidate();
			try {
				User verifUserIsConnect = (User) session.getAttribute("user");
				System.out.println(verifUserIsConnect.getName());
			} catch(Exception e) {
				System.out.println("user is null");
			}

		}
		try {
			String login = request.getParameter("txt-login");
			String pass = request.getParameter("txt-pass");
			if(login.equals("titi") && pass.equals("9876")) {
				User user = new User(login, pass);
				session.setAttribute("user", user);
				session.setAttribute("login", user.getName());
			}
		} catch(Exception e) {
			System.out.println("\n");
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
