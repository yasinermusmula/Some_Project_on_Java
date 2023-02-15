package HastaneUygulamasi;

abstract public class Kisi {
    private String name,sehir;
    private int yas;

    public Kisi(String name, String sehir, int yas) {
        this.name = name;
        this.sehir = sehir;
        this.yas = yas;
    }
    public abstract void generalInfo();

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return name + " " + sehir + " " + yas;
    }
}
