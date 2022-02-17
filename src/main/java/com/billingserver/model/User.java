package com.billingserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bill_plan")
	private String billPlan;

	private String discount;

	private String domain;

	@Column(name="instances_created")
	private Integer instancesCreated;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_eligible")
	private Boolean isEligible;

	private String locale;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_type")
	private String userType;

	//bi-directional many-to-one association to BillingHistory
	@OneToMany(mappedBy="user")
	private List<BillingHistory> billingHistories;

	//bi-directional many-to-one association to UserInvoice
	@OneToMany(mappedBy="user")
	private List<UserInvoice> userInvoices;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillPlan() {
		return this.billPlan;
	}

	public void setBillPlan(String billPlan) {
		this.billPlan = billPlan;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Integer getInstancesCreated() {
		return this.instancesCreated;
	}

	public void setInstancesCreated(Integer instancesCreated) {
		this.instancesCreated = instancesCreated;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsEligible() {
		return this.isEligible;
	}

	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<BillingHistory> getBillingHistories() {
		return this.billingHistories;
	}

	public void setBillingHistories(List<BillingHistory> billingHistories) {
		this.billingHistories = billingHistories;
	}

	public BillingHistory addBillingHistory(BillingHistory billingHistory) {
		getBillingHistories().add(billingHistory);
		billingHistory.setUser(this);

		return billingHistory;
	}

	public BillingHistory removeBillingHistory(BillingHistory billingHistory) {
		getBillingHistories().remove(billingHistory);
		billingHistory.setUser(null);

		return billingHistory;
	}

	public List<UserInvoice> getUserInvoices() {
		return this.userInvoices;
	}

	public void setUserInvoices(List<UserInvoice> userInvoices) {
		this.userInvoices = userInvoices;
	}

	public UserInvoice addUserInvoice(UserInvoice userInvoice) {
		getUserInvoices().add(userInvoice);
		userInvoice.setUser(this);

		return userInvoice;
	}

	public UserInvoice removeUserInvoice(UserInvoice userInvoice) {
		getUserInvoices().remove(userInvoice);
		userInvoice.setUser(null);

		return userInvoice;
	}

}