package br.com.integracaoViaCep;

import java.util.Scanner;

import br.com.integracaoViaCep.model.Endereco;
import br.com.integracaoViaCep.service.ServicoDeCep;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
	}

}
