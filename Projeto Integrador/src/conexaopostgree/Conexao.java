package conexaopostgree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String driver = "org.postgresql.Driver";
	private String user = "user080";
	private String senha = "password";
	private String url = "jdbc:postgresql://localhost:5432/projeto";
	private Connection con = null;

	public Conexao() {
		try
		{
			Class.forName(driver);
			this.con = (Connection) DriverManager.getConnection(url, user, senha);
			System.out.println("Conex�o realizada com sucesso.");
		}
		catch (ClassNotFoundException ex)
		{
			System.err.print(ex.getMessage());
		} 
		catch (SQLException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	public Connection getConexao(){
		return this.con;
	}

	public void fecharConexao(){
		try{
			if(con != null)
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
