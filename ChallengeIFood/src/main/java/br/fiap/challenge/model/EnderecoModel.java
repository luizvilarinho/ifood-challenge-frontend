package br.fiap.challenge.model;

import java.io.Serializable;

public class EnderecoModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Logradouro;
	private String Bairro;
	private String Numero;
	private String Complemento;
	private String Cidade;
	private String Uf;
	private String Pais;
	private String CEP;
	
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getUf() {
		return Uf;
	}
	public void setUf(String uf) {
		Uf = uf;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	/**
	 * @return the cEP
	 */
	public String getCEP() {
		return CEP;
	}
	/**
	 * @param cEP the cEP to set
	 */
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	

}
