package com.ok.dto;

public class PatientDTO {
	private String PatientName;
	private String PatientAddress;
	private long PatientContactNo;
	private int HospitablizedDays;
	private double BillPerDay;
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
		return "PatientDTO [PatientName=" + PatientName + ", PatientAddress=" + PatientAddress + ", PatientContactNo="
				+ PatientContactNo + ", HospitablizedDays=" + HospitablizedDays + ", BillPerDay=" + BillPerDay + "]";
	}
	

}
