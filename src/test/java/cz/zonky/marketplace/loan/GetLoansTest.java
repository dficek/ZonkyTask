package cz.zonky.marketplace.loan;

import org.junit.Assert;
import org.junit.Test;

import cz.zonky.marketplace.loan.component.LoanGetterController;
import cz.zonky.marketplace.loan.entity.LoanDetail;

import java.util.List;

/**
 * JUnit test to get loans.
 *
 * @author Ficek Daniel
 */
public class GetLoansTest {

    @Test
    public void testReadDataFromUrl() {
    	LoanGetterController loanGetter = new LoanGetterController();

    	List<LoanDetail> data = loanGetter.getLoansFromMarketplace();
        Assert.assertTrue(data.size() > 0);
    }

}
