package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.good;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class PrzelicznikInflacji {
    public static PrzelicznikInflacji INSTANCE = new PrzelicznikInflacji();

    public double getInflacja(){
        return 20.0;
    }
}
