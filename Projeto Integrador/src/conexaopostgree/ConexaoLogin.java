package conexaopostgree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoLogin {
	
	private static Conexao conectar = null;
	
	public void fazerLogin(String id, String senha) {
		try {
			conectar = new Conexao();
			
			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			
			buscaDados(id, senha);
			
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			finally{
				if(conectar != null)
					conectar.fecharConexao();
			}
	}
	
	private static void buscaDados(String id, String senha) {
		
		Connection con = conectar.getConexao();
		
		String comandoBuscaIdESenha = "SELECT pk_id, senha, tipo_de_acesso FROM public.usuario WHERE pk_id = ? AND senha = ?;";
		
		try {
			ResultSet resultado = null;
			
			PreparedStatement stmBuscaIdESenha = con.prepareStatement(comandoBuscaIdESenha);
			
			stmBuscaIdESenha.setString(1, id);
			stmBuscaIdESenha.setString(2, senha);
			System.out.println(stmBuscaIdESenha.toString());
			resultado = stmBuscaIdESenha.executeQuery();
			
			resultado.next();
			System.out.println("Id do Usuario: " + resultado.getString(1) + ", senha: " + resultado.getString(2) + ", tipo de acesso: " + resultado.getString(3));
		}catch (SQLException e) {
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha transacao em Rollback!!!!");
					con.rollback();
				}catch(SQLException sqlE){
					sqlE.printStackTrace();
				}
			}

		}finally{
			if(con != null){
				try {
					con.setAutoCommit(true);
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				

			}

		}
	}
}