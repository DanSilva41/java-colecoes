package br.com.danilo.alura.teste;

import br.com.danilo.alura.Aluno;
import br.com.danilo.alura.Aula;
import br.com.danilo.alura.Curso;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com a matricula 20181231?");
        Aluno alunoBuscado = javaColecoes.buscarMtriculado(20181231);
        System.out.println(alunoBuscado);

//        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
    }
}
