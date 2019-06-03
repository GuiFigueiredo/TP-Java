package Cadastro;

public class Cadastro {
	
	public static void main (String [] args) {
		
		Cadastro cad = new Cadastro("davi baitola","davi@baitola","baitoladavi","123davi baitola");
		
		System.out.println("essas são as informaçõe de "+(cad.nome));
		
		System.out.println("nome: "+cad.nome);
		System.out.println("email: "+cad.email);
		System.out.println("login: "+cad.login);
		System.out.println("senha: "+cad.senha);
		
		
	}
		

		private String nome;
		private String email;
		private String login;
		private String senha;
		
	

		
		
		
	
	public Cadastro(String nome, String email, String login, String senha) {
		
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		
	
	}
	
	public String getNome() {
	return nome;
}
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
