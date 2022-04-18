package c2tc.project1.service;

import c2tc.project1.entity.placement;

public interface servicelayer {
	
	void addplacement(placement placement);
	
	void updateplacement(placement placement);
	
	 placement searchplacement(long id);
	
	void cancelplacement(long id);
	
	

}
