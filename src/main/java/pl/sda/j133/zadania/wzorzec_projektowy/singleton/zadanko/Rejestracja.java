package pl.sda.j133.zadania.wzorzec_projektowy.singleton.zadanko;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class Rejestracja /*implements GeneratorNumerków*/{
    /*@Override*/
    public int nextNumerek() {
        return SingletonGenerator.INSTANCE.getNextNr();
    }
}
