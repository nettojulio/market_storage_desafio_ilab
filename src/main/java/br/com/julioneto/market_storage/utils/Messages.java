package br.com.julioneto.market_storage.utils;

import static br.com.julioneto.market_storage.core.MarketOS.keyboard;
import static br.com.julioneto.market_storage.core.MarketOS.username;
import static br.com.julioneto.market_storage.model.Product.productsList;

public class Messages {
    public static String newProductName;
    public static Integer newProductonStock;
    public static Double newProductPrice;
    public static Double totalOfProducts = Double.valueOf(0);
    public static Integer totalOfProductsOnStock = 0;

    public static String optionsMessage() {
        return "\nMENU DE OPÇÕES:\n\n" +
                "1 - CADASTRAR PRODUTOS\n" +
                "2 - CONSULTAR PRODUTOS\n" +
                "0 - SAIR\n"
                ;
    }

    public static String marketOsStartMessage() {
        System.out.print("\nInforme seu usuário: ");
        username = keyboard.nextLine();
        return "\n====================================\n" +
                "\tOlá, " +
                username +
                "!" +
                "\n====================================";
    }

    public static void addProductsMessage() {
        System.out.println("\nOPÇÃO ESCOLHIDA: CADASTRAR PRODUTOS\n");
        System.out.print("Informe o nome do produto: ");
        newProductName = keyboard.nextLine();
        System.out.print("Informe a quantidade em estoque do produto: ");
        newProductonStock = keyboard.nextInt();
        System.out.print("Informe o preço do produto:");
        newProductPrice = keyboard.nextDouble();
    }

    public static String listProductsMessage() {
        return "\nTotal de itens cadastrados: " +
                productsList.size() +
                "\nValor total de mercadorias em estoque: " +
                totalOfProducts +
                "\nQuantidade total de mercadorias em estoque: " +
                totalOfProductsOnStock +
                "\n\n" +
                "End of Products List";
    }

}
