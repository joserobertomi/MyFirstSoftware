package application;

import conexaopostgree.Conexao;

public class Program {

	private static Conexao conectar = null;
	
	public static void main(String[] args) {
		
		
		try{

			//servidor, banco de dados, usuario, senha
			conectar = new Conexao();

			//Aqui pode vir o uso da conex�o para executar comando DDL ou DML


			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());

		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			if(conectar != null)
				conectar.fecharConexao();
		}
	}

}