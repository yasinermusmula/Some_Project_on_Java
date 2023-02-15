package TaxiPriceCalculate;

public class CalculateTaxiPrice {
    private double km,startPrice;

    CalculateTaxiPrice(int km){
        this.km = km;
        this.startPrice = 10;
    }
    public double CalculateTotalMonay(){
        double totalMoney = km*2.2;
        return totalMoney;
    }

    public void calculate() {
        if (CalculateTotalMonay() < 20){
            shortWay();
        }
        else {
            System.out.println("You will pay " + (CalculateTotalMonay() + this.startPrice));
        }
    }

    public void shortWay(){
        System.out.println("You will pay 20TL");
    }
}
