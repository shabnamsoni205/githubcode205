package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Patient;

public interface IPatientRepo extends CrudRepository<Patient, Integer> {

}
