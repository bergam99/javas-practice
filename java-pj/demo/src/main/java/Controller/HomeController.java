package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import Entity.Product;
import Entity.User;

@WebServlet({"","/accueil"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HomeController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("login", "");
		
		
		// je créer mes produits car pour le moment je n'ai pas de base de données
		Product produit1 = new Product("echarpe", "echarpe cachemir noir", 5.20 );
		Product produit2 = new Product("bonet", "bonet lacost noir", 15.30 );
		Product produit3 = new Product("pull", "pull taille:L blanc", 35. );
		Product produit4 = new Product("tee-shirt", "blanc taille s", 5. );
		
		// je les stoque dans une liste
		ArrayList<Product> store= new ArrayList<>();
		store.add(produit1);
		store.add(produit4);
		store.add(produit3);
		store.add(produit2);
		
		// je l'intègre en attribut de request (clé, valeur)
		request.setAttribute("store", store);
		
		// j'envoi la page demande
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		
		if(request.getParameter("disconnect") != null) {
			session.invalidate();
			session.setAttribute("login", "");
		}
		

		try {
			String login = request.getParameter("login-connexion");
			String pass = request.getParameter("pass-connexion");
			User user = new User(login, pass);
			if(login.equals("soso") && pass.equals("1234")) {
				session.setAttribute("currentUser", user);
				session.setAttribute("login", user.getName());
			}
		} catch(Exception e) {
			System.out.println("disconnect or invalid connexion");
		}

		
		Product produit1 = new Product("echarpe", "echarpe cachemir noir", 5.20 );
		Product produit2 = new Product("bonet", "bonet lacost noir", 15.30 );
		Product produit3 = new Product("pull", "pull taille:L blanc", 35. );
		Product produit4 = new Product("tee-shirt", "blanc taille s", 5. );
		
		ArrayList<Product> store= new ArrayList<>();
		store.add(produit1);
		store.add(produit4);
		store.add(produit3);
		store.add(produit2);
		
		request.setAttribute("store", store);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
