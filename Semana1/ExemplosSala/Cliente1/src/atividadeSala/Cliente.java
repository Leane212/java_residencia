package atividadeSala;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.idade = 0;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um nome: "); 
		String Nome = sc.nextLine();
		
		
		System.out.println("Digite um Cpf: "); 
		String Cpf = sc.nextLine();
		
		Cliente cliente = new Cliente(Nome, Cpf);
		
		System.out.println("O nome é: " +cliente.getNome()+ " O cpf e: " +cliente.getCpf()); 
		
		//solicitando alteração
		
		
		System.out.println("Digite um novo nome: "); 
		Nome = sc.nextLine ();
		
		System.out.println("Digite um novo Cpf: "); 
		Cpf = sc.nextLine ();
		
		cliente.setCpf(Cpf);
		System.out.println("O nome é: " +cliente.getNome()+ "O cpf e: " +cliente.getCpf()); 
	
	}
	
}
