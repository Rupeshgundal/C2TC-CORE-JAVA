package tnsif.c2tc.pr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.pr.entity.Placement;
import tnsif.c2tc.pr.repo.PlacementRepo;

@Service
public class ServiceLayerImpl implements ServiceLayer {

	@Autowired
	PlacementRepo cr;
	
	@Override
	public void addPlacement(Placement ct) {
		
		cr.save(ct);

	}

	
	@Override
	public Placement searchPlacement(int i) {
		Placement c = cr.findById(i).get();
		return c;
	}
	
	@Override
	public Placement updatePlacement(Placement ct) {
		Placement c = cr.save(ct);
		return c;
	}


	@Override
	public int deletePlacement(int id) {
		Placement c = cr.findById(id).get();
		cr.delete(c);
		return 1;
	}

}