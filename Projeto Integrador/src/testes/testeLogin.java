package testes;

import conexaopostgree.ConexaoLogin;
import entities.Usuario;

public class testeLogin {
	public static void main(String args[]) {
		
		ConexaoLogin login = new ConexaoLogin();
		String id = "ADMIN";
		String senha = "admin";
		
		Usuario usuario = login.fazerLogin(id);
		if(usuario == null) {
			System.out.println("Usuario não encontrado");
		}
		else if(!senha.equals(usuario.getSenha())) {
			System.out.println("Senha inválida!");
		} else {
			System.out.println("Id: " + usuario.getId() + ", Senha: " + usuario.getSenha() + ", Tipo de Acesso: "+  usuario.getTipoAcesso());
		}
		
		
	}
}
