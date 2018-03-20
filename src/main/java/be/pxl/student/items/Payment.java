package be.pxl.student.items;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {

	private static final long serialVersionUID = 904724557923740887L;
	
	private int id;
	private Date date;
	private float amount;
	private String currency;
	private String detail;
	private int accountId;
	private int counterAccountId;
	private int labelId;
	
	public Payment(int id, Date date, float amount, String currency, String detail, int accountId, int counterAccountId,
			int labelId) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.currency = currency;
		this.detail = detail;
		this.accountId = accountId;
		this.counterAccountId = counterAccountId;
		this.labelId = labelId;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCounterAccountId() {
		return counterAccountId;
	}

	public void setCounterAccountId(int counterAccountId) {
		this.counterAccountId = counterAccountId;
	}

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String toString() {
		return String.format("Payment [id=%s, date=%s, amount=%s, currency=%s, detail=%s, accountId=%s, counterAccountId=%s, labelId=%s",
							 id, date, amount, currency, detail, accountId, counterAccountId, labelId);
	}
}