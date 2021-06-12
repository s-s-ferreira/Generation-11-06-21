package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int quantia;
		String Produto, remover, code;
		
		System.out.println("Quantos produtos serão adicionados: ");
		quantia = ler.nextInt();
		
		ArrayList<String> estoque = new ArrayList<>();
		
		for (int i=0; i<quantia;i++) {
			System.out.println("Informe o nome do produto: ");
			Produto = ler.next();
			
			estoque.add(Produto);
		}
		
		System.out.println("Lista: " + estoque);
		
		System.out.println("Caso queira remover algum item da lista pressione [x], caso não pressione [v].");
		remover = ler.next();
		
		if(remover.equals("x") || remover.equals("X")) {
			System.out.println("Digite o nome do produto para remover: ");
			code = ler.next();
			
			estoque.remove(code);
		}
		
		else if (remover.equals("v") || remover.equals("V")){
			System.out.println("Segue a lista final.");
		}
		
		System.out.println("Lista: " + estoque);
	
		ler.close();
	}
}
