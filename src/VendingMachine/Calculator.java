package VendingMachine;

public interface Calculator {

    int calculateTotal(CoinBundle enteredCoins);

    CoinBundle calculate(int amountMoneyToReturn);

    CoinBundle calculateChange(int changeAmount);
}
