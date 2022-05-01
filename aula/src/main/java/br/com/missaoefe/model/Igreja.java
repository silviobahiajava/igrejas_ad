package br.com.missaoefe.model;

//br.com.missaoefe.model.Cliente


import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.hibernate.hql.spi.id.cte.AbstractCteValuesListBulkIdHandler;

import br.com.missaoefe.enums.*;

@Entity
@Table(name="igreja")
public class Igreja extends GenericDomain{
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private String cnpj;
	private String email;
	private String razaoSocial;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@OneToOne
	private Usuario usuarioPrincipal;
	
	@OneToMany
 private List<Usuario>usuarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario getUsuarioPrincipal() {
		return usuarioPrincipal;
	}

	public void setUsuarioPrincipal(Usuario usuarioPrincipal) {
		this.usuarioPrincipal = usuarioPrincipal;
	}
	
	
	
}
