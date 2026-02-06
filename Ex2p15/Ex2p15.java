/*
	2.15
	Escreva um aplicativo que solicita ao usuário inserir dois inteiros,
	obtém do usuário esses números e imprime sua soma, produto, diferença
	e quociente(divisão).
*/

import java.util.Scanner;

public class Ex2p15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma, produto, diferenca, quociente;
		
		System.out.println("Digite o primeiro número: ");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		y = sc.nextInt();
		
		soma = (x + y);
		produto = (x * y);
		diferenca = (x - y);
		quociente = (x / y);
		
		System.out.println("SOMA = " +soma);
		System.out.println("PRODUTO = " +produto);
		System.out.println("DIFERENÇA = " +diferenca);
		System.out.println("QUOCIENTE = " +quociente);
		
	}
		
}