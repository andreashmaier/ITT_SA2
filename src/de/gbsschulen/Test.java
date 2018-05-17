package de.gbsschulen;

public class Test {
    public static void main(String[] args) {
        System.out.println("Viel Glück!");

        ArtikelService artikelService = new ArtikelService();
        Artikel artikel = artikelService.find(1079);
        System.out.println(artikel.getBezeichnung());
        artikelService.close();

    }
}
