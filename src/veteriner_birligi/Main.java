package veteriner_birligi;

public class Main {
    public static void main(String[] args) {

        ilkNesneleriOlustur();

    }

    public static void ilkNesneleriOlustur() {
        Kedi kedi = new Kedi("1996",true,"Van Kedisi");
        //kedi.bilgileriGoster();
        //System.out.println(kedi);// Sadece kedi sinifina ait olanlar yazdirilir. Cunku "toString()" metodunda sadece bunlar belirtilmiştir.
        Kedi kedi2 = new Kedi("1997",false,"Ankara Kedisi");
        Kedi kedi3 = new Kedi("1995",true,"Scotish Kedisi");

        Kopek kopek = new Kopek("1994",true,"Golden",3);
        Kopek kopek2 = new Kopek("1990",true,"Pitbull",3);
        Kopek kopek3 = new Kopek("2002",true,"Bulldog",3);
        //kopek.bilgileriGoster();

        Musteri m1 = new Musteri("Yasin","12345","Izmir");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);
        Musteri m2 = new Musteri("Ayse","67890","Istanbul");
        m1.musteriHayvanlariniListele();
        //m2.musteriyeHayvanEkle(kedi2);
        //m2.musteriyeHayvanEkle(kopek2);
        Musteri m3 = new Musteri("Veli","32156","Ankara");
        //m3.musteriyeHayvanEkle(kedi3);
        //m3.musteriyeHayvanEkle(kopek3);

        // Burda onemli olan Arraylist nereye yazacagımız ve ekleme cıkarma metotlarini nasil yapcagımızdır.

        Veteriner vt1 = new Veteriner("Kemal","79435","Dokuz Eylul",5);
        vt1.musteriEkle(m1);
        Veteriner vt2 = new Veteriner("Fatma","65482","Ege",5);
        Veteriner vt3 = new Veteriner("Nuri","321095","Marmara",5);
        vt1.kendiniTanit();

        SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("Ankara");
        ankara.sehireVeterinerEkle(vt1);
        ankara.sehireVeterinerEkle(vt2);
        SehirVeterinerlikleri izmir = new SehirVeterinerlikleri("Izmir");
        izmir.sehireVeterinerEkle(vt3);

        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();

        System.out.println("Yonetim paneli basliyor.");
        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        // Generic sinifta olusturdugumuz tip icin nesne olustururken hangi sinifi tanimliyorsak o siniftan nesne olusturmamız gerek.
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        hayvanYonetimPaneli.bilgileriGoster(kopek);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m1);

        musteriYonetimPaneli.sahipOlduguHayvanlariGoster(m1);


//        YonetimPaneli<Veteriner> veterinerYonetimPaneli = new YonetimPaneli<>();
//        veterinerYonetimPaneli.bilgileriGoster(vt1);
//        veterinerYonetimPaneli.bilgileriGoster(vt2);

    }

}
