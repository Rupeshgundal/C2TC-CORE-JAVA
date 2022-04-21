package tnsif.c2tc.pr.Service;

import tnsif.c2tc.pr.entity.Placement;

public interface ServiceLayer {
	
	public void addPlacement(Placement ct);

	public Placement updatePlacement(Placement ct);

	public Placement searchPlacement(int i);

	public int deletePlacement(int id);

}
