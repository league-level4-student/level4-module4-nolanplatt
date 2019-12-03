package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
			
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	
	void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	
	ArrayList<Doctor> getDoctors() {
		return this.doctors;
	}
	
	void addPatient(Patient pat) {
		patients.add(pat);
	}
	
	ArrayList<Patient> getPatients() {
		return this.patients;
	}
	
	
}
