package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TestRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		
		LivroWS client = new LivroWSProxy();
		Livro[] livros = client.getLivrosPeloNome("Spring");
		
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}
	}

}
