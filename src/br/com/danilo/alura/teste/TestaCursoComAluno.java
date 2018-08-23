package br.com.danilo.alura.teste;

import br.com.danilo.alura.Aluno;
import br.com.danilo.alura.Aula;
import br.com.danilo.alura.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionaAula(new Aula("Modelando com coleções", 24));

        Aluno aluno1 = new Aluno("Thais Fernanda", 20165491);
        Aluno aluno2 = new Aluno("Letícia Silva", 20181231);
        Aluno aluno3 = new Aluno("William Pereira", 20171651);

        javaColecoes.matricular(aluno1);
        javaColecoes.matricular(aluno2);
        javaColecoes.matricular(aluno3);

        System.out.println("Todos os alunos matriculados:");

        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.println("O aluno "+ aluno3.getNome() + " está matriculado? " +javaColecoes.estaMatriculado(aluno1));

        Aluno william = new Aluno("William Pereira", 20171651);
        System.out.println("E esse William, está matriculado? " +javaColecoes.estaMatriculado(william));
        System.out.println("O aluno3 é igual a William: "+ aluno3.equals(william));

        // Antes do Java 8
        for (Aluno aluno : javaColecoes.getAlunos()) {
            System.out.println(aluno);
        }

        // Antes do Java 5 - usando Iterator
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }


    }
}
