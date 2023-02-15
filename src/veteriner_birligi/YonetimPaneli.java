package veteriner_birligi;

public class YonetimPaneli<T> { // Demek istedigimiz ne ile ilgili bir cağrısım ya da metot yapacaksak onu buraya soylememiz gerekiyor.

   public void bilgileriGoster(T nesne){
       System.out.println(nesne);
   }

   public <T extends Musteri> void sahipOlduguHayvanlariGoster(T musteri){
       // T nin ne tip oldugunu bilmedigi icin T'nin Musteri sinifindan gelecgini belirttik
       //((T)musteri).musteriHayvanlariniListele(); bu kullanimda olur
       musteri.musteriHayvanlariniListele();
   }
}
