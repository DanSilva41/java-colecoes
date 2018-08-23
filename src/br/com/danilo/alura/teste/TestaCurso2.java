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
        javaColecoes.adicionaAula(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas(); // será possível somente ler
        System.out.println(aulasImutaveis);
//        Collections.sort(aulasImutaveis); // Não é possível ordenar pois ela é imutavel

        List<Aula> aulas = new ArrayList<>(aulasImutaveis); // construtor que recebe uma lista

        Collections.sort(aulas); // Agora é possivel ordenar
        System.out.println(aulas);

        System.out.println("Tempo total das aulas: "+ javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

//        Collections.reverse(aulas); // Inverter a ordem
//        Collections.shuffle(aulas); // embaralhar
        Collections.singletonList(aulas); // devolve uma lista imutável que contêm um único elemento especificado
    }
}
