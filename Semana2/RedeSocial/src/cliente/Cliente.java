package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private  int quantidadeDePostagens;
	private int pontuacao;
	
	
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
	
	void adicionaPostagem() 
	{
		if(quantidadeDePostagens !=0) {
			System.out.println("Nova postagem");
			
		} 
	}
	
	void quantidadeDePostagens() 
	{
		
	}

	void alterarPontuacao()
	{
		
	}


	public Cliente(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
		
		postagens = new ArrayList<String>();
		
	}

	public static void main(String[]args) {
	
		
	Cliente c;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	
	
	
	
	
	
	
	}
}