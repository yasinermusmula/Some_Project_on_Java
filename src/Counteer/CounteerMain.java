package Counteer;

import java.util.Scanner;

public class CounteerMain {
    Customers customer,customer2,customer3,customer4;
    Vehicle vehicle,vehicle2,vehicle3,vehicle4,vehicle5,vehicle6,vehicle7;

    public void start() {
////        System.out.print("Gise Muduru arabasi ve hizi: ");
//        vehicle = new Vehicle("Lada",3400,50);
//        vehicle.createVehicle();
////        System.out.println("Gise muduru bilgileri: ");
//        customer = new Customers("Yasin","Ermusmula",500,123456);
////        vehicle.showCars();
//        customer.createCustomer();
////        customer.showCustomer();
//        vehicle.showCars();
//        customer.customerAndVehicle();
//        addOptionToCustomer();
        int giseParasi = 200;
        createVehicle();
        createCustomer();
        showsCars();
//        System.out.println();
//        showsCustomers();
        System.out.println();
        customer.customerID();
//        selectCustomer();
        carGoingUcret();
        }

    public void createVehicle() {
        vehicle = new Vehicle("Renault", 3500, 100);
        vehicle.addCar(vehicle);
        vehicle2 = new Vehicle("BMW", 3501, 150);
        vehicle.addCar(vehicle2);
        vehicle3 = new Vehicle("Pegout", 3502, 80);
        vehicle.addCar(vehicle3);
        vehicle4 = new Vehicle("Mercedes", 3503, 180);
        vehicle.addCar(vehicle4);
        vehicle5 = new Vehicle("Audi", 3504, 200);
        vehicle.addCar(vehicle5);
        vehicle6 = new Vehicle("Citroen", 3505, 160);
        vehicle.addCar(vehicle6);
        vehicle7 = new Vehicle("Porcshe", 3506, 250);
        vehicle.addCar(vehicle7);
        System.out.println("Gececek arabalar tanimlandi");
    }
    public void showsCars(){
        vehicle.showCars();
    }

    public void createCustomer(){
        customer = new Customers("Yasin","Ermusmula",150,12345);
        customer.addCustomer(customer);
        customer2 = new Customers("Ahmet","Lacin",500,67890);
        customer.addCustomer(customer2);
        customer3 = new Customers("Mehmet","Dumen",450,98766);
        customer.addCustomer(customer3);
        customer4 = new Customers("Orhan","Faik",650,43546);
        customer.addCustomer(customer4);
        System.out.println("Musteriler Tanimlandi");
    }

    public void showsCustomers(){
        customer.showCustomer();
    }

    public int generalMoney(){
        System.out.println("Yuklemek istediginiz miktari giriniz: ");
        System.out.println("1 - 50TL");
        System.out.println("2 - 100TL");
        System.out.println("3 - 150TL");
        System.out.println("4 - 200Tl");
        Scanner input = new Scanner(System.in);
        int addMoney = input.nextInt();
        while (addMoney < 50 || addMoney > 200){
            System.out.println("Yalnis giris yaptiniz tekrar deneyiniz...");
            addMoney = input.nextInt();
        }
        return addMoney;
    }

    public void addMoneyToAccount(){
        switch (generalMoney()) {
            case 1:
                System.out.println("Yuklemek istediginiz parayi yaziniz: ");
                Scanner input = new Scanner(System.in);
                int newMoneyAdd = input.nextInt();
                int newAccountMoney = customer.getCustomerMoney() + newMoneyAdd;
                customer.setCustomerMoney(newAccountMoney);
                System.out.println("Hesabinaza para yuklendi.. Yeni bakiyeniz: " + customer.getCustomerMoney());
                carGoingUcret();
        }
    }

