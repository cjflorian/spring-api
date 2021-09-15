package com.springboot.springboot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.springboot.backend.apirest.models.entity.TipoCliente;
import com.springboot.springboot.backend.apirest.models.services.IClienteService;
import com.springboot.springboot.backend.apirest.models.services.ITipoClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TipoClienteRestController {

	@Autowired
	private ITipoClienteService tipoClienteService;
	
	@GetMapping("/tipoclientes")
	public List<TipoCliente> index(){
		return tipoClienteService.findAll();
	}
	
	@GetMapping("/tipoclientes/{id}")
	public TipoCliente show(@PathVariable Long id) {
		return tipoClienteService.findById(id);
	}
	
		
	@PostMapping("/tipoclientes")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoCliente create(@RequestBody TipoCliente tipocliente) {
		return tipoClienteService.save(tipocliente);
	}
	
	@PutMapping("/tipoclientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoCliente update(@RequestBody TipoCliente tipocliente, @PathVariable Long id) {
		TipoCliente tipoclienteActual = tipoClienteService.findById(id);
		
		tipoclienteActual.setNombre(tipocliente.getNombre());
		tipoclienteActual.setDescripcion(tipocliente.getDescripcion());
		
		return tipoClienteService.save(tipoclienteActual);
	}
	
	@DeleteMapping("/tipoclientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoClienteService.delete(id);
	}
}
