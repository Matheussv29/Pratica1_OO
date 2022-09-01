package br.com.poo.atividade1.newton;

public class Ex_02 {
			
		private String nome;
		private double salario;
		private int horasAula;
		double getGastos(){
		return this.salario + (horasAula * 40);
		}
		String getInfo(){
			return "nome: " + this.nome +  "com salário"  + this.salario + (horasAula * 40);
		
		}
		
	}