    public void carGoingUcret(){
        switch (calculateCarPrice()){
            case 1:
                System.out.println(customer.toString() + " odeyecegi para 200 TL");
                if (customer.getCustomerMoney() >= 200){
                    int kalanNewBakiye = customer.getCustomerMoney() - 200;
                    customer.setCustomerMoney(kalanNewBakiye);
                    System.out.println("Ucreti odediniz.. Kalan bakiye: " + customer.getCustomerMoney());
                    carGoingUcret();
                }
                else {
                    System.out.println("Bakiyeniz yetersiz..lutfen hesaba bakiye yukleyiniz");
                    int newBakiyeCustomerAccount = customer.getCustomerMoney() + generalMoney();
                    customer.setCustomerMoney(newBakiyeCustomerAccount);
                    System.out.println("Hesabiniza yukleme yapildi yeni hesap bakiyeniz: " + customer.getCustomerMoney());
                    carGoingUcret();
                }
            case 2:
                System.out.println(customer2.toString() + " odeyecegi para 350 TL");
                if (customer2.getCustomerMoney() >= 350){
                    int kalanNewBakiye = customer2.getCustomerMoney() - 350;
                    customer2.setCustomerMoney(kalanNewBakiye);
                    System.out.println("Ucreti odediniz.. Kalan bakiye: " + customer2.getCustomerMoney());
                    carGoingUcret();
                }
                else {
                    System.out.println("Bakiyeniz yetersiz..lutfen hesaba bakiye yukleyiniz");
                    int newBakiyeCustomerAccount = customer2.getCustomerMoney() + generalMoney();
                    customer2.setCustomerMoney(newBakiyeCustomerAccount);
                    System.out.println("Hesabiniza yukleme yapildi yeni hesap bakiyeniz: " + customer2.getCustomerMoney());
                    carGoingUcret();
                }
            case 3:
                System.out.println(customer3.toString() + " odeyecegi para 270 TL");
                if (customer3.getCustomerMoney() >= 270){
                    int kalanNewBakiye = customer3.getCustomerMoney() - 270;
                    customer3.setCustomerMoney(kalanNewBakiye);
                    System.out.println("Ucreti odediniz.. Kalan bakiye: " + customer3.getCustomerMoney());
                    carGoingUcret();
                }
                else {
                    System.out.println("Bakiyeniz yetersiz..lutfen hesaba bakiye yukleyiniz");
                    int newBakiyeCustomerAccount = customer3.getCustomerMoney() + generalMoney();
                    customer3.setCustomerMoney(newBakiyeCustomerAccount);
                    System.out.println("Hesabiniza yukleme yapildi yeni hesap bakiyeniz: " + customer3.getCustomerMoney());
                    carGoingUcret();
                }
            case 4:
                System.out.println(customer4.toString() + " odeyecegi para 320 TL");
                if (customer4.getCustomerMoney() >= 320){
                    int kalanNewBakiye = customer4.getCustomerMoney() - 320;
                    customer4.setCustomerMoney(kalanNewBakiye);
                    System.out.println("Ucreti odediniz.. Kalan bakiye: " + customer4.getCustomerMoney());
                    carGoingUcret();
                }
                else {
                    System.out.println("Bakiyeniz yetersiz..lutfen hesaba bakiye yukleyiniz");
                    int newBakiyeCustomerAccount = customer4.getCustomerMoney() + generalMoney();
                    customer4.setCustomerMoney(newBakiyeCustomerAccount);
                    System.out.println("Hesabiniza yukleme yapildi yeni hesap bakiyeniz: " + customer4.getCustomerMoney());
                    carGoingUcret();
                }
        }
    }

    public int calculateCarPrice(){
        System.out.println("ID-1 sahibi - Ranault");
        System.out.println("ID-2 sahibi - BMW");
        System.out.println("ID-3 sahibi - Pegout");
        System.out.println("ID-4 sahibi - Mercede");
        System.out.println("ID-5 sahibi - Audi");
        System.out.println("ID-6 sahibi - Citroen");
        System.out.println("ID-7 sahibi - Porcshe");
        System.out.println("Hesaplanacak arabayi seciniz: ");
        Scanner input = new Scanner(System.in);
        int selNum = input.nextInt();
        while (selNum < 1 || selNum > 7){
            System.out.println("Gecersiz numara..Tekarar Giriniz");
            selNum = input.nextInt();
        }
        return selNum;
    }

    public void selectCustomer(){
//        showsCustomers();
        System.out.print("Secmek istediginiz musterinin kimlik sirasini yazin ");
        Scanner input = new Scanner(System.in);
        int selID = input.nextInt();
            switch (selID){
                case 1:
                    System.out.println("Sectiginiz musteri " + customer.toString() + " ve araba bilgileri: " + vehicle.toString());
                    carGoingUcret();
                    break;
            }
    }


//    public int calculatePrice(){ // Hesaplanan paraya gore dongude bir yere gircek ve odeyecegi para hesaplancak
//        System.out.println();
//    }
}
