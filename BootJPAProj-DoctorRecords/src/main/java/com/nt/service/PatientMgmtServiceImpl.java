package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Patient;
import com.nt.repo.IPatientRepo;

@Service("patientMgmtService")
public  class PatientMgmtServiceImpl implements IPatientMgmtService {
	@Autowired
	private IPatientRepo patientRepo;

	@Override
	public Iterable<Patient> registerInBatch(Iterable<Patient> patients) {
		if (patientRepo != null)
			return patientRepo.saveAll(patients);
		else
			throw new IllegalArgumentException("batch insertion not done");
	}

	
	  @Override public String registerRecord(Patient patient) {
	  System.out.println("InMemory Proxy class name ::"+patientRepo.getClass());
	  //use repo
	  Patient savedRecord=null; if(patient!=null)
	  savedRecord=patientRepo.save(patient); return
	  savedRecord!=null?"patient record registred/updated successfully with "
	  +savedRecord.getPid():" patient record registration/updation failed"; }
	 
	
	  public Iterable<Patient>fetchAllDetails(){ 
		  return patientRepo.findAll();
		  }
	  
	  @Override public Integer removeRecordById(int pid) {
		 
	  
	  Optional<Patient>opt=patientRepo.findById(pid); if(opt.isPresent()){
	  patientRepo.deleteById(pid); return +pid;
	  } else return 0; 
	  }


	
	 

}
