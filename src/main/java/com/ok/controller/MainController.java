package com.ok.controller;

import com.ok.dto.PatientDTO;
import com.ok.service.IPatientMgmtService;
import com.ok.vo.PatientVO;

public final class MainController {
	private IPatientMgmtService service;
	public MainController(IPatientMgmtService service) {
		this.service=service;
	}
	public String processPatient(PatientVO vo) throws Exception {
		PatientDTO dto=new PatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddress(vo.getPatientAddress());
		dto.setPatientContactNo(vo.getPatientContactNo());
		dto.setHospitablizedDays(vo.getHospitablizedDays());
		dto.setBillPerDay(vo.getBillPerDay());
		String result=service.calculateBill(dto);
		return result;
	}
}
