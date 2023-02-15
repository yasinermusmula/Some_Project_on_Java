package HastaneUygulamasi;

public class Hastalar extends Kisi{
    private String hastaligi;
    public Hastalar(String name, String sehir, int yas, String hastaligi) {
        super(name, sehir, yas);
        this.hastaligi = hastaligi;
    }

    public String getHastaligi() {
        return hastaligi;
    }

    public void setHastaligi(String hastaligi) {
        this.hastaligi = hastaligi;
    }

    @Override
    public void generalInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " " +getHastaligi();
    }
}
