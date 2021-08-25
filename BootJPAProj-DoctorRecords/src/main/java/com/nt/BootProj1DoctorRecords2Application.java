package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.Patient;
import com.nt.service.IPatientMgmtService;

@SpringBootApplication
public class BootProj1DoctorRecords2Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(BootProj1DoctorRecords2Application.class, args);	
		((ConfigurableApplicationContext) ctx).close();
	}

}