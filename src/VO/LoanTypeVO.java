package VO;

import java.io.Serializable;

public class LoanTypeVO implements Serializable {

	
	private int  id;
	private  String loanType;
	private String loanDescription;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanDescription() {
		return loanDescription;
	}
	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}
	
	
	
	
}
