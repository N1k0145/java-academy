/*
	2.16
	Escreva um aplicativo  que solicita ao usuário inserir dois
	inteiros, obtém do uauário esses números e exibe o número maior
	seguido pelas palavras "is larger". Se os números forem iguais,
	impruima a mensagem "These number are equal"
*/

import java.util.Scanner;

public class Ex2p16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		int x, y;
			
		System.out.println("Digite o primeiro número: ");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		y = sc.nextInt();
		
		if(x > y){
			System.out.println(x +" is larger");
		}else if(y > x){
			System.out.println(y +" is larger");
		}else{
			System.out.println("These number are equal");
		}
		
	}
}