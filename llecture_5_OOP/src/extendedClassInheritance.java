public class extendedClassInheritance extends InheritanceLecture {

    extendedClassInheritance(){
        System.out.println("Kişi oluşturuldu.");

    }


    @Override
    public void eatFood(){
        System.out.println("Yemek genişletilmiş olarak yendi.");
    }//polymorphism örneğidir. Ata sınıftan alınan metod ezilerek değiştirildi.
}
