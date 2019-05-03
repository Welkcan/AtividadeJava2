package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setCpf(800000);
		pf.setEnd("Rua Col�nia D'Assun��o");
		pf.setNome("Guilherme Ramos Serra");
		pf.setBairro("Itaim Paulista");
		pf.setEstado("S�o Paulo");
		pf.setCidade("S�o Paulo");
		pf.setTel(983531008);
		
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setCnpj(854656);
		pj.setEnd("Rua Avenida Tavares");
		pj.setNome("Grop Corporation");
		pj.setBairro("Tatuap�");
		pj.setEstado("S�o Paulo");
		pj.setCidade("S�o Paulo");
		pj.setTel(25664838);
		
		
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endere�o: " + pf.getEnd());
		System.out.println("Bairro: " + pf.getBairro());
		System.out.println("Cidade: " +pf.getCidade());
		System.out.println("Estado: " +pf.getEstado());
		System.out.println("CPF: " +pf.getCpf());
		System.out.println("Telefone: " +pf.getTel());
		
		System.out.println("   ");
		
		System.out.println("Nome: " + pj.getNome());
		System.out.println("Endere�o: " + pj.getEnd());
		System.out.println("Bairro: " + pj.getBairro());
		System.out.println("Cidade: " +pj.getCidade());
		System.out.println("Estado: " +pj.getEstado());
		System.out.println("CPF: " +pj.getCnpj());
		System.out.println("Telefone: " +pj.getTel());
		
				
	}

}
