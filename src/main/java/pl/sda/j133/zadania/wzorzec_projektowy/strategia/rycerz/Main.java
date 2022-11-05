package pl.sda.j133.zadania.wzorzec_projektowy.strategia.rycerz;

import pl.sda.j133.zadania.wzorzec_projektowy.singleton.enumerated.SingletonPrzelicznikInflacji;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater();
        bohater.setStrategiaWalki(new WalkaMieczem());
        bohater.walcz();

        bohater.setStrategiaWalki(new Ucieczka());
        bohater.walcz();

        bohater.setStrategiaWalki(new WalkaMieczem());
        bohater.walcz();

        double inflacja = SingletonPrzelicznikInflacji.INSTANCE.getInflacja();
    }
}
