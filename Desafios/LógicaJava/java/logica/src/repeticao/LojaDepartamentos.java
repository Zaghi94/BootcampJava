package repeticao;

import java.util.Scanner;

public class LojaDepartamentos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String produto, categoria;
		int contador = 0, contC = 0, contE = 0, contV = 0, quantidade = 0;
		double precoU, valorTotal, valorTC = 0, valorTE=0, valorTV=0, 
		impostoU=0, lucroU=0, impTC=0, impTE=0, impTV=0, lucroTC=0, lucroTE=0, lucroTV=0;
		
		while (contador < 15) {
			System.out.printf("Digite o nome do %dº de 15 produtos:\n", contador+1);
			produto = sc.next();
			System.out.printf("Digite a quantidade do produto '%s': \n", produto);
			quantidade = sc.nextInt ();
			System.out.printf("Digite o preço unitário do produto '%s' em R$: \n", produto);
			precoU = sc.nextDouble();
			System.out.println("Digite a letra referente à categoria do produto:\n C: Cama, mesa e banho;\n"
					+ " E: Eletrodomésticos; \n V: Vestuário.\n");
			categoria = sc.next().toUpperCase(); //Define a categoria digitada como maiúscula;
			
			
				while (!"C".equals(categoria) && !"E".equals(categoria)  && !"V".equals(categoria)) {
					System.out.println("CATEGORIA INVÁLIDA!");
					System.out.println("Digite a letra referente à categoria do produto:\n C: Cama, mesa e banho;\n"
							+ " E: Eletrodomésticos; \n V: Vestuário.\n");
					categoria = sc.next().toUpperCase(); //Define a categoria digitada como maiúscula;
				}	
				
				switch (categoria) {
				
				case "C": 
					contC++;
					impostoU = precoU*0.3741;
					lucroU = precoU*0.30;
					valorTotal = (precoU + lucroU + impostoU)*quantidade;
					impTC += impostoU*quantidade;
					lucroTC += lucroU*quantidade;
					valorTC += valorTotal;
					System.out.printf("\n* Produto: %s\n* Quantidade: %d\n* Valor unitário: R$%.2f\n* Imposto Unitário: %.2f\n"
							+ "* Lucro unitário: R$%.2f\n* Valor em estoque: R$%.2f\n\n", produto, quantidade, precoU, impostoU, lucroU, valorTotal);
				break;
				case "E": 
					contE++;
					impostoU = precoU*0.4314;
					lucroU = precoU*0.35;
					valorTotal = (precoU + lucroU + impostoU)*quantidade;
					impTE += impostoU*quantidade;
					lucroTE += lucroU*quantidade;
					valorTE += valorTotal;
					System.out.printf("\n* Produto: %s\n* Quantidade: %d\n* Valor unitário: R$%.2f\n* Imposto Unitário: %.2f\n"
							+ "* Lucro unitário: R$%.2f\n* Valor em estoque: R$%.2f\n\n", produto, quantidade, precoU, impostoU, lucroU, valorTotal);
				break;
				case "V": 
					contV++;
					impostoU = precoU*0.3842;
					lucroU = precoU*0.50;
					valorTotal = (precoU + lucroU + impostoU)*quantidade;
					impTV += impostoU*quantidade;
					lucroTV += lucroU*quantidade;
					valorTV += valorTotal;
					System.out.printf("\n* Produto: %s\n* Quantidade: %d\n* Valor unitário: R$%.2f\n* Imposto Unitário: %.2f\n"
							+ "* Lucro unitário: R$%.2f\n* Valor em estoque: R$%.2f\n\n", produto, quantidade, precoU, impostoU, lucroU, valorTotal);
				break;
				
				}
			contador++;
		}
			
		System.out.printf("CATEGORIA CAMA, MESA E BANHO:\n -> Quantidade de itens: %d\n -> Total de impostos: R$%.2f\n -> Margem de lucro: R$%.2f\n -> Valor total em estoque: R$%.2f\n\n", contC, impTC, lucroTC, valorTC);	
		System.out.printf("ELETRODOMÉSTICO:\n -> Quantidade de itens: %d\n -> Total de impostos: R$%.2f\n -> Margem de lucro: R$%.2f\n -> Valor total em estoque: R$%.2f\n\n", contE, impTE, lucroTE, valorTE);		
		System.out.printf("VESTUÁRIO:\n -> Quantidade de itens: %d\n -> Total de impostos: R$%.2f\n -> Margem de lucro: R$%.2f\n -> Valor total em estoque: R$%.2f", contV, impTV, lucroTV, valorTV);
		sc.close();

	}

}
