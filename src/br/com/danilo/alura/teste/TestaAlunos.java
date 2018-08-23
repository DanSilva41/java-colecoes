package br.com.danilo.alura.teste;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

    public static void main(String[] args) {
//        Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>(); // mais generico
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Sergio Lopes");
        alunos.add("Sergio Lopes"); // Somente um Sergio Lopes estará presente no conjunto

        alunos.forEach(aluno -> System.out.println(aluno));

        boolean pauloEstaMatriculado = alunos.contains("Nico Steppat");
        System.out.println(pauloEstaMatriculado);
    }
}
