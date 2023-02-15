package Counteer;

public class Person {

    private String customerName,customerSirName;
    private int customerMoney;

    Person(String customerName,String customerSirName, int customerMoney){
        this.customerName = customerName;
        this.customerSirName = customerSirName;
        this.customerMoney = customerMoney;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSirName() {
        return customerSirName;
    }

    public void setCustomerSirName(String customerSirName) {
        this.customerSirName = customerSirName;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        this.customerMoney = customerMoney;
    }
}
