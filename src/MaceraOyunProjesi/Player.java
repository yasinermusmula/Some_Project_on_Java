package MaceraOyunProjesi;

import java.util.Scanner;

public class Player {
   private int damage,healthy,money,rHealthy;
   private String name,cName;
   private Inventory inv;
   Scanner input = new Scanner(System.in);

   public Player(String name){
       this.name = name;
       this.inv = new Inventory();
   }
   public void selecCha(){
       switch (chaMenu()){
           case 1:
               initPlayer("Samuray",5,21,15);
               break;
           case 2:
               initPlayer("Okcu",7,18,20);
               break;
           case 3:
               initPlayer("Sovalye",8,24,5);
               break;
           default:
               initPlayer("Samuray",5,21,15);
               break;
       }
       System.out.println("Karakter : " + getcName() + "\t Hasar:" + getDamage() + "\t Saglik:" + getHealthy() + "\t Para:" + getMoney());
   }
   public int chaMenu(){
       System.out.println("Lutfen karakter seciniz: ");
       System.out.println("1- Samuray \t Hasar : 5 \t Saglik: 21 \t Para:15");
       System.out.println("2- Okcu \t Hasar : 7 \t Saglik: 18 \t Para:20");
       System.out.println("3- Sovalye \t Hasar : 8 \t Saglik: 24 \t Para:5");
       System.out.print("Karakter seciminiz: ");
       int chaID = input.nextInt();
       while (chaID < 1 || chaID > 3){ // chaID, 1'den kucuk ve 3'ten buyuk olana kadar dongu devam etsin
           System.out.println("Lutfen gecerli bir karakter seciniz");
           chaID = input.nextInt();
       }
       return chaID;
   }
   public int getTotalDamage(){ // totalDamage icin burdaki toplam damage'i aldik ve inventoryde ki damagi almış olduk.
       return this.getDamage() +this.getInv().getDamage();
   }

   public void initPlayer(String cName,int dmg ,int healthy,int mny){ // metot olusturarak "Player" sınıfına ozgu tanimlari metot ile tanimlayacagiz
        setcName(cName);
        setDamage(dmg);
        setHealthy(healthy);
        setMoney(mny);
        setrHealthy(healthy);
   }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
}
