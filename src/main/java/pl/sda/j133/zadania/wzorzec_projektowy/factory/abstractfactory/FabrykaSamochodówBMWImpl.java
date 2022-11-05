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
public abstract class FabrykaSamochodówBMWImpl /*implements FabrykaSamochodów*/ {

    /*@Override*/
    public static Samochód stwórzSamochód() {
        return new Samochód("BMW", "E91", "Srebrny", 2.0, 150);
    }
}
