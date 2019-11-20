package cz.zonky.marketplace.loan.component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cz.zonky.marketplace.loan.cache.DataCache;
import cz.zonky.marketplace.loan.entity.LoanDetail;

/**
 * Implementation Marketplace loans getter.
 * 
 * @author Daniel Ficek
 */
@Controller
public class LoanGetterController implements LoanGetter {

	private static final Logger LOGGER = Logger.getLogger(LoanGetterController.class);
	
	private static final String URL_SOURCE = "https://api.zonky.cz/loans/marketplace";
	
	@Override
	public void checkLoans() {
		// Read data
        List<LoanDetail> jsonLoanList = getLoansFromMarketplace();
        
        // Log only new loans - use in-memory cache
        jsonLoanList.stream().forEach(loan -> {
        	if (DataCache.getInstanceOf().getLoans().indexOf(loan.getId()) < 0) {
        		DataCache.getInstanceOf().getLoans().add(loan.getId());
        		LoanGetterController.LOGGER.warn("New Loan: " + printLoan(loan));
        	}
        });
	}
	
	public List<LoanDetail> getLoansFromMarketplace() {
		String rawData = readDataFromUrl();
        Gson gson = new GsonBuilder().setLenient().create();
        List<LoanDetail> jsonLoanList = Arrays.asList(gson.fromJson(rawData, LoanDetail[].class));
        
        return jsonLoanList;
	}
	
	private String readDataFromUrl() {
        InputStream inputStream = null;
        try {
            inputStream = new URL(URL_SOURCE).openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            StringBuilder buffer = new StringBuilder();
            int readChar;
            while ((readChar = bufferedReader.read()) != -1) {
                buffer.append((char) readChar);
            }

            return buffer.toString();
        } catch (IOException ex) {
        	LoanGetterController.LOGGER.error("Cannot read data from URL " + URL_SOURCE, ex);
        	return "";
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                	LoanGetterController.LOGGER.error("Fatal exception: Cannot close stream to the source URL: " + ex.getMessage(), ex);
                }
            }
        }
    }
	
	private String printLoan(LoanDetail loan) {
		StringBuffer sb = new StringBuffer();

		sb.append("{");
		
		// id
		sb.append("id: ");
		sb.append(loan.getId().intValue());
		sb.append(" ");
		
		// purpose
		sb.append("purpose: ");
		sb.append(loan.getPurpose().name());
		sb.append(" ");
		
		// name
		sb.append("name: '");
		sb.append(loan.getName());
		sb.append("' ");
		
		// amount
		sb.append("amount: ");
		sb.append(loan.getAmount().doubleValue());
		sb.append(" ");
		
		// remainingInvestment
		sb.append("remainingInvestment: ");
		sb.append(loan.getRemainingInvestment().doubleValue());
		sb.append(" ");
		
		// revenueRate
		sb.append("revenueRate: ");
		sb.append(loan.getRevenueRate().doubleValue());
		sb.append(" ");
		
		// termInMonths
		sb.append("termInMonths: ");
		sb.append(loan.getTermInMonths().intValue());
		sb.append("");
		
		sb.append("}");
		
		return sb.toString();
	}

}
