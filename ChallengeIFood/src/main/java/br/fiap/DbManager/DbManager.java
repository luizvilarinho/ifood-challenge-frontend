package br.fiap.DbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbManager {
	
	private static DbManager instance;
	
	private DbManager () {};
	
	public static DbManager getInstance() {
		if(instance == null){
			instance = new DbManager();
		}
		return instance;
	}
	
	public static Connection obterConexao() {
		Connection conexao = null;
		
		try
		{
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				System.err.println("Lib n�o encontrada");
				e.printStackTrace();
			}
			
			
			String stringConnection = "sua string";
			String usuario = "seu user";
			String senha = "sua senha";
			
			
			conexao = DriverManager.getConnection(stringConnection,usuario,senha);
		}
		catch(SQLException e)
		{
			System.err.println("Erro de conex�o");
			e.printStackTrace();
		}
		
		return conexao;
	}

}