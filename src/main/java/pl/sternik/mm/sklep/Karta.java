package pl.sternik.mm.sklep;

public class Karta implements Platnosc {
    @Override
    public boolean zaplac(double kwota){
        System.out.println("Platnosc karta dziala");
        return true;
    }
}
