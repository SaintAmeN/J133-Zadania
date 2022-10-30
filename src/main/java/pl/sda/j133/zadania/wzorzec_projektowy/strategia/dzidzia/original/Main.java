package pl.sda.j133.zadania.wzorzec_projektowy.strategia.dzidzia.original;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 *
 * Wzorzec projektowy strategia.
 */
public class Main {
    public static void main(String[] args) {
        Dziecko dziecko = new Dziecko("Marian", Dziecko.Uczucie.DYSKOMFORT);
        dziecko.czegoPotrzebuje();

        dziecko.setUczucie(Dziecko.Uczucie.SENNOŚĆ);
        dziecko.czegoPotrzebuje();

        dziecko.setUczucie(Dziecko.Uczucie.DYSKOMFORT);
        dziecko.czegoPotrzebuje();
        dziecko.setUczucie(Dziecko.Uczucie.GŁÓD);
        dziecko.czegoPotrzebuje();
    }
}
