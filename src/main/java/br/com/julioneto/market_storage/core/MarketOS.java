package br.com.julioneto.market_storage.core;

import java.util.Date;
import java.util.Scanner;

import static br.com.julioneto.market_storage.model.Product.addProduct;
import static br.com.julioneto.market_storage.model.Product.listProducts;
import static br.com.julioneto.market_storage.utils.Messages.marketOsStartMessage;
import static br.com.julioneto.market_storage.utils.Messages.optionsMessage;

public class MarketOS {
    public static Scanner keyboard = new Scanner(System.in);
    public static String username;
    public static String options;

    public static String marketOs() {
        System.out.println(marketOsStartMessage());

        do {
            System.out.println(optionsMessage());
            System.out.print("Informe a opção desejada: ");
            options = keyboard.nextLine();

            switch (options) {
                case "1":
                    System.out.println("\nProduto Cadastrado\n" + addProduct());
                    break;
                case "2":
                    System.out.println(listProducts());
                    break;
                case "0":
                    System.out.println("\nEncerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!options.equals("0"));
        return "Sistema encerrado em " + new Date().toLocaleString() + " pelo usuário " + username;
    }

}
