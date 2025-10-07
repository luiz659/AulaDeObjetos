package fag.objetosUm;

package fag;
import java.util.Scanner;
import fag.objetos;

public class Principal {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Produto produtoUm = new Produto();
		Produto produtoDois = new Produto();
		
	
		System.out.println("Entre com o nome do produto Um: ");
		produtoUm.setNome(scan.nextLine());
		System.out.println("Entre com o nome do produto dois:");
		produtoDois.setNome(scan.nextLine());
		System.out.println("Entre com o valor do primeiro produto");
		produtoUm.setPreco(scan.nextDouble());
		System.out.println("Entre com o valor do desconto:");
		produtoUm.setDescontPercent(scan.nextDouble());
		System.out.println("Entre com o valor do segundo produto");
		produtoDois.setPreco(scan.nextDouble());
		System.out.println("Entre com o valor do desconto:");
		produtoDois.setDescontPercent(scan.nextDouble());
		
		
		System.out.printf("Produto: %s, Valor: %.2f, Produto com desconto: : %.2f \n", produtoUm.getNome(), produtoUm.getPreco(), produtoUm.precoComDesconto());
		System.out.printf("Produto: %s, Valor: %.2f, Produto com desconto: : %.2f\n", produtoDois.getNome(), produtoDois.getPreco(),produtoDois.precoComDesconto());
	}
}


