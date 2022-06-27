package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("Bem-vindos a esse grandioso primeiro projeto em Java");
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor numerico: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor numerico: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Como Soma temos: " + soma);
		System.out.println("Como Subtracao temos: " + subtracao);
		System.out.println("Como Multiplicacao temos: " + multiplicacao);
		System.out.println("Como Divisao temos: " + divisao);
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
}
