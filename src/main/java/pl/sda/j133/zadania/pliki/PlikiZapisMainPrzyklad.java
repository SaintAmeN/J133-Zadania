package pl.sda.j133.zadania.pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 06.11.2022
 */
public class PlikiZapisMainPrzyklad {
    public static void main(String[] args) {
        try {
            PrintWriter drukarkaTekstu = new PrintWriter("plik_zapisany.txt");

            drukarkaTekstu.println("Hello world!");

            drukarkaTekstu.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
