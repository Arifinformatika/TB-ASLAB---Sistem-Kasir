package project.sistem.kasir;

public class Data {
    Person [] kasir = new Person[5];
    Person [] member = new Person[5];
    Barang[] barangBaru = new Barang[5];
    
    void data_barang() {
        for (int i=0;i<5;i++){
            barangBaru[i]= new Barang();
            kasir[i]= new Person();
            member[i]= new Person();
        }
        
    }
}
