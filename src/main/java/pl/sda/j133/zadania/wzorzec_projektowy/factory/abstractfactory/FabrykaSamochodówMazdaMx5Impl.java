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
public abstract class FabrykaSamochodówMazdaMx5Impl {
    public static Samochód stwórzSamochód() {
        return new Samochód("Mazda", "MX-5", "Sraczkowaty", 1.6, 120);
    }
}
