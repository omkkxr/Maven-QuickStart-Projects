package com.ok.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ok.bo.PatientBo;

public class PatientDAOImpl implements IPatientDAO {
	private DataSource ds;
	private final String INSERT_QUERY = "INSERT INTO CORONA_PATIENT VALUES(PATIENT_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";

	public PatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(PatientBo bo) throws Exception {
		Connection con=null;
		int count=0;
		PreparedStatement ps=null;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1,bo.getPatientName());
			ps.setString(2,bo.getPatientAddress());
			ps.setLong(3,bo.getPatientContactNo());
			ps.setInt(4, bo.getHospitablizedDays());
			ps.setDouble(5, bo.getBillPerDay());
			ps.setDouble(6, bo.getBillAmount());
			ps.setDouble(7, bo.getDiscount());
			ps.setDouble(8,bo.getNetBillAmount());
			count=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}	
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if(ps!=null) {
					ps.close();
				}	
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
		}
		return count;	
	}

}
