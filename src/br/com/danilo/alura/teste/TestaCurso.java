package br.com.danilo.alura.teste;

import br.com.danilo.alura.Aula;
import br.com.danilo.alura.Curso;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayLists", 21));
        System.out.println(javaColecoes.getAulas());
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayLists", 21)); // Agora lança: java.lang.UnsupportedOperationException
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayLists", 21)); // isso aqui não é tao bonito :/

        javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionaAula(new Aula("Modelando com coleções", 20));

        System.out.println(javaColecoes.getAulas());
    }
}
