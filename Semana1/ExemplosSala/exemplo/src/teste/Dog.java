package teste;

public class Dog {
	private String nome;
	private int idade;
	public Dog(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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
	public String getDescricao() {
		return "Este cachorro se chama: " + this.nome + " , e possui essa idade: " + this.idade;
	}
}
