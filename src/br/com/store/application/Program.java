package br.com.store.application;

import br.com.store.entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Instanciando um Scanner
        Scanner sc = new Scanner(System.in);
        //Instanciando um Produto
        Product product = new Product();
        //Adicionando os dados do Produto
        System.out.println("Digite as informações do produto: ");
        //Nome
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        //Valor
        System.out.print("Valor: R$ ");
        product.price = sc.nextDouble();
        //Quantidade
        System.out.print("Quantidade no estoque: ");
        product.quantity = sc.nextInt();
        //Printa o toString, pois o metodo recebeu um @Override na classe Product
        System.out.println();
        System.out.println("Informações do produto: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos pra serem adicionado no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos pra serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);
        sc.close();
    }
}
