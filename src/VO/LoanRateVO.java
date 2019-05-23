package VO;

import java.io.Serializable;

public class LoanRateVO implements Serializable {

	private int id;
	private int loanRate;
	private String loanRateDescription;
	private LoanTypeVO loanType;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(int loanRate) {
		this.loanRate = loanRate;
	}
	public String getLoanRateDescription() {
		return loanRateDescription;
	}
	public void setLoanRateDescription(String loanRateDescription) {
		this.loanRateDescription = loanRateDescription;
	}
	public LoanTypeVO getLoanType() {
		return loanType;
	}
	public void setLoanType(LoanTypeVO loanType) {
		this.loanType = loanType;
	}
	
	
}
