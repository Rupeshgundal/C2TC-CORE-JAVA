package tnsif.c2tc.pr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.pr.Service.ServiceLayer;
import tnsif.c2tc.pr.entity.Placement;

@RestController
public class PlacementController {
	@Autowired
	ServiceLayer service;
	
	@PostMapping("/addPlacement")
	public void addPlacement(@RequestBody Placement p)
	{
		service.addPlacement(p);
	}

	@GetMapping("/searchPlacement/{id}")
	public Placement searchPlacement(@PathVariable int id)
	{
		return service.searchPlacement(id);
	}
	
	@PutMapping("/updatePlacement")
	public Placement updatePlacement(@RequestBody Placement ct)
	{
		return service.updatePlacement(ct);
	}
	
	@DeleteMapping("/deletePlacement/{id}")
	public int deletePlacement(@PathVariable int id)
	{
		return deletePlacement(id);
		
	}
}
