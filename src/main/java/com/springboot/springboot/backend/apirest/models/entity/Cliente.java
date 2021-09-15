package com.springboot.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private Long tipo_cliente_id;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tipo_cliente_id", referencedColumnName = "id", columnDefinition = "int", insertable = false, updatable = false)
	private TipoCliente tipocliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public TipoCliente getTipocliente() {
		return tipocliente;
	}

	public void setTipocliente(TipoCliente tipocliente) {
		this.tipocliente = tipocliente;
	}

	public Long getTipo_cliente_id() {
		return tipo_cliente_id;
	}

	public void setTipo_cliente_id(Long tipo_cliente_id) {
		this.tipo_cliente_id = tipo_cliente_id;
	}

}
