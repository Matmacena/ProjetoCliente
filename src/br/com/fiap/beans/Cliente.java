package br.com.fiap.beans;



public class Cliente {
	// visibilidade, tipo de dado e variável

	// Criando as variáveis com seu tipo
	private String nome;
	private int idade;
    private int telefone;
	private double valor;
    private Endereco endereco;

	// --- Setters ----

	// Setters (tipo da variavel E nome variavel)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

    public  void setTelefone(int telefone) {this.telefone = telefone; }

	public void setValor(double valor) {
		this.valor = valor;
	}

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

	// --- Getters ---
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

    public int getTelefone() { return telefone;}

	public double getValor() {
		return valor;
	}

    public Endereco getEndereco() {return endereco;}
}
