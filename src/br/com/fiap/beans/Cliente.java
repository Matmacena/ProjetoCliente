package br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo de dado e variável

	// Criando as variáveis com seu tipo
	private String nome;
	private int idade;
	private double valor;

	// --- Setters ----

	// Setters (tipo da var E nome var)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// --- Getters ---
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getValor() {
		return valor;
	}

}
