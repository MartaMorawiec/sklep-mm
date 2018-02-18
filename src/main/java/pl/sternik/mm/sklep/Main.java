package pl.sternik.mm.sklep;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Article produkt = new Article(3, "Mleko", "Mleko tłuste 3.5%", 3.5);
        out.println(produkt.toString());
        out.println(produkt.getCounter());

    }
}
