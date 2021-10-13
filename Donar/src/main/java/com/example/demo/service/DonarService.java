package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Donar;

public interface DonarService {

	List<Donar> getAllDonars();
	Donar saveDonar(Donar donar);
	
	Donar getDonarById(int donarid);
	Donar updateDonar(Donar donar);
	
	void deleteDonarByid(int donarid);
}
