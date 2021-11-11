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
			
			String usuario = "RM88794";
			String senha = "070889";
			
			String connString="jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

			
			conexao = DriverManager.getConnection(connString,usuario,senha);
			if(conexao == null)
			{
				System.out.println("conexao nula");
			}
			else
			{
				System.out.println("conexão feita");
			}

		}
		catch(SQLException e)
		{
			System.err.println("Erro de conexão");
			e.printStackTrace();
		}
		
		return conexao;
	}

}
