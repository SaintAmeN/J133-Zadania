package pl.sda.j133.zadania.wzorzec_projektowy.singleton;

import pl.sda.j133.zadania.wzorzec_projektowy.singleton.lazy.SingletonPrzelicznikInflacji;
import pl.sda.j133.zadania.wzorzec_projektowy.singleton.zadanko.Poczta;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class Main {
    public static void main(String[] args) {
        // Singleton
        //
        // Definicja:
        //      Wzorzec który adresuje problem (wymuszenia) istnienia JEDNEJ instancji obiektu dla całego projektu.
        //      Dana instancja NIE POWINNA BYĆ MOŻLIWA DO STWORZENIA w ŻADNEJ innej części kodu. Każdy powinien mieć
        //      możliwość używania tej instancji w dowolnym miejscu w kodzie.
        //
        // Jaki problem rozwiązuje:
        //  - tworzy JEDEN obiekt danego typu
        //  - tworzy jeden obiekt danego typu w trybe eager lub lazy TODO:
        //  - daje dostęp do intancji JEDNEGO obiektu w całym kodzie dla każdego [inżyniera]
        //
        // Kiedy używać:
        //

        int zmienna = 5;

        double inflacjaX = SingletonPrzelicznikInflacji.getInstance().getInflacja();
        for (int i = 0; i < zmienna; i++) {
            System.out.println(5);
        }

        inflacjaX = SingletonPrzelicznikInflacji.getInstance().getInflacja();

        System.out.println("Cześć");


        Poczta p = new Poczta();
        int numerek = p.getNumerekAutomat();

        List<Poczta> list = new ArrayList<Poczta>();


        for (int i = 0; i < 4; i++) {
            list.add(new Poczta());
        }


        System.out.println(numerek);

    }
}
