package com.ok.service;

import com.ok.dto.PatientDTO;

public interface IPatientMgmtService {
	public String calculateBill(PatientDTO dto) throws Exception;
}
