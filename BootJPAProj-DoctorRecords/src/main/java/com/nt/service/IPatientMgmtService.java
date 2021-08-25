package com.nt.service;

import java.util.List;

import com.nt.entity.Patient;

public interface IPatientMgmtService {
public   Iterable<Patient>  registerInBatch(Iterable<Patient>  patients);
public Iterable<Patient> fetchAllDetails();

public Integer removeRecordById(int pid);
public String registerRecord(Patient patient);

}