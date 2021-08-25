package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.exception.DataException;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import com.nt.entity.Patient;
import com.nt.service.IPatientMgmtService;
import com.nt.service.PatientMgmtServiceImpl;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IPatientMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=======================Insert operation=====================================");
		
		  try { Iterable<Patient> listVaccines=service.registerInBatch(List.of(new
		  Patient("Suraj","delhi","suraj123@gmail.com",9212922929l, 233d), new
		  Patient("Mohan","delhi","mohan123@gmail.com",9212933929l, 234d), new
		  Patient("Komal","pune","komalraj3@gmail.com",9212223929l, 2322d),
		  
		  new Patient("Raju","patna","ysc123@gmail.com",9212222929l, 234d), new
		  Patient("Rashmi","kolkata","rashmis23@gmail.com",9211122929l, 343d))); }
		  catch(DataException dae){ dae.printStackTrace(); } catch(Exception e) {
		  e.printStackTrace(); }
		 
		

		
		  System.out.println("------------find all------------");
		  
		  try { Iterable<Patient>itList=service.fetchAllDetails();
		  itList.forEach(patient->{System.out.println(patient);}); }
		  catch(DataException dae){ dae.printStackTrace(); }
		 

		
		  System.out.println("------------Remove------------"); try {
		  System.out.println(service.removeRecordById(101)); } catch(DataException
		  dae){ dae.printStackTrace(); }
		 
		  
		System.out.println("=======================Update operation=========================");
			try
			{
				Patient patient=new Patient(103,"sohan","Bangulru","sohan43@gmail.com",9122343222l,1052d);
				System.out.println(service.registerRecord(patient));
			}
		
		catch(Exception e)
			{
				 e.printStackTrace();
				 }
}
	}

