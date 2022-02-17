package com.billingserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the user_invoice database table.
 * 
 */
@Entity
@Table(name="user_invoice")
@NamedQuery(name="UserInvoice.findAll", query="SELECT u FROM UserInvoice u")
public class UserInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bill_period")
	private String billPeriod;

	@Column(name="bill_plan")
	private String billPlan;

	@Column(name="current_charges")
	private double currentCharges;

	@Column(name="due_date")
	private Timestamp dueDate;

	@Temporal(TemporalType.DATE)
	@Column(name="invoice_date")
	private Date invoiceDate;

	@Column(name="late_charges")
	private double lateCharges;

	@Column(name="minutes_consumed")
	private Long minutesConsumed;

	@Column(name="minutes_consumption_cost")
	private double minutesConsumptionCost;

	@Column(name="outbound_usage")
	private Integer outboundUsage;

	@Column(name="outbound_usage_cost")
	private double outboundUsageCost;

	@Column(name="previous_balance")
	private double previousBalance;

	private double tax;

	@Column(name="tax_amount")
	private double taxAmount;

	@Column(name="total_payable")
	private double totalPayable;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserInvoice() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillPeriod() {
		return this.billPeriod;
	}

	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
	}

	public String getBillPlan() {
		return this.billPlan;
	}

	public void setBillPlan(String billPlan) {
		this.billPlan = billPlan;
	}

	public double getCurrentCharges() {
		return this.currentCharges;
	}

	public void setCurrentCharges(double currentCharges) {
		this.currentCharges = currentCharges;
	}

	public Timestamp getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getLateCharges() {
		return this.lateCharges;
	}

	public void setLateCharges(double lateCharges) {
		this.lateCharges = lateCharges;
	}

	public Long getMinutesConsumed() {
		return this.minutesConsumed;
	}

	public void setMinutesConsumed(Long minutesConsumed) {
		this.minutesConsumed = minutesConsumed;
	}

	public double getMinutesConsumptionCost() {
		return this.minutesConsumptionCost;
	}

	public void setMinutesConsumptionCost(double minutesConsumptionCost) {
		this.minutesConsumptionCost = minutesConsumptionCost;
	}

	public Integer getOutboundUsage() {
		return this.outboundUsage;
	}

	public void setOutboundUsage(Integer outboundUsage) {
		this.outboundUsage = outboundUsage;
	}

	public double getOutboundUsageCost() {
		return this.outboundUsageCost;
	}

	public void setOutboundUsageCost(double outboundUsageCost) {
		this.outboundUsageCost = outboundUsageCost;
	}

	public double getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(double previousBalance) {
		this.previousBalance = previousBalance;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getTotalPayable() {
		return this.totalPayable;
	}

	public void setTotalPayable(double totalPayable) {
		this.totalPayable = totalPayable;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}