package MaceraOyunProjesi;

public class BattleLoc extends Location{
    protected Obstacle obstacle;
    protected String award;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println("Su anda buradasiniz: " +this.getName());
        System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " yasiyor");
        System.out.println("<S>avas veya <K>ac");
        String selCase = input.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")){

        }
        return false;
    }
    public boolean combat(int obsCount){
        for (int i = 0; i<obsCount; i++){
            int defObsHealth =obstacle.getHealthy();
            playerStats();
            enemyStatus();
            while (player.getHealthy() > 0 && obstacle.getHealthy() > 0){
                System.out.println("<V>ur veya <K>ac");
                String selCase = input.nextLine();
                selCase = selCase.toUpperCase();
                if (selCase.equals("V")){
                    System.out.println("Siz vurdunuz");
                    obstacle.setHealthy(obstacle.getHealthy() - player.getTotalDamage());
                    afterHit();
                }
                else {
                    return false;
                }
            }
            if (obstacle.getHealthy() < player.getHealthy()){
                System.out.println("Dusmani yendiniz ! ");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Guncel Paraniz : " + player.getMoney());
                obstacle.setHealthy(defObsHealth);
            }
            else{
                return false;
            }
            System.out.println("-------------");
        }
        return true;
    }

    public void playerStats(){ // Oyuncunun degerlerini bu fonksiyon ile ogrenebiliriz.
        System.out.println("Oyuncu degerleri \n ---------------");
        System.out.println("Can: " + player.getHealthy());
        System.out.println("Hasar: " + player.getTotalDamage());
        System.out.println("Para: " + player.getMoney());
        if (player.getInv().getDamage() > 0){
            System.out.println("Silah: " + player.getInv().getwName());
        }
        if (player.getInv().getArmor() > 0){
            System.out.println("Zirh: " + player.getInv().getaName());
        }
    }
    public void enemyStatus(){
        System.out.println("\n" + obstacle.getName() + " Degerleri\n---------");
        System.out.println("Can: " + obstacle.getHealthy());
        System.out.println("Hasar: " + obstacle.getDamage());
        System.out.println("Odul: " + obstacle.getAward());
    }
    public void afterHit(){
        System.out.println("Oyuncu cani: " + player.getHealthy());
        System.out.println(obstacle.getName() + " Cani : " + obstacle.getHealthy());
    }
}
