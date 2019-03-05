package com.dejan.animalmanager.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericDAOImpl<T> implements GenericDAO<T> {

	@Autowired
	SessionFactory sessionFactory;
	
	// to be able to use different classes
	protected Class<T> entityClass;

	public GenericDAOImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Override
	public List<T> getAll() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query
		Query<T> theQuery = currentSession.createQuery("from " + entityClass.getName(), entityClass);
		// execute query
		List<T> list = theQuery.getResultList();
		// return the results
		return list;
	}

	@Override
	public void save(T t) {

		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(t);

	}

	@Override
	public T getOne(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();

		// retrieve/read from database using the primary key
		T t = currentSession.get(entityClass, theId);

		return t;
	}

	@Override
	public void deleteOne(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();

		// delete using primary key

		Query theQuery = currentSession.createQuery("delete from " + entityClass.getName() + " where id=:id");

		theQuery.setParameter("id", theId);

		theQuery.executeUpdate();

	}

	@Override
	public List<T> search(String theSearch) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = null;

		// search only if theSearch is not empty
		if (theSearch != null && theSearch.trim().length() > 0) {
			theQuery = currentSession.createQuery("from " + entityClass.getName()
					+ " where lower(name) like:theName or lower(breed) like:theName or lower(sex) like :theName",
					entityClass);
			theQuery.setParameter("theName", theSearch.toLowerCase());

		} else {
			// if theSearch is empty return all 
			theQuery = currentSession.createQuery("from " + entityClass.getName(), entityClass);
		}

		List<T> list = theQuery.getResultList();

		return list;
	}

}
