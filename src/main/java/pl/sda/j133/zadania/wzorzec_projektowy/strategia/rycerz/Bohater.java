package pl.sda.j133.zadania.wzorzec_projektowy.strategia.rycerz;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
public class Bohater {
    private String imie;
    private StrategiaWalki strategiaWalki;

    public void setStrategiaWalki(StrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz(){
        System.out.println(strategiaWalki.walcz());;
    }
}
