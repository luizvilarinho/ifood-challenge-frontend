package br.fiap.challenge.model;

import java.io.Serializable;
import java.util.Date;

public class LojaModel implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int Id;
	private String Nome;
	private int RaioEntrega;
	private int AtendeVegano;
	private int Status;
	private int EnderecoId;
	private int OrganizacaoId;
	private Date DataCadastro;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getRaioEntrega() {
		return RaioEntrega;
	}

	public void setRaioEntrega(int raioEntrega) {
		RaioEntrega = raioEntrega;
	}

	public int getAtendeVegano() {
		return AtendeVegano;
	}

	public void setAtendeVegano(int atendeVegano) {
		AtendeVegano = atendeVegano;
	}

	public int getEnderecoId() {
		return EnderecoId;
	}

	public void setEnderecoId(int enderecoId) {
		EnderecoId = enderecoId;
	}

	public int getOrganizacaoId() {
		return OrganizacaoId;
	}

	public void setOrganizacaoId(int organizacaoId) {
		OrganizacaoId = organizacaoId;
	}

	public Date getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		DataCadastro = dataCadastro;
	}

	
	public LojaModel() {
		super();
		
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		Status = status;
	}
	
	

}
