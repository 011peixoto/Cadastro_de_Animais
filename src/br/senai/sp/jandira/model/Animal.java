package br.senai.sp.jandira.model;

import javax.swing.*;
import java.util.*;

public class Animal {
    String nome, sexo, especie;
    Animal animal = new Animal();
    int idade;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimal() {
        System.out.println("/--------- Cadastrar Animal --------/");
        System.out.println("Informe o nome do animal:            ");
        nome = scanner.nextLine();
        System.out.println("Informe a idade do animal");
        idade = scanner.nextInt();
        System.out.println("Informe o sexo do animal:            ");
        sexo = scanner.nextLine();
        System.out.println("informe a Especie do animal:         ");
        especie = scanner.nextLine();

    }

    public void listarAnimal() {

        System.out.println("listar animal");
        System.out.println("listar Nome do animal" + nome);
        System.out.println("listar Idade do animal" + idade);
        System.out.println("listar sexo do animal" + sexo);
        System.out.println("listar especie do animal" + especie);
    }

    public void adicionarAnimais() {
        listAnimal.add(animal);
    }
}
