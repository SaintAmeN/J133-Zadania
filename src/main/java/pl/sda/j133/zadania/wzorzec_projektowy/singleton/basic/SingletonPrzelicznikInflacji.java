package pl.sda.j133.zadania.wzorzec_projektowy.singleton.basic;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class SingletonPrzelicznikInflacji {
    public static final SingletonPrzelicznikInflacji INSTANCE = new SingletonPrzelicznikInflacji();


    public double getInflacja(){
        return 20.0;
    }
}
