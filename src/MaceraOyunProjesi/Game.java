package MaceraOyunProjesi;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner input = new Scanner(System.in);

    public void login() {
        Scanner input =new Scanner(System.in);
        player = new Player("Yasin");
        System.out.println("Macera oyununa hosgeldiniz " + player.getName());
        player.selecCha();
        start();
    }

    public void start() {
        while (true){
            System.out.println();System.out.println("==============");
            System.out.println();
            System.out.println("Eylem gerceklestirmek icin bir yer seciniz : ");
            System.out.println("1. Guvenli Ev ==> Siz ait guvenli bir mekan. Dusman yok");
            System.out.println("2. Magara ===> Karsiniza belki zombi cikabilir.");
            System.out.println("3. Orman ===> Karsiniza belki vampir cikabilir.");
            System.out.println("4. Nehir ===> Karsiniza belki ayi cikabilir.");
            System.out.println("5. Magaza ===> Silah ve ya zirh alabilirsiniz.");
            System.out.print("Gitmek istediginiz yer : ");
            int selLoc = input.nextInt(); // Gitmek istedigimiz yer icin secim komutunu girdigimiz alan
            while (selLoc < 0 || selLoc > 3){
                System.out.println("Lutfen gecerli bir yer seciniz");
                selLoc = input.nextInt();
            }
            switch (selLoc){
                case 1:
                    location = new SafeHouse(player); // eger 1 secilirse "Player" sinifindan olusan "player" nesnesi "SafeHouse" ta tanimlansin
                    break;
            }
        }
    }
}
