package c2tc.project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import c2tc.project1.entity.placement;
import c2tc.project1.service.servicelayer;
import c2tc.project1.service.servicelayerimplementation;

public class client {

	public static void main(String[] args) throws ParseException {
		servicelayer service=new servicelayerimplementation();
		String date1="18/04/2022";
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date date01=format.parse(date1);
		placement p=new placement();
		//p.setId(100);
		//p.setName("Rupesh Gundal");
		//p.setCollege("ytiet");
		//p.setDate(date01);
		//p.setQualification("BE");
		
		//service.addplacement(p);
		//service.updateplacement(p);
		
		System.out.println(service.searchplacement(101));
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
