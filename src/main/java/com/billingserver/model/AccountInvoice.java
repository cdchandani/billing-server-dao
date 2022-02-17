package com.billingserver.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the account_invoice database table.
 * 
 */
@Entity
@Table(name="account_invoice")
@NamedQuery(name="AccountInvoice.findAll", query="SELECT a FROM AccountInvoice a")
public class AccountInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="active_users_count")
	private Integer activeUsersCount;

	@Column(name="bill_period")
	private String billPeriod;

	@Column(name="bill_plan")
	private String billPlan;

	@Column(name="current_charges")
	private double currentCharges;

	@Column(name="domain_name")
	private String domainName;

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

	public AccountInvoice() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActiveUsersCount() {
		return this.activeUsersCount;
	}

	public void setActiveUsersCount(Integer activeUsersCount) {
		this.activeUsersCount = activeUsersCount;
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
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

}