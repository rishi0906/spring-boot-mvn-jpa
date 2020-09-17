package com.dating.test.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mswipe_customers")
public class SampleModelClass {


	@Id
	@GeneratedValue
	@Column(name = "mswipe_customer_id", unique = true, nullable = false)
	private Long mswipeCustomerId;

	@Column(name="customer_id", nullable = false)
	private Long customerId;

	@Column(name="is_processed")
	private Boolean isProcessed;

	@Column(name = "request_payload")
	private String requestPayload;

	@Column(name = "response_payload")
	private String responsePayload;

	@Column(name = "card_status")
	private Boolean cardStatus;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "lead_no")
	private String leadNo;
	
	@Column(name = "mswipe_initial_created_balance")
	private BigDecimal mswipeInitialCreatedBalance;
	
	@Column(name = "prospect_no")
	private String prospectNo;
	
	@Column(name="is_success")
	private Boolean isSuccess;
	
	@Column(name = "mobile_no")
	private Long mobileNo;
	
	@Column(name = "password")
	private Long password;
	
	@Column(name = "created_by")
	private Long createdBy;
	
	@Column(name = "updated_by")
	private Long updatedBy;
	
	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "updated_date")
	private Timestamp updatedDate;
	
	@Column(name = "mswipe_loantype_id")
	private String mSwipeLoanTypeId;

	public Long getMswipeCustomerId() {
		return mswipeCustomerId;
	}

	public void setMswipeCustomerId(Long mswipeCustomerId) {
		this.mswipeCustomerId = mswipeCustomerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Boolean getIsProcessed() {
		return isProcessed;
	}

	public void setIsProcessed(Boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public String getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(String requestPayload) {
		this.requestPayload = requestPayload;
	}

	public String getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(String responsePayload) {
		this.responsePayload = responsePayload;
	}

	public Boolean getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(Boolean cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}

	public BigDecimal getMswipeInitialCreatedBalance() {
		return mswipeInitialCreatedBalance;
	}

	public void setMswipeInitialCreatedBalance(BigDecimal mswipeInitialCreatedBalance) {
		this.mswipeInitialCreatedBalance = mswipeInitialCreatedBalance;
	}

	public String getProspectNo() {
		return prospectNo;
	}

	public void setProspectNo(String prospectNo) {
		this.prospectNo = prospectNo;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getmSwipeLoanTypeId() {
		return mSwipeLoanTypeId;
	}

	public void setmSwipeLoanTypeId(String mSwipeLoanTypeId) {
		this.mSwipeLoanTypeId = mSwipeLoanTypeId;
	}
	
	

}
