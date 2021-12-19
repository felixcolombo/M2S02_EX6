package com.github.felixcolombo.combustivel.main;

import java.util.Scanner;

import com.github.felixcolombo.combustivel.entidades.CalculoConsumo;

public class AppCombustivel {
	
	static double consumoGasolina;
	static double consumoEtanol;
	static double rodagemMedia;
	static double custoGasolina;
	static double custoEtanol;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Qual a rodagem média do motorista?");
		rodagemMedia = keyboard.nextDouble();
		
		CalculoConsumo calculo = new CalculoConsumo();
		
		calculoGasolina(calculo);
		calculoEtanol(calculo);
		
		System.out.printf("Seu custo médio utilizando Gasolina é de: %.2f\n", custoGasolina);
		System.out.printf("Seu custo médio utilizando Etanol é de: %.2f\n", custoEtanol);
		if(custoGasolina<custoEtanol) {
			System.out.println("Nesse caso, é aconselhado você utilizar Gasolina!");
		}else if(custoGasolina>custoEtanol) {
			System.out.println("Nesse caso, é aconselhado você utilizar Etanol!");
		}else {
			System.out.println("Nesse caso, o custo será o mesmo!");
		}
		
		
	}	

	public static double calculoGasolina(CalculoConsumo calculo) {
		System.out.println("Qual o valor atual por litro da Gasolina?");
		double valorGasolina = keyboard.nextDouble();
		System.out.println("Qual a autonomia por litro da Gasolina?");
		double autonomiaGasolina = keyboard.nextDouble();
		
		double consumoGasolina = calculo.CalculoConsumo(valorGasolina, autonomiaGasolina, rodagemMedia);
		
		custoGasolina = consumoGasolina;
		
		return calculo.getTotalConsumo();
		
	}
	
	public static double calculoEtanol(CalculoConsumo calculo) {
		System.out.println("Qual o valor atual por litro do Etanol?");
		double valorEtanol = keyboard.nextDouble();
		System.out.println("Qual a autonomia por litro do Etanol?");
		double autonomiaEtanol = keyboard.nextDouble();
		
		double consumoEtanol = calculo.CalculoConsumo(valorEtanol, autonomiaEtanol, rodagemMedia);
		
		custoEtanol = consumoEtanol;
		
		return calculo.getTotalConsumo();
	}
	
}
