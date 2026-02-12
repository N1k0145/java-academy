
/*
	Escreva um aplicativo que insere tres inteiros digitados pelo 
	usuario e exibe a soma, media, produto e os numeros menores e
	maiores.
*/

import java.util.Scanner;

public class Ex2p17{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma, produto, media;
		
		System.out.println("Digite o primeiro numero");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro numero");
		c = sc.nextInt();
		
		soma = a + b + c;
		
		produto = a * b * c;
		
		media = (a + b + c) / 3;
		
		if (a > b and a > c){
			System.out.println("O maior numero é: " +a);
		}else if(b > a amd b > c){
			System.out.println("O maior numero é: " +b);
		}else {
			System.out.println("O maior numero é: " +c);
		}
}