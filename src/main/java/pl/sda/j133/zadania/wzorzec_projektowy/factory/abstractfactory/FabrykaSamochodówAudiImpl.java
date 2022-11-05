package pl.sda.j133.zadania.wzorzec_projektowy.factory.abstractfactory;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 *
 * Abstract Factory
 * Factory
 * Factory Method
 */
public abstract class FabrykaSamochodówAudiImpl /*implements FabrykaSamochodów*/ {

    /*@Override*/
    public static Samochód stwórzSamochód() {
        return new Samochód("Audi", "A3", "Czarne", 1.9, 110);
    }
}
