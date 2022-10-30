package pl.sda.j133.zadania.zad_lista_zadan;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
class ListaZadanDoZrealizowaniaTest {

    @Test
    void dodawanieSzukanieIUsuwanieZadanDziala() {
        ListaZadanDoZrealizowania lista = new ListaZadanDoZrealizowania();

        // preparation - przygotowanie
        lista.dodajZadanie(new Zadanie("nazwa-1", "tresc zadania nazwa-1"));
        lista.dodajZadanie(new Zadanie("2-nazwa", "inna tresc zadania 2-nazwa"));

        // assertion - weryfikacja
        assertFalse(lista.znajdzZadanie("nazwa-3"));
        assertFalse(lista.znajdzZadanie("nazwa-2"));

        assertTrue(lista.znajdzZadanie("2-nazwa"));
        assertTrue(lista.znajdzZadanie("nazwa-1"));

        Optional<Zadanie> optionalZadanie = lista.zwrocZadanie("2-nazwa");
        assertTrue(optionalZadanie.isPresent());

        Zadanie zadanie = optionalZadanie.get();
        assertEquals("inna tresc zadania 2-nazwa", zadanie.getTresc()); // weryfikacja treści

        // assertion - weryfikacja usunięcia obiektu
        lista.usunZadanie("2-nazwa");
        Optional<Zadanie> optionalZadaniePoUsunieciu = lista.zwrocZadanie("2-nazwa");
        assertFalse(optionalZadaniePoUsunieciu.isPresent());

    }
}