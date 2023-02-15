package VendingMachine;

public enum Coin {
    FIV_CENTS(5), TEN_CENTS(10), TWENTY_CENTS(20), FIFTY_CENT(50), HUNDREAD_CENTS(100);

    private int value;

    private Coin(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
     }
     public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for (int index=0; index<numberCoinsInText.length; index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
     }
}
