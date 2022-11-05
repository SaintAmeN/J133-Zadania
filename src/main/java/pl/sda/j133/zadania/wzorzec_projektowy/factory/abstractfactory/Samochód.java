package pl.sda.j133.zadania.wzorzec_projektowy.factory.abstractfactory;

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

    Samochód(String marka, String model, String color, double pojemność, int moc) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.pojemność = pojemność;
        this.moc = moc;
    }
}
