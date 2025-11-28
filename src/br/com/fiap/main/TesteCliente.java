package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Cidade;
import br.com.fiap.beans.Estado;

public class TesteCliente {

    public static void main(String[] args) {

        // Criando Estado
        Estado estado = new Estado();
        estado.setNome("São Paulo");
        estado.setSigla("SP");

        // Criando Cidade
        Cidade cidade = new Cidade();
        cidade.setNome("São Paulo");
        cidade.setEstado(estado);

        // Criando Endereco
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Paulista");
        endereco.setNumero(1000);
        endereco.setBairro("Bela Vista");
        endereco.setCep("01311-000");
        endereco.setCidade(cidade);

        // Criando Cliente
        Cliente objetoCliente = new Cliente();
        objetoCliente.setNome("Matheus Tatajuba");
        objetoCliente.setIdade(35);
        objetoCliente.setValor(100);
        objetoCliente.setTelefone(978768607);
        objetoCliente.setEndereco(endereco);


        // Saídas

        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + objetoCliente.getNome());
        System.out.println("Idade: " + objetoCliente.getIdade());
        System.out.println("Telefone: " + objetoCliente.getTelefone());
        System.out.println("Valor: " + objetoCliente.getValor());

        // Agora mostrando o endereço completo
        System.out.println("\n=== Endereço ===");
        System.out.println("Rua: " + objetoCliente.getEndereco().getRua());
        System.out.println("Número: " + objetoCliente.getEndereco().getNumero());
        System.out.println("Bairro: " + objetoCliente.getEndereco().getBairro());
        System.out.println("CEP: " + objetoCliente.getEndereco().getCep());
        System.out.println("Cidade: " + objetoCliente.getEndereco().getCidade().getNome());

        // Cidade → Estado
        System.out.println("Estado: " + objetoCliente.getEndereco().getCidade().getEstado().getSigla());
    }
}
