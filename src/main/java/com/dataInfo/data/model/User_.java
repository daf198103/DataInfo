package com.dataInfo.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="usuario_externo")
public class User_ implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(length=11, name="nu_cpf")
	@NotNull
	private String cpf;
	
	@Column(name="co_funcao")
	@NotNull
	private int function;
	
	@Column(name="no_usuario",length=60)
	@NotNull
	private String userName;
	
	@Column(name="de_email",length=250)
	@NotNull
	private String email;
	
	@Column(name="ic_situacao",length=1)
	@NotNull
	private String situation;
	
	@Column(name="ic_perfil_acesso")
	@NotNull
	private int accessProfile;
	
	@Column(name="nu_telefone",length=11)
	private String phone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getFunction() {
		return function;
	}

	public void setFunction(int function) {
		this.function = function;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int getAccessProfile() {
		return accessProfile;
	}

	public void setAccessProfile(int accessProfile) {
		this.accessProfile = accessProfile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accessProfile;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + function;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((situation == null) ? 0 : situation.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_ other = (User_) obj;
		if (accessProfile != other.accessProfile)
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (function != other.function)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (situation == null) {
			if (other.situation != null)
				return false;
		} else if (!situation.equals(other.situation))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
	
	
	
				
}
