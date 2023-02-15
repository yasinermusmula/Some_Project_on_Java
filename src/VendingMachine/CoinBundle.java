package VendingMachine;

public class CoinBundle {

    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    CoinBundle(int... enteredCoin){
        this.number5CentsCoins = enteredCoin[0];
        this.number10CentsCoins = enteredCoin[1];
        this.number20CentsCoins = enteredCoin[2];
        this.number50CentsCoins = enteredCoin[3];
        this.number100CentsCoins = enteredCoin[4];
    }

    public int getTotal() {
        int total = 0;
        total+=this.number5CentsCoins * 5;
        total+=this.number10CentsCoins * 10;
        total+=this.number20CentsCoins * 20;
        total+=this.number50CentsCoins * 50;
        total+=this.number5CentsCoins * 100;
        return total;
    }
}
