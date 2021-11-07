package br.fiap.challenge.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.fiap.DbManager.DbManager;
import br.fiap.challenge.model.EnderecoModel;

public class EnderecoDao {
	
	PreparedStatement pstmt = null;
	private Connection conexao;
	
	public EnderecoDao(Connection conexao)
	{
		if(conexao != null)
		{
			this.conexao = conexao;
			
		}
	}
	
	public EnderecoDao()
	{
		if(conexao == null)
		{
			conexao = DbManager.obterConexao();
		}
	}
	
	public void IncluirEndereco(EnderecoModel endereco)
	{
		try
		{
			String query = "INSERT INTO tbEndereco (Id ,Logradouro, Bairro, Numero, Complemento, Cidade, UF, Pais) "
					+ "VALUES (SEQ_PESO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conexao.prepareStatement(query);
			
			pstmt.setString(1, endereco.getLogradouro());
			pstmt.setString(2, endereco.getBairro());
			pstmt.setString(3, endereco.getNumero());
			pstmt.setString(4, endereco.getComplemento());
			pstmt.setString(5, endereco.getCidade());
			pstmt.setString(6, endereco.getUf());
			pstmt.setString(7, endereco.getPais());
			
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
	
	
	
	
	public List<EnderecoModel> getEndereco()
	{
		List<EnderecoModel> Enderecos = new ArrayList<>();
		try
		{
			
			String query = "SELECT * FROM tbEndereco";
			
			pstmt = conexao.prepareStatement(query);
			
			ResultSet result = pstmt.executeQuery();
			

			while(result.next())	
			{
				EnderecoModel e = new EnderecoModel();
				e.setCidade(result.getString("Cidade"));
				e.setBairro(result.getString("Bairro"));
				e.setPais(result.getString("Pais"));
				e.setNumero(result.getString("Numero"));
				e.setLogradouro(result.getString("Logradouro"));
				e.setCEP(result.getString("CEP"));
				e.setComplemento(result.getString("Complemento"));
				
				Enderecos.add(e);
			}
			
			return Enderecos;
			
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
