package hw7.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Price {
    String shop;
    String productName;
    float priceInUAH;

    public Price(String shop, String productName, float priceInUAH) {
        this.shop = shop;
        this.productName = productName;
        this.priceInUAH = priceInUAH;
    }

    @Override
    public String toString() {
        return "Shop: ' " + shop + '\'' + ", name of the product: '" + productName + '\'' +
                ", price: " + priceInUAH + " UAH.";
    }
}

class WrongShopException extends Exception {
    public void wrongShopException() {
        System.out.println("The wrong name of shop. It is not in the list.");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Price> prices = new ArrayList<>(2);
        System.out.println("********************************************************");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input the name of 1st shop: ");
        String shop1 = scanner1.nextLine();
        System.out.println("Input the name of the product is selling in this shop: ");
        String productName1 = scanner1.nextLine();
        System.out.println("Input te price in UAH (in format 00,00): ");
        float price1 = scanner1.nextFloat();
        Price priceOne = new Price(shop1, productName1, price1);
        prices.add(priceOne);
        System.out.println("********************************************************");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input the name of 2nd shop: ");
        String shop2 = scanner2.nextLine();
        System.out.println("Input the name of the product is selling in this shop: ");
        String productName2 = scanner2.nextLine();
        System.out.println("Input te price in UAH (in format 00,00): ");
        float price2 = scanner2.nextFloat();
        Price priceTwo = new Price(shop2, productName2, price2);
        prices.add(priceTwo);
        System.out.println("********************************************************");
        Collections.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.shop.compareTo(o2.shop);
            }
        });

        for (Price p : prices) {
            System.out.println(p + " ");
        }
        System.out.println("********************************************************");

        do {
            System.out.println("Input the name of the shop to look the assortment ");
            Scanner scannerProd = new Scanner(System.in);
            String requredProduct = scannerProd.nextLine();

            try {
                if (requredProduct.equalsIgnoreCase(priceOne.shop)) {
                    System.out.println(priceOne.productName);
                } else if (requredProduct.equalsIgnoreCase(priceTwo.shop)) {
                    System.out.println(priceTwo.productName);
                } else throw new WrongShopException();
            } catch (WrongShopException e) {
                e.wrongShopException();
            }
            if ((requredProduct.equalsIgnoreCase(priceOne.shop))
                    || (requredProduct.equalsIgnoreCase(priceTwo.shop))) {
                break;
            }
        } while (true);

        System.out.println("********************************************************");
    }
}
