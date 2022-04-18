package c2tc.project1.dao;

import c2tc.project1.entity.placement;

public interface Dao  {
	
	void startTransaction();

	void endTransaction();
	
	void addplacement(placement placement);

    void updateplacement(placement placement);

     placement searchplacement(long id);

    void cancelplacement(long id);


}
