package VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = input.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessages();

        String userEnteredCoins = input.nextLine();

        int [] enteredCoins = Coin.parseCoins(userEnteredCoins);

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();

    }
}
