package br.com.unifacef.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CLIENTE")
public class ClienteEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="cpf_cpnj")
	private String cpf_cpnj;
	@Column(name="email")
	private String email;
	@Column(name="nRua")
	private int nRua;
	@Column(name="cep")
	private String cep;
	@Column(name="dt_nascimento")
	private Date dt_nascimento;
	
	public ClienteEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cpnj() {
		return cpf_cpnj;
	}

	public void setCpf_cpnj(String cpf_cpnj) {
		this.cpf_cpnj = cpf_cpnj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getnRua() {
		return nRua;
	}

	public void setnRua(int nRua) {
		this.nRua = nRua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	@Override
	public String toString() {
		return "ClienteEntity [id=" + id + ", nome=" + nome + ", cpf_cpnj=" + cpf_cpnj + ", email=" + email + ", nRua="
				+ nRua + ", cep=" + cep + ", dt_nascimento=" + dt_nascimento + "]";
	}

	
}
