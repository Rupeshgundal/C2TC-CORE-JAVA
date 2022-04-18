package c2tc.project1.service;

import c2tc.project1.dao.Dao;
import c2tc.project1.dao.daoimplementation;
import c2tc.project1.entity.placement;

public class servicelayerimplementation implements servicelayer{
	Dao dao;
	public servicelayerimplementation()
	{
		dao = new daoimplementation();
	}
	@Override
	public void addplacement(placement placement) {
		dao.startTransaction();
		dao.addplacement(placement);
		dao.endTransaction();
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateplacement(placement placement) {
		dao.startTransaction();
		dao.updateplacement(placement);
		dao.endTransaction();
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public placement searchplacement(long id) {
		return dao.searchplacement(id);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancelplacement(long id) {
		dao.startTransaction();
		dao.cancelplacement(id);
		dao.endTransaction();
		
		// TODO Auto-generated method stub
		
	}


}
