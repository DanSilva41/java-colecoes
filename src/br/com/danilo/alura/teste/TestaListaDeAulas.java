package br.com.danilo.alura.teste;

import br.com.danilo.alura.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Lista de objetos",15);
        Aula a3 = new Aula("Relacionamento de listas e objetos",20);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas); // Ordenando a lista de Aulas
        System.out.println(aulas);

        // utilizando a interface Comparator para usar outro criterio de comparacao
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
