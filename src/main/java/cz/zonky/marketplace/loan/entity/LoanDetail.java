package cz.zonky.marketplace.loan.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * JSON Element with loan detail.
 *
 * @author Ficek Daniel
 */
public class LoanDetail {
	
    Integer id;
    String url;
    String name;
    LoanPurpose purpose;
    List<LoanPhoto> photos;
    String nickName;
    Integer termInMonths;
    BigDecimal interestRate;
    BigDecimal revenueRate;
    BigDecimal annuityWithInsurance;
    String rating;
    Boolean topped;
    BigDecimal amount;
    String countryOfOrigin;
    String currency;
    BigDecimal remainingInvestment;
    BigDecimal reservedAmount;
    BigDecimal investmentRate;
    Boolean covered;
    Date datePublished;
    Boolean published;
    Date deadline;
    Integer investmentsCount;
    Integer questionsCount;
    String region;
    String mainIncomeType; //?? enum ??
    Boolean insuranceActive;
    List<LoanHistory> insuranceHistory; // ?? Documentation vs. Real data
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LoanPurpose getPurpose() {
		return purpose;
	}
	public void setPurpose(LoanPurpose purpose) {
		this.purpose = purpose;
	}
	
	public List<LoanPhoto> getPhotos() {
		return photos;
	}
	public void setPhotos(List<LoanPhoto> photos) {
		this.photos = photos;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public Integer getTermInMonths() {
		return termInMonths;
	}
	public void setTermInMonths(Integer termInMonths) {
		this.termInMonths = termInMonths;
	}
	
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	
	public BigDecimal getRevenueRate() {
		return revenueRate;
	}
	public void setRevenueRate(BigDecimal revenueRate) {
		this.revenueRate = revenueRate;
	}
	
	public BigDecimal getAnnuityWithInsurance() {
		return annuityWithInsurance;
	}
	public void setAnnuityWithInsurance(BigDecimal annuityWithInsurance) {
		this.annuityWithInsurance = annuityWithInsurance;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public Boolean getTopped() {
		return topped;
	}
	public void setTopped(Boolean topped) {
		this.topped = topped;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public BigDecimal getRemainingInvestment() {
		return remainingInvestment;
	}
	public void setRemainingInvestment(BigDecimal remainingInvestment) {
		this.remainingInvestment = remainingInvestment;
	}
	
	public BigDecimal getReservedAmount() {
		return reservedAmount;
	}
	public void setReservedAmount(BigDecimal reservedAmount) {
		this.reservedAmount = reservedAmount;
	}
	
	public BigDecimal getInvestmentRate() {
		return investmentRate;
	}
	public void setInvestmentRate(BigDecimal investmentRate) {
		this.investmentRate = investmentRate;
	}
	
	public Boolean getCovered() {
		return covered;
	}
	public void setCovered(Boolean covered) {
		this.covered = covered;
	}
	
	public Date getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	
	public Boolean getPublished() {
		return published;
	}
	public void setPublished(Boolean published) {
		this.published = published;
	}
	
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public Integer getInvestmentsCount() {
		return investmentsCount;
	}
	public void setInvestmentsCount(Integer investmentsCount) {
		this.investmentsCount = investmentsCount;
	}
	
	public Integer getQuestionsCount() {
		return questionsCount;
	}
	public void setQuestionsCount(Integer questionsCount) {
		this.questionsCount = questionsCount;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getMainIncomeType() {
		return mainIncomeType;
	}
	public void setMainIncomeType(String mainIncomeType) {
		this.mainIncomeType = mainIncomeType;
	}
	
	public Boolean getInsuranceActive() {
		return insuranceActive;
	}
	public void setInsuranceActive(Boolean insuranceActive) {
		this.insuranceActive = insuranceActive;
	}
	
	public List<LoanHistory> getInsuranceHistory() {
		return insuranceHistory;
	}
	public void setInsuranceHistory(List<LoanHistory> insuranceHistory) {
		this.insuranceHistory = insuranceHistory;
	}
    
}
