package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Animal;
import br.senai.sp.jandira.model.Menu;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Menu menu = new Menu();
        menu.controleAnimal();
    }
}
