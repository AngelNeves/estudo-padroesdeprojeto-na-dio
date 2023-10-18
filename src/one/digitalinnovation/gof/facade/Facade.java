package one.digitalinnovation.gof.facade;

import subsistema.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep ) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarCidade(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		
	}
	

}
