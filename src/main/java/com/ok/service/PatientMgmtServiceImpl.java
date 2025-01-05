package com.ok.service;

import com.ok.bo.PatientBo;
import com.ok.dao.IPatientDAO;
import com.ok.dto.PatientDTO;

public class PatientMgmtServiceImpl implements IPatientMgmtService {
	private IPatientDAO dao;
	public PatientMgmtServiceImpl(IPatientDAO dao) {
		this.dao=dao;
	}
	@Override
	public String calculateBill(PatientDTO dto) throws Exception {
		double BillAmt=dto.getHospitablizedDays()*dto.getBillPerDay();
		double Discount=0.0d;
		double NetBill=0.0d;
		if(BillAmt>200000) {
			Discount=20;
			NetBill=BillAmt-(BillAmt* Discount /100);
		}else if(BillAmt>200000){
			Discount=10;
			NetBill=BillAmt-(BillAmt* Discount /100);	
		}else {
			NetBill=BillAmt;
		}
		PatientBo bo=new PatientBo();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddress(dto.getPatientAddress());
		bo.setPatientContactNo(dto.getPatientContactNo());
		bo.setHospitablizedDays(dto.getHospitablizedDays());
		bo.setBillPerDay(dto.getBillPerDay());
		bo.setBillAmount(BillAmt);
		bo.setDiscount(Discount);
		bo.setNetBillAmount(NetBill);
		int count=dao.insert(bo);
		if(count==1) {
			return "Patient Registered Successfully !\n"+bo.toString();
		}else {
			return "Internal Problem Patient not registerd "+"NetBill Amount "+NetBill;
		}
		
	}

}
