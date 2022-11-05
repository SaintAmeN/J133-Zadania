package pl.sda.j133.zadania.wzorzec_projektowy.factory.factory;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 *
 * Abstract Factory
 * Factory
 * Factory Method
 */
public class FabrykaSamochodówBMWImpl implements FabrykaSamochodów{

    @Override
    public Samochód stwórzSamochód() {
        return new Samochód("BMW", "E91", "Srebrny", 2.0, 150);
    }
}
