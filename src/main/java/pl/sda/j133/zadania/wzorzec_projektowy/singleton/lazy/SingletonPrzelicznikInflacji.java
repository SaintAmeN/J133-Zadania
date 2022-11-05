package pl.sda.j133.zadania.wzorzec_projektowy.singleton.lazy;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class SingletonPrzelicznikInflacji {
    private static SingletonPrzelicznikInflacji INSTANCE;

    public static SingletonPrzelicznikInflacji getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonPrzelicznikInflacji();
        }
        return INSTANCE;
    }

    public double getInflacja() {
        return 20.0;
    }
}
