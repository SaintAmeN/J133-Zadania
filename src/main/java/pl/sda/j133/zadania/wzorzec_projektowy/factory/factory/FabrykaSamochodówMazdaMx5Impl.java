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
public class FabrykaSamochodówMazdaMx5Impl implements FabrykaSamochodów{

    @Override
    public Samochód stwórzSamochód() {
        return new Samochód("Mazda", "MX-5", "Sraczkowaty", 1.6, 120);
    }
}
