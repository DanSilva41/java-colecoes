package br.com.danilo.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
//    private Set<Aluno> alunos = new LinkedHashSet<>(); // retorna um conjunto ordenado
//    private Set<Aluno> alunos = new TreeSet<>(); // retorna um conjunto ordenado; o objeto d conjunto precisa implementar Comparable
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        if(nome == null) {
            throw new NullPointerException("O nome do curso não pode ser nulo");
        }
        if(instrutor == null) {
            throw new NullPointerException("O nome do instrutor não pode ser nulo");
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // Devolver uma lista somente de leitura
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adicionaAula(Aula novaAula) {
        this.aulas.add(novaAula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // Recurso poderoso
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
    }

    public void matricular(Aluno novoAluno) {
        this.alunos.add(novoAluno);
        this.matriculaParaAluno.put(novoAluno.getNumeroMatricula(), novoAluno);
    }

    public  boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", tempo total='" + getTempoTotal() + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public Aluno buscarMtriculado(int numero) {
        if(!this.matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("Matricula nao encontrado: "+ numero);
        return this.matriculaParaAluno.get(numero);
    }
}
