package br.fiap.challenge.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.fiap.DbManager.DbManager;
import br.fiap.challenge.model.LojaModel;

public class LojaDAO {
	
	PreparedStatement pstmt = null;
	private Connection conexao;
	
	public LojaDAO(Connection conexao)
	{
		if(conexao != null)
		{
			this.conexao = conexao;
			
		}
	}
	
	public LojaDAO()
	{
		if(conexao == null)
		{
			conexao = DbManager.obterConexao();
		}
	}
	
	public void IncluirLoja(LojaModel loja)
	{
		try
		{
			
			String query = "INSERT INTO tbLojas (Id ,Nome, RaioEntrega, Status, AtendeVegano, EnderecoId, DataCadastro, OrganizacaoId) "
					+ "VALUES (tbLojas.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conexao.prepareStatement(query);
			
			pstmt.setString(1, loja.getNome());
			pstmt.setInt(2, loja.getRaioEntrega());
			pstmt.setInt(3, loja.getStatus());
			pstmt.setInt(4, loja.getAtendeVegano());
			pstmt.setInt(5, loja.getEnderecoId());
			java.sql.Date sDate = new java.sql.Date(loja.getDataCadastro().getTime());
			pstmt.setDate(6, sDate);
			pstmt.setInt(7, loja.getOrganizacaoId());

			
			pstmt.execute();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void AlterarLoja(LojaModel loja)
	{
		try
		{
			
			String query = "update tbLojas set nome = ?, raioentrega = ?, status = ?, atendevegano = ? where id  = ?";
			
			
			pstmt = conexao.prepareStatement(query);
			
			pstmt.setString(1, loja.getNome());
			pstmt.setInt(2, loja.getRaioEntrega());
			pstmt.setInt(3, loja.getStatus());
			pstmt.setInt(4, loja.getAtendeVegano());
			pstmt.setInt(5, loja.getId());
			

			
			pstmt.execute();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public List<LojaModel> getLoja(int lojaId)
	{
		List<LojaModel> Lojas = new ArrayList<>();
		try
		{
			
			String query = "SELECT * FROM tbLojas WHERE Id = " + lojaId;
			
			pstmt = conexao.prepareStatement(query);
			
			ResultSet result = pstmt.executeQuery();
			

			while(result.next())	
			{
				LojaModel l = new LojaModel();
				l.setNome(result.getString("Nome"));
				l.setId(result.getInt("Id"));
				l.setAtendeVegano(result.getInt("AtendeVegano"));
				l.setOrganizacaoId(result.getInt("OrganizacaoId"));
				l.setRaioEntrega(result.getInt("RaioEntrega"));
				l.setStatus(result.getInt("Status"));
				l.setEnderecoId(result.getInt("EnderecoId"));
				l.setDataCadastro(result.getDate("DataCadastro"));
				Lojas.add(l);
			}
			
			return Lojas;
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
