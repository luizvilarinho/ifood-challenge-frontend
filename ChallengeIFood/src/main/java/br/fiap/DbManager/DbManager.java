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
				System.err.println("Lib não encontrada");
				e.printStackTrace();
			}
			
			
			String stringConnection = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String usuario = "JavaUser";
			String senha = "JavaUser123";
			
			
			conexao = DriverManager.getConnection(stringConnection,usuario,senha);
		}
		catch(SQLException e)
		{
			System.err.println("Erro de conexão");
			e.printStackTrace();
		}
		
		return conexao;
	}

}
