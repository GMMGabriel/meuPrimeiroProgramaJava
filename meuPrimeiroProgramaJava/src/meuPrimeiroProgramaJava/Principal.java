/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author gabri
 * @date: 2021-02-03
 */
public class Principal {

	public static void main(String[] args) {

		// Saudação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");

		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		// Saudação específica para o nome lido.
		System.out.printf("Olá %s!", nome);

		System.out.println();
		// NOTA: implemetar a leitura de idade e exibí-la.
		System.out.printf("%s, qual � a sua idade?", nome);
		
		Integer idade = in.nextInt();

		System.out.println();
		System.out.printf("%d! Puxa! Como voc� � jovem!", idade); // Mostra a idade na tela junto a uma frase.

		in.close();

	}

}
