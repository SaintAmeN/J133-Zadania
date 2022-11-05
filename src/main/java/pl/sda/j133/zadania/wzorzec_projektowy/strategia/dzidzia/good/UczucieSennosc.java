package pl.sda.j133.zadania.wzorzec_projektowy.strategia.dzidzia.good;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
public class UczucieSennosc implements Uczucie {
    @Override
    public String czegoPotrzebuje() {
        return "loguje do śpiulkolota (spać)";
    }
}
