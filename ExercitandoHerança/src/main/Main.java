package main;

import java.util.ArrayList;

import dominio.Assistente;
import dominio.Funcionario;
import dominio.Gerente;
import dominio.Vendedor;

public class Main {

	public static void main(String[] args) {
		Gerente gerente01 = new Gerente("Vanessa Furigo", "787873423", 4000);
		Assistente assistente01 = new Assistente("Diego Furigo", "43859023958", 1500);
		Vendedor vendedor01 = new Vendedor("Alan William", "8348582958", 1500, 1000);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(gerente01);
		funcionarios.add(assistente01);
		funcionarios.add(vendedor01);
		
		double salarioTotal = 0;
		for(Funcionario f : funcionarios) {
			System.out.println(f.exibirFolhaSalarial());
			salarioTotal += f.calculaSalario();
			
			}
		
		System.out.println("Valor total dos salários: " + salarioTotal);
		
		}
		
	}
