package cz.zonky.marketplace.loan.entity;

import java.util.Date;

/**
 * JSON Element with loan history.
 *
 * @author Ficek Daniel
 */
public class LoanHistory {
	
    Date policyPeriodFrom;
    Date policyPeriodTo;
    
	public Date getPolicyPeriodFrom() {
		return policyPeriodFrom;
	}
	public void setPolicyPeriodFrom(Date policyPeriodFrom) {
		this.policyPeriodFrom = policyPeriodFrom;
	}
	
	public Date getPolicyPeriodTo() {
		return policyPeriodTo;
	}
	public void setPolicyPeriodTo(Date policyPeriodTo) {
		this.policyPeriodTo = policyPeriodTo;
	}
    
}
