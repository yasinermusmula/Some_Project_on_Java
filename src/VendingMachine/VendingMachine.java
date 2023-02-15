package VendingMachine;

public interface VendingMachine {
    void displayProducts();

    void selectProduct(int product);

    void displayEnterCoinsMessages();

    void enterCoins(int... coins);

    void displayChangeMessage();

}
