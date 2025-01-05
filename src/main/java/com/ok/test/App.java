package com.ok.test;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ok.controller.MainController;
import com.ok.vo.PatientVO;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient name :");
		String name = sc.next();
		System.out.println("Enter patient address :");
		String addr = sc.next();
		System.out.println("Enter patient Contact no :");
		long phno = sc.nextLong();
		System.out.println("Enter no of days the patient was hospitalized  : ");
		int days = sc.nextInt();
		System.out.println("Enter per day charged : ");
		double perDay = sc.nextDouble();
		PatientVO vo = new PatientVO();
		vo.setBillPerDay(perDay);
		vo.setHospitablizedDays(days);
		vo.setPatientAddress(addr);
		vo.setPatientContactNo(phno);
		vo.setPatientName(name);
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Spring\\IOC-MiniProject-CoronaPatient\\src\\main\\java\\com\\ok\\config\\bean.xml");
		MainController main = context.getBean("MainController", MainController.class);
		try {
			String result = main.processPatient(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("~~~~~~~~Some error in Patient Registrastion");
			e.printStackTrace();
		}
		finally {
			try {
				if(context!=null) {
					context.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(sc!=null) {
					sc.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
