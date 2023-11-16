package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, email, nacionalidade;
	private ArrayList<String>postagens;
	private int quantidadeDePostagens; 
	private int pontuacao;

	
	public Usuario(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.quantidadeDePostagens = 0;
		this.pontuacao =0;
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
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public Usuario (ArrayList<String>postagens) {
	postagens = new ArrayList<String>();
	}
	
	public void adicionaPostagens(String postagem) {
		this.postagens.add(postagem);
		this.quantidadeDePostagens ++;
		
	}
	
	public void alterarPontuacao(int delta) {
		this.pontuacao = this.pontuacao + delta;
		if(this.pontuacao <= 0) 
		{
			this.pontuacao = 0;
			
		}else {}
	}
	
	
	
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Digite um nome: "); 
		String Nome = sc.nextLine();
		
		System.out.println("Digite um email: "); 
		String Email = sc.nextLine();
		
		System.out.println("Digite uma nacionalidade: "); 
		String Nacionalidade = sc.nextLine();
		
		Usuario usuario = new Usuario (Nome, Email, Nacionalidade);
		
		String postagem_aux;
		System.out.println("Digite uma postagem: "); 
		postagem_aux = sc.nextLine();
		usuario.adicionaPostagens(postagem_aux);*/
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String Opcao;
		do {
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite um nome: "); 
			String Nome = sc.nextLine();
			
			System.out.println("Digite um email: "); 
			String Email = sc.nextLine();
			
			System.out.println("Digite uma nacionalidade: "); 
			String Nacionalidade = sc.nextLine();
			
			Usuario usuario = new Usuario (Nome, Email, Nacionalidade);
			listaUsuarios.add(usuario);
			
			System.out.println("Deseja continuar adicionando usuario? Sim - s / Nao - n: ");
			Opcao = sc.nextLine();
			
			
		}while (Opcao !="n");
	}	
	
}
