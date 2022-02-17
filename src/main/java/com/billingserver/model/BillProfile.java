package com.billingserver.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bill_profile database table.
 * 
 */
@Entity
@Table(name="bill_profile")
@NamedQuery(name="BillProfile.findAll", query="SELECT b FROM BillProfile b")
public class BillProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="plan_name")
	private String planName;

	@Column(name="bill_cycle")
	private String billCycle;

	@Column(name="data_rate")
	private double dataRate;

	@Column(name="free_minutes")
	private Integer freeMinutes;

	private Integer id;

	@Column(name="minute_rate")
	private double minuteRate;

	private String one;

	@Column(name="plan_charges")
	private Integer planCharges;

	@Column(name="user_count")
	private Integer userCount;

	public BillProfile() {
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getBillCycle() {
		return this.billCycle;
	}

	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

	public double getDataRate() {
		return this.dataRate;
	}

	public void setDataRate(double dataRate) {
		this.dataRate = dataRate;
	}

	public Integer getFreeMinutes() {
		return this.freeMinutes;
	}

	public void setFreeMinutes(Integer freeMinutes) {
		this.freeMinutes = freeMinutes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getMinuteRate() {
		return this.minuteRate;
	}

	public void setMinuteRate(double minuteRate) {
		this.minuteRate = minuteRate;
	}

	public String getOne() {
		return this.one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public Integer getPlanCharges() {
		return this.planCharges;
	}

	public void setPlanCharges(Integer planCharges) {
		this.planCharges = planCharges;
	}

	public Integer getUserCount() {
		return this.userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

}