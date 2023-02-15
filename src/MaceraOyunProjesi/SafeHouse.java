package MaceraOyunProjesi;

public class SafeHouse extends NormalLoc{
     SafeHouse(Player player) { // Name extend ettik ama istedigimiz sekilde vermek icin kendimiz ayarlıyoruz.
        super(player, "Safe House");
    }

    @Override
    public boolean getLocation() {
        player.setHealthy(player.getrHealthy()); // playerin setHealthy'sini, getHealthy diye degistirdik.
        System.out.println("Iyilestiniz...");
        System.out.println("Su an guvenli ev adli yerdesiniz");
        return true;
    }
}
