package com.springboot.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.springboot.backend.apirest.models.dao.ITipoClienteDao;
import com.springboot.springboot.backend.apirest.models.entity.TipoCliente;

@Service
public class TipoClienteServiceImpl implements ITipoClienteService {
	@Autowired
	private ITipoClienteDao TipoClienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<TipoCliente> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoCliente>) TipoClienteDao.findAll();
	}
	@Override
	@Transactional
	public TipoCliente findById(Long id) {
		// TODO Auto-generated method stub
		return TipoClienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public TipoCliente save(TipoCliente tipocliente) {
		// TODO Auto-generated method stub
		return TipoClienteDao.save(tipocliente);
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		TipoClienteDao.deleteById(id);
	}
}
