/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � constru�do dentro de um projeto java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
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

		// Sauda��o e pergunta o nome.
		System.out.println("Ol� amigo!\nQual � o seu nome?");

		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		// Sauda��o espec�fica.
		System.out.printf("Ol� %s!", nome);
		in.close();

	}

}
