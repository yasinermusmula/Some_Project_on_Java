package HastaneUygulamasi;

public class Doktorlar extends Kisi{
    private String mezunOlduguOkul;
    public Doktorlar(String name, String sehir, int yas, String mezunOlduguOkul) {
        super(name, sehir, yas);
        this.mezunOlduguOkul = mezunOlduguOkul;
    }

    public String getMezunOlduguOkul() {
        return mezunOlduguOkul;
    }

    public void setMezunOlduguOkul(String mezunOlduguOkul) {
        this.mezunOlduguOkul = mezunOlduguOkul;
    }

    @Override
    public void generalInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
