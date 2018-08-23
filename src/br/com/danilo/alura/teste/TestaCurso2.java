package br.com.danilo.alura.teste;

import br.com.danilo.alura.Aula;
import br.com.danilo.alura.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionaAula(new Aula("Modelando com comleções", 20));

        List<Aula> aulasImutaveis = javaColecoes.getAulas(); // será possível somente ler
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis); // construtor que recebe uma lista

        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
