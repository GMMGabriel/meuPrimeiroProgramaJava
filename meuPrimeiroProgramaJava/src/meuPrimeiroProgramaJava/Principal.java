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
public class Principal { // Classe que contém o método principal.

	public static void main(String[] args) { // Este é o método principal.

		System.out.println("Olá amigo!\nQual é o seu nome?");

		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		// Exibir um string usando printf.
		System.out.printf("Olá %s!", nome);
		in.close();

	}

}
