package Listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("servlet created...");
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("servlet destroyed...");
	}

}
