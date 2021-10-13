package com.example.demo.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Donar;
import com.example.demo.repository.DonarRepository;
import com.example.demo.service.DonarService;

@Service
public class DonarServiceImp implements DonarService{

	private DonarRepository repo;
	
	public DonarServiceImp(DonarRepository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public List<Donar> getAllDonars() {
		
		return repo.findAll();
	}


	@Override
	public Donar saveDonar(Donar donar) {
		
		return repo.save(donar);
	}


	@Override
	public Donar getDonarById(int donarid) {
		
		return repo.findById(donarid).get();
	}


	@Override
	public Donar updateDonar(Donar donar) {
		
		return repo.save(donar);
	}


	@Override
	public void deleteDonarByid(int donarid) {
		repo.deleteById(donarid);
		
	}

}
