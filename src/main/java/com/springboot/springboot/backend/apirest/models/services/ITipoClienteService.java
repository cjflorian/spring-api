package com.springboot.springboot.backend.apirest.models.services;

import java.util.List;

import com.springboot.springboot.backend.apirest.models.entity.TipoCliente;

public interface ITipoClienteService {
	public List<TipoCliente> findAll();
	
	public TipoCliente findById(Long id);
		
	public TipoCliente save (TipoCliente cliente);
	
	public void delete(Long id);

}
