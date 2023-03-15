package Controler;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet({"", "/accueil"})
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
		
		//ArrayList<String> products = new ArrayList<>(Arrays.asList("echarpe", "chaussure", "gant"));
		
		//request.setAttribute("products", products);
		
		
		System.out.println("-----------------");
		
		String s  = request.getParameter("select");
		
		if(s == null) {
			System.out.println(s);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			System.out.println(s);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	
		System.out.println("-----------------");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String value= request.getParameter("select2");
		String label = request.getParameter("selectedLabel"); 
		

		System.out.println("param of select : " + value);
		System.out.println("param of label selected : " + label);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
