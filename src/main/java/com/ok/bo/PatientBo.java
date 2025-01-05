package com.ok.bo;

public class PatientBo {
	private String PatientName;
	private String PatientAddress;
	private long PatientContactNo;
	private int HospitablizedDays;
	private double BillPerDay;
	private double BillAmount;
	private double Discount;
	private double NetBillAmount;
	public double getBillAmount() {
		return BillAmount;
	}
	public void setBillAmount(double billAmount) {
		BillAmount = billAmount;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public double getNetBillAmount() {
		return NetBillAmount;
	}
	public void setNetBillAmount(double netBillAmount) {
		NetBillAmount = netBillAmount;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientAddress() {
		return PatientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		PatientAddress = patientAddress;
	}
	public long getPatientContactNo() {
		return PatientContactNo;
	}
	public void setPatientContactNo(long patientContactNo) {
		PatientContactNo = patientContactNo;
	}
	public int getHospitablizedDays() {
		return HospitablizedDays;
	}
	public void setHospitablizedDays(int hospitablizedDays) {
		HospitablizedDays = hospitablizedDays;
	}
	public double getBillPerDay() {
		return BillPerDay;
	}
	public void setBillPerDay(double billPerDay) {
		BillPerDay = billPerDay;
	}
	@Override
	public String toString() {
		return "PatientBo [PatientName=" + PatientName + ", PatientAddress=" + PatientAddress + ", PatientContactNo="
				+ PatientContactNo + ", HospitablizedDays=" + HospitablizedDays + ", BillPerDay=" + BillPerDay
				+ ", BillAmount=" + BillAmount + ", Discount=" + Discount + ", NetBillAmount=" + NetBillAmount + "]";
	}
}
