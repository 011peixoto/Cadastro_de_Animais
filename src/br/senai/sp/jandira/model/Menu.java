package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void  controleAnimal(){
        System.out.println("/--------------T_T--------------/");
        System.out.println("1- Cadastrar animal:             ");
        System.out.println("2- Listar animal:                ");
        System.out.println("3- sair;                         ");

        int optionUser = scanner.nextInt();
        switch (optionUser){
            case 1:
                Animal animal = new Animal();
                animal.cadastrarAnimal();

                case 2:

        }
    }
}
