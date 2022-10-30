package pl.sda.j133.zadania;

import pl.sda.j133.zadania.zad_lista_zadan.ListaZadanDoZrealizowania;
import pl.sda.j133.zadania.zad_lista_zadan.Zadanie;

import java.util.Optional;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
public class Main {
    public static void main(String[] args) {
        ListaZadanDoZrealizowania listaZadan = new ListaZadanDoZrealizowania();
//        Zadanie z = listaZadan.znajdzZadanie("pawel");
//        if (z != null) {
//            // NullPointerException
//            System.out.println(z.getTresc());
//        }

        Optional<Zadanie> optionalZadanie = listaZadan.znajdzZadanie("pawel");
        if (optionalZadanie.isPresent()) {
            System.out.println(optionalZadanie.get().getTresc());
        }

    }
}
