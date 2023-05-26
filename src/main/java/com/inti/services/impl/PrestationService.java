package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Prestation;
import com.inti.entities.Salon;
import com.inti.repositories.PrestationRepository;
import com.inti.services.interfaces.IPerstationService;
import com.inti.services.interfaces.ISalonService;

@Service
public class PrestationService implements IPerstationService{
	@Autowired
	PrestationRepository prestationRepository;

	@Override
	public List<Prestation> findAll() {
		// TODO Auto-generated method stub
		return prestationRepository.findAll();
	}

	@Override
	public Prestation findOne(Long id) {
		// TODO Auto-generated method stub
		return prestationRepository.findById(id).get();
	}

	@Override
	public Prestation save(Prestation prestation) {
		// TODO Auto-generated method stub
		return prestationRepository.save(prestation);
	}

	@Override
	public void delete(Long id) {
		prestationRepository.deleteById(id);
		
	}

	

}
