package pl.sda.j133.zadania.wzorzec_projektowy.strategia.dzidzia.good;


/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 *
 * Wzorzec projektowy strategia.
 */
public class Main {
    public static void main(String[] args) {
        Dziecko dziecko = new Dziecko("Marian", new UczucieGlod());
        dziecko.czegoPotrzebuje();

        dziecko.setUczucie(new UczucieSennosc());
        dziecko.czegoPotrzebuje();

        dziecko.setUczucie(new UczucieGlod());
        dziecko.czegoPotrzebuje();

        dziecko.setUczucie(new UczucieDyskomfort());
        dziecko.czegoPotrzebuje();
    }
}
