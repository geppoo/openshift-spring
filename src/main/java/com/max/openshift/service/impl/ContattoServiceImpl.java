package com.max.openshift.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.openshift.model.Contatto;
import com.max.openshift.repository.ContattoRepository;
import com.max.openshift.service.ContattoService;

@Service("contattoService")
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	private ContattoRepository contattoRep;

	@Override
	public void saveContatto(Contatto contatto) {
		contattoRep.save(contatto);
	}

	@Override
	public List<Contatto> getAll() {
		return contattoRep.findAll();
	}

	@Override
	public Optional<Contatto> findById(long id) {
		return contattoRep.findById(id);
	}

	@Override
	public void deleteContatto(long id) {
		contattoRep.deleteById(id);
	}

	@Override
	public List<Contatto> findByUsername(String username) {
		return contattoRep.findByUsername(username);
	}

	@Override
	public Long conteggioContatti() {
		return contattoRep.conteggioContatti();
	}
}