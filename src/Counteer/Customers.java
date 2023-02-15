package Counteer;

import java.util.ArrayList;

public class Customers extends Person{
    private int customerID,customerIDnum;
    private ArrayList<Customers> howManyCustomers;


    Customers(String customerName, String customerSirName, int customerMoney,int customerID) {
        super(customerName, customerSirName, customerMoney);
        this.customerID = customerID;
        howManyCustomers = new ArrayList<>();
        this.customerIDnum = 1;
    }
    public void addCustomer(Customers customer){
        howManyCustomers.add(customer);
    }

    public void customerID(){
        for (Customers csID : howManyCustomers){
            System.out.println(csID.toString() + "ID: " +csID.getCustomerID() + " ID sirasi: " + customerIDnum++);
        }
    }

    public void showCustomer(){
        for (Customers cs : howManyCustomers){
            System.out.println(cs.toString());
        }
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerIDnum() {
        return customerIDnum;
    }

    @Override
    public String toString() {
        return "Isim:"+getCustomerName() + " Soyad:" + getCustomerSirName() + " Para:" + getCustomerMoney() + " Kimlik No:" + getCustomerID();
    }
}
