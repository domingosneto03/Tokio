package tokio;

import java.util.ArrayList;

public class Aluno {
    String nome;
    int idade;
    String curso;
    String numeroMatricula;
    public static ArrayList<Aluno> alunos = new ArrayList<>();

    //contrutor com valores padrão
    public Aluno() {
        nome = "indefinido";
        idade = 0;
        curso = "não inscrito";
        numeroMatricula = "TK???";
    }

    //construtor personalizado
    public Aluno(String nome, int idade, String curso, String numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
    }

    //metodo para adicionar um novo aluno a um array inicialmente vazio
    public void addAluno(String nome, int idade, String curso) {
        String numeroMatricula = matriculaBuilder();
        alunos.add(new Aluno(nome, idade, curso, numeroMatricula));
        System.out.println("Adicionou um novo aluno: " + nome);
    }

    //metodo para disponibilizar uma lista completa de alunos inscritos
    public void showAlunos(){
        if(alunos.size()==0)
            System.out.println("Sem alunos inscritos");
        for(Aluno x : alunos) {
            System.out.println(x.numeroMatricula + " | Nome: "+ x.nome + " | Curso: " + x.curso);
        }
    }

    //metodo para disponibilizar a lista de alunos que estão inscritos em determinada cadeira
    public void courseShowAlunos(String curso) {
        if(alunos.size()==0)
            System.out.println("Sem alunos inscritos");
        for(Aluno x : alunos) {
            if(x.curso.equals(curso))
                System.out.println(x.numeroMatricula + " | Nome: "+ x.nome + " | Curso: " + x.curso);
        }
    }
    //metodo para disponibilizar a informação de um aluno em específico fornencendo o see numero de matricula
    public void infoAluno(String numeroMatricula){
        if(alunos.size()==0)
            System.out.println("Sem alunos inscritos");
        for(Aluno x : alunos) {
            if(x.numeroMatricula.equals(numeroMatricula)) {
                System.out.println(x.numeroMatricula + " | Nome: "+ x.nome + " | Idade: " + x.idade + " | Curso: " + x.curso);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    //metodo optimizado para criar um numero de matricula unico e em série por ordemde adesão de alunos
    private String matriculaBuilder() {
        int n = alunos.size() + 1; //alunos.size()+1 representa o comprimento que a lista terá a contar com o novo aluno. Assim o seu número corresponderá ao número da matrícula por ordem de chegada.
        return "TK" + String.format("%03d", n);
    }
}

//primeira versão do método matriculaBuilder()
   /*
    private String matriculaBuilder() {
       int n = alunos.size()+1;
       int countDigits = 0;
       String resultado = null;
       while(n>0) {
          n/=10;
          countDigits += 1;
       }
       switch (countDigits) {
           case 1:
               resultado = "TK00" + String.valueOf(alunos.size()+1);
               break;
           case 2:
               resultado = "TK0" + String.valueOf(alunos.size()+1);
               break;
           case 3:
               resultado = "TK" + String.valueOf(alunos.size()+1);
               break;
       }
       return resultado;
    }
    */
