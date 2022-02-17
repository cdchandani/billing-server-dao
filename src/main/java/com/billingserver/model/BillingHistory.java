package com.billingserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the billing_history database table.
 * 
 */
@Entity
@Table(name="billing_history")
@NamedQuery(name="BillingHistory.findAll", query="SELECT b FROM BillingHistory b")
public class BillingHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bill_amount")
	private double billAmount;

	@Column(name="bill_due_date")
	private Timestamp billDueDate;

	@Column(name="bill_paid_date")
	private Timestamp billPaidDate;

	@Column(name="bill_plan")
	private String billPlan;

	@Column(name="data_consumption")
	private Long dataConsumption;

	private Boolean discount;

	@Column(name="invoice_id")
	private Integer invoiceId;

	@Column(name="minutes_consumption")
	private Long minutesConsumption;

	@Column(name="pending_amount")
	private Boolean pendingAmount;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public BillingHistory() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public Timestamp getBillDueDate() {
		return this.billDueDate;
	}

	public void setBillDueDate(Timestamp billDueDate) {
		this.billDueDate = billDueDate;
	}

	public Timestamp getBillPaidDate() {
		return this.billPaidDate;
	}

	public void setBillPaidDate(Timestamp billPaidDate) {
		this.billPaidDate = billPaidDate;
	}

	public String getBillPlan() {
		return this.billPlan;
	}

	public void setBillPlan(String billPlan) {
		this.billPlan = billPlan;
	}

	public Long getDataConsumption() {
		return this.dataConsumption;
	}

	public void setDataConsumption(Long dataConsumption) {
		this.dataConsumption = dataConsumption;
	}

	public Boolean getDiscount() {
		return this.discount;
	}

	public void setDiscount(Boolean discount) {
		this.discount = discount;
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getMinutesConsumption() {
		return this.minutesConsumption;
	}

	public void setMinutesConsumption(Long minutesConsumption) {
		this.minutesConsumption = minutesConsumption;
	}

	public Boolean getPendingAmount() {
		return this.pendingAmount;
	}

	public void setPendingAmount(Boolean pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}