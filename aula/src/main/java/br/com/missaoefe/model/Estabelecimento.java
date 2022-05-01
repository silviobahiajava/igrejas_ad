package br.com.missaoefe.model;

import javax.persistence.*;
@Entity
@Table(name="estabelecimento")
public class Estabelecimento extends GenericDomain{
private static final long serialVersionUID = 1L;

private String razaoSocial;
 private String nomeFantasia;
 private String endereco;
 private String email;
 private String senha;
 
 private String nomedaimagem;
public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
public String getNomeFantasia() {
	return nomeFantasia;
}
public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getNomedaimagem() {
	return nomedaimagem;
}
public void setNomedaimagem(String nomedaimagem) {
	this.nomedaimagem = nomedaimagem;
}

 
}
