package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto
		Cliente objetoCliente = new Cliente();
		// NomeArquivo nomeObjeto = new NomeArquivo();
		
		// Entradas
		objetoCliente.setNome("Matheus Santos");
		objetoCliente.setIdade(28);
		objetoCliente.setValor(42);
        objetoCliente.setTelefone(978768971);
		
		/* Saídas
		System.out.print("Nome: ");
		System.out.println(objetoCliente.getNome());
		
		System.out.print("Idade: ");
		System.out.println(objetoCliente.getIdade());

		System.out.print("Telefone: ");
		System.out.println(objetoCliente.getTelefone());
		
		System.out.print("Valor: ");
		System.out.println(objetoCliente.getValor());
		*/
		
		System.out.println("Nome: " + objetoCliente.getNome() + "\nIdade: " + objetoCliente.getIdade()+ "\nTelefone: " + objetoCliente.getTelefone() + "\nValor: " + objetoCliente.getValor());

	}

}
