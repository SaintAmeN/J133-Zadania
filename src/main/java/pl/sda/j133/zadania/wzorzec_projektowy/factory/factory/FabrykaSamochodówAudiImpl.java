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
public class FabrykaSamochodówAudiImpl implements FabrykaSamochodów{

    @Override
    public Samochód stwórzSamochód() {
        return new Samochód("Audi", "A3", "Czarne", 1.9, 110);
    }
}
