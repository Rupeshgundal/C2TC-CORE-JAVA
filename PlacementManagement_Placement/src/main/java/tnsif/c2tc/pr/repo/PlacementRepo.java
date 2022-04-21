package tnsif.c2tc.pr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tnsif.c2tc.pr.entity.Placement;

public interface PlacementRepo extends 
					//CrudRepository<Placement, Integer>{
	
	JpaRepository<Placement, Integer>{
		

}
