// To bedzie controller ktory bedzie umozliwial przechdozenie po oknach
// jako ze nie umiem zrobic tego na stale bede musial zaimportowac kod do kazdej z funkcji oddzielnie
// wiec oszczedzi to sporo miejsca, czasu i bedzie ladnie wygladac
// narazie po kliknieciu w konsoli wyswietla sie napis

package sample.Controllers;

import javafx.event.ActionEvent;
public class FunctionsButtonController {

    public void funtionFirstController(ActionEvent event){
        System.out.println("Funkcja pierwsza");

    }
    public void functionSecondController(ActionEvent event){
        System.out.println("Funkcja druga");
    }
    public void functionThirdController(ActionEvent event){
        System.out.println("Funkcja Trzecia");
    }

}
