package com.inoui.model;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DAOHibernate {
	
		private Session session;
		
		public DAOHibernate() {
			
		     Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");

			//Ajout des classes JPA
		     configuration.addAnnotatedClass(Clients.class);

			
		     ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		     SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		     session = sessionFactory.openSession();
		     }
		
		public void insertClient(Clients client) {
			this.session.beginTransaction();
			this.session.save(client);
			this.session.getTransaction().commit();
		}
		
		public List<Clients> lectureClient() {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			
			CriteriaQuery<Clients> criteria = builder.createQuery(Clients.class);
			criteria.from(Clients.class);
			
			List<Clients> client = session.createQuery(criteria).getResultList();
			
			return client;
		}
		
		

}
