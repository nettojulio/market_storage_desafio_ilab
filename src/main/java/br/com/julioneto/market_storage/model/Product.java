package br.com.julioneto.market_storage.model;

import java.util.ArrayList;
import java.util.UUID;

import static br.com.julioneto.market_storage.core.MarketOS.keyboard;
import static br.com.julioneto.market_storage.utils.Messages.*;

public class Product {
    public UUID id;
    public String name;
    public Integer onStock;
    public Double price;
    public Double totalOnStock;
    public static ArrayList<Product> productsList = new ArrayList<>();

    public Product(UUID id, String name, Integer onStock, Double price) {
        this.id = id;
        this.name = name;
        this.onStock = onStock;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOnStock() {
        return onStock;
    }

    public void setOnStock(Integer onStock) {
        this.onStock = onStock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalOnStock() {
        return this.price * this.onStock;
    }

    public void setTotalOnStock(Double totalOnStock) {
        this.totalOnStock = this.price * this.onStock;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", onStock=" + onStock +
                ", price=" + price +
                ", totalOnStock=" + (price * onStock) +
                '}';
    }

    public static Product addProduct() {
        addProductsMessage();
        Product newProduct = new Product(UUID.randomUUID(), newProductName, newProductonStock, newProductPrice);
        productsList.add(newProduct);
        keyboard.nextLine();
        return newProduct;
    }

    public static String listProducts() {

        System.out.println("\nOPÇÃO ESCOLHIDA: CONSULTAR PRODUTOS\n");
        for (Product unitProduct : productsList) {
            System.out.println(unitProduct.toString());
            totalOfProducts += unitProduct.getTotalOnStock();
            totalOfProductsOnStock += unitProduct.getOnStock();
        }
        return listProductsMessage();
    }

}
