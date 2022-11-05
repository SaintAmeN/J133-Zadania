package pl.sda.j133.zadania.wzorzec_projektowy.factory.factorymethod;

import lombok.Data;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@Data
public class Samochód {
    private String marka;
    private String model;
    private String color;
    private double pojemność;
    private int moc;

    private Samochód(String marka, String model, String color, double pojemność, int moc) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.pojemność = pojemność;
        this.moc = moc;
    }

    public static Samochód stwórzSamochódAudi() {
        return new Samochód("Audi", "A3", "Czarne", 1.9, 110);
    }
    public static Samochód stwórzSamochódBMW() {
        return new Samochód("BMW", "E91", "Srebrny", 2.0, 150);
    }
    public static Samochód stwórzSamochódMazde() {
        return new Samochód("Mazda", "MX-5", "Sraczkowaty", 1.6, 120);
    }
}
