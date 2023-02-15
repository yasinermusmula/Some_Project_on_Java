package MaceraOyunProjesi;

import java.util.Scanner;

abstract public class Location {
    protected Player player;
    protected String name;
    Scanner input = new Scanner(System.in);

    public Location(Player player){ // Constructor olusturup,"Player" sinifindan olusan, "player" nesnesini
       this.player = player;
    }
    public abstract boolean getLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
