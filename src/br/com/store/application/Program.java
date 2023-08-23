package br.com.store.application;

import br.com.store.entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Valor: R$ ");
        double price = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Informações do produto: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos pra serem adicionado no estoque: ");
        quantity = sc.nextInt();
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
