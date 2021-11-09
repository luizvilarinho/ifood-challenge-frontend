package br.fiap.DbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;


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
			
			String usuario = "System";
			String senha = "vida180100";
			
			String connString="jdbc:oracle:thin:@localhost:1521:xe";

			
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
