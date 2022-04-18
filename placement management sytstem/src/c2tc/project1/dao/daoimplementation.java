package c2tc.project1.dao;

import javax.persistence.EntityManager;

import c2tc.project1.entity.placement;

public class daoimplementation implements Dao {

	EntityManager em;
	
	public daoimplementation()
	{
		em = configuration.getEntityManager();
	}
	
	@Override
	
	public void startTransaction() {
		em.getTransaction().begin();
		// TODO Auto-generated method stub

	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		// TODO Auto-generated method stub

	}

	@Override
	public void addplacement(placement placement) {

		em.persist(placement);
		// TODO Auto-generated method stub

	}

	@Override
	public void updateplacement(placement placement) {

		em.merge(placement);
		// TODO Auto-generated method stub

	}

	@Override
	public placement searchplacement(long id) {
		return em.find(placement.class,id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelplacement(long id) {
		placement p=em.find(placement.class,id);
		em.remove(p);
		// TODO Auto-generated method stub

	}

}
