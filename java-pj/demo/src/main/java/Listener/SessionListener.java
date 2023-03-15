package Listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

	public int cpt = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		cpt++;
		System.out.println("session ouverte : "+ cpt);
		
		
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		cpt--;
		System.out.println("session ouverte : "+ cpt);
	}
	
}
