package com.patanjali;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.patanjali.domain.Movie;

public class App 
{
	private SessionFactory sessionFactory=null;
	
	public void initSessionFactory() {
		Configuration config = new Configuration().configure();
		ServiceRegistry sregistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(sregistry);
	}
	
	public void persistMovie(Movie movie){
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
	}
	
    public static void main( String[] args )
    {
    	App app = new App();
    	app.initSessionFactory();
    	Movie movie = new Movie();
    	movie.setDirector("zack snyder");
    	movie.setSynopsys("movie about batman vs superman and wonder woman");
    	movie.setTitle("batman vs superman");
		app.persistMovie(movie );
    }
}
