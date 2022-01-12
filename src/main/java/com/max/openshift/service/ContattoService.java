package com.max.openshift.service;

import java.util.List;
import java.util.Optional;

import com.max.openshift.model.Contatto;

//elenco solo i meotodi
public interface ContattoService {

	void saveContatto(Contatto contatto);

	List<Contatto> getAll();

	Optional<Contatto> findById(long id);

	void deleteContatto(long id);

	List<Contatto> findByUsername(String username);

	Long conteggioContatti();

}