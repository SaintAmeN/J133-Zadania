package pl.sda.j133.zadania.zad_lista_zadan;


import pl.sda.j133.zadania.wzorzec_projektowy.factory.factorymethod.Samochód;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class MainTestMetodyFactory {
    public static void main(String[] args) {
        Samochód samochód1 = Samochód.stwórzSamochódAudi();
        Samochód samochód2 = Samochód.stwórzSamochódMazde();
        Samochód samochód3 = Samochód.stwórzSamochódBMW();
    }
}