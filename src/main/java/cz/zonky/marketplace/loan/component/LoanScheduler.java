package cz.zonky.marketplace.loan.component;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cz.zonky.marketplace.loan.component.LoanGetter;

/**
 * The Scheduler.
 * 
 * @author Daniel Ficek
 */
@Component
public class LoanScheduler {

	private static final Logger LOGGER = Logger.getLogger(LoanScheduler.class);
	
	@Autowired
	private LoanGetter loanGetter;
	
	@Scheduled(initialDelay = 30000, fixedDelay = 300000)
	public void LoanCheck() {
		LoanScheduler.LOGGER.info("The scheduled task Zonky.Loan.Check started");
    
		loanGetter.checkLoans();
		
		LoanScheduler.LOGGER.info("The scheduled task Zonky.Loan.Check finished");
	}
	
}
