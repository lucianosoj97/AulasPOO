package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract() {
	}

	public HourContract(Date date, Double valuePorHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePorHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePorHour() {
		return valuePerHour;
	}

	public void setValuePorHour(Double valuePorHour) {
		this.valuePerHour = valuePorHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
