
module Teoricas {
	//-------Questao 1----------
	
	/*Na programação orientada a objetos, uma classe é um molde que define as características
	e comportamentos de um tipo de objeto.Uma classe em Java (assim como em C++)
	é uma representação de um conceito, abstração ou entidade do mundo real.
	Um objeto é uma instância de uma classe. Quando você cria um objeto, está criando uma 
	cópia desse molde, com valores específicos para seus atributos e comportamentos. 
	Cada objeto tem seu próprio estado (valores dos atributos) e comportamento 
	(ações que pode executar). Por exemplo, a classe Pessoa pode ser usada para representar 
	uma pessoa no mundo real. A classe Pessoa teria atributos como nome, idade e endereço, 
	e métodos como andar, falar e comer.*/
	
	//Exemplos C++
	
	#include <iostream>
	using namespace std;

	
	class Paciente {
	public:
	    string nome;
	    int idade;
	    string diagnostico;

	    void exibirDados() {
	        cout << "Nome: " << nome << ", Idade: " << idade << ", Diagnóstico: " << diagnostico << endl;
	    }
	};

	int main() {
	    
	    Paciente paciente1; 
	    paciente1.nome = "Maria";
	    paciente1.idade = 30;
	    paciente1.diagnostico = "Febre";

	    Paciente paciente2; 
	    paciente2.nome = "João";
	    paciente2.idade = 25;
	    paciente2.diagnostico = "Fratura no braço";

	    paciente1.exibirDados();
	    paciente2.exibirDados();

	    return 0;
	}
	
	//Exemplo java
	
	public class Paciente {
	    String nome;
	    int idade;
	    String diagnostico;

	    void exibirDados() {
	        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Diagnóstico: " + diagnostico);
	    }

	    public static void main(String[] args) {
	        
	        Paciente paciente1 = new Paciente(); 
	        paciente1.nome = "Maria";
	        paciente1.idade = 30;
	        paciente1.diagnostico = "Febre";

	        Paciente paciente2 = new Paciente(); 
	        paciente2.nome = "João";
	        paciente2.idade = 25;
	        paciente2.diagnostico = "Fratura no braço";

	        paciente1.exibirDados();
	        paciente2.exibirDados();
	    }
	}
	
	//-------Questao 2----------
	

/*Para declarar uma variável em Java, você usa a seguinte sintaxe:
  
  tipo_de_dado nome_da_variável;
  
 Os tipos de dados primitivos mais comuns em Java são:

	int: Armazena números inteiros.
	double: Armazena números de ponto flutuante (com casas decimais).
	boolean: Armazena valores booleanos (true ou false).
	char: Armazena um único caractere Unicode.
	byte: Armazena números inteiros pequenos.
	short: Armazena números inteiros curtos.
	long: Armazena números inteiros longos.
	float: Armazena números de ponto flutuante (menos preciso que double).
	
	Ambas as linguagens têm tipos de dados primitivos semelhantes, mas com diferenças 
	em termos de portabilidade e precisão dos tipos de dados de ponto flutuante, bem 
	como na definição de tamanhos fixos ou variáveis para os tipos de dados primitivos. 
	No geral. 
 */

	//-------Questao 3----------
	
	/*Herança é um conceito fundamental na programação orientada a objetos que permite 
	criar uma nova classe (subclasse) baseada em uma classe existente (superclasse). 
	Isso permite que a subclasse herde atributos e métodos da superclasse, além de adicionar
	seus próprios atributos e métodos específicos.
	
	Por exemplo: 
	Para criar uma subclasse em java a partir de uma classe existente, usamos a 
	palavra-chave extends.
	*/
	class Carro extends Veiculo {
	    int numPortas;

	    void exibirInfoCarro() {
	        System.out.println("Número de portas: " + numPortas);
	    }
	}
	//Classe Veiculo é a superclasse e classe carro subclasse
	
	
	/*Na herança em C++, é usado o conceito de : para indicar-la. 
	Veja exemplo de como isso é feito:*/
	
	class Carro : public Veiculo {
		public:
		    int numPortas;

		    void exibirInfoCarro() {
		        cout << "Número de portas: " << numPortas << endl;
		    }
		};
	
	
    //-------Questao 4----------
		
	/*Em C++, os ponteiros são um tipo de dado primitivo que armazena o endereço de 
	memória de outro objeto. Os ponteiros podem ser usados para acessar diretamente 
	o conteúdo de um objeto, ou para mover o conteúdo de um objeto para outro.
    Em Java, os ponteiros são ocultos do desenvolvedor. Quando declaramos uma variável, 
    estamos criando uma referência para um objeto, mas essa referência não é um tipo de 
    dado primitivo. Ou seja, quando declaramos variáveis de tipos de objetos (por exemplo, 
    de uma classe), essas variáveis armazenam referências aos objetos, não os objetos em si.*/
        
	
	
	

}