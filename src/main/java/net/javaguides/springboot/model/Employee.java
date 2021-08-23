package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String FIRSTNAME;
	private String LASTNAME;
	private String EMAILID;
	
	public Employee() {
		
	}
	
	public Employee(String fIRSTNAME, String lASTNAME, String eMAILID) {
		super();
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		EMAILID = eMAILID;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public String getEMAILID() {
		return EMAILID;
	}
	public void setEMAILID(String eMAILID) {
		EMAILID = eMAILID;
	}
	
	
	
}
