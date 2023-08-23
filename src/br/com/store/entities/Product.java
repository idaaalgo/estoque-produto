package br.com.store.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Calcula o preço total em estoque, do produto
    public double totalValueInStock() {
        return price * quantity;
    }
    //Adiciona quantidade x do produto
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    //Remove quantidade x do produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    //@Override sobre-escreve uma função de outra classe
    @Override
    public String toString() {
        return  name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total no estoque: R$ "
                + String.format("%.2f",totalValueInStock());
    }
}
