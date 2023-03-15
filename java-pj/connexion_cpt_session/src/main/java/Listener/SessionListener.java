package Listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	
	public int count = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		this.count++;
		System.out.println("nombres de session : " + this.count);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		this.count--;
		System.out.println("nombres de session : " + this.count);
	}
	

}
