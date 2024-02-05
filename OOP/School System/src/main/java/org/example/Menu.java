package org.example;

import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    Aluno aluno = new Aluno();

    //menu principal com as funcionalidades do programa
    public void mainMenu() {
        System.out.println("O que deseja fazer?" +
                "\n\t (1) Adicionar um novo aluno" + //funcionalidades (2) e (3) não funcionam sem primeiro adicionar pelo menos um aluno
                "\n\t (2) Verificar lista de alunos" +
                "\n\t (3) Verificar informação de um aluno" +
                "\n\t (4) Sair");
        int choice = Integer.parseInt(in.nextLine());

        if(choice == 1)
            addAlunoMenu();
        else if(choice == 2)
            listaMenu();
        else if(choice == 3)
            infoAlunoMenu();
        else if(choice == 4)
            System.exit(0); //termina o programa
        else {
            System.out.println("Opção inválida. Tente novamente.");
            mainMenu();
        }

    }

    private void infoAlunoMenu() {
        System.out.println("Escreva o número da matrúcla do aluno. (ex: TK001)" +
                "\n Em caso de dúvida: Ver lista completa de alunos onde se encontram os números de matrícula");
        String inputNumeroMatricula = in.nextLine();
        aluno.infoAluno(inputNumeroMatricula);
        mainMenu();
    }

    private void listaMenu() {
        System.out.println("Escolha uma das opções seguintes:" +
                "\n\t (1) Ver lista completa de alunos" +
                "\n\t (2) Ver lista de alunos por curso" +
                "\n\t (3) Voltar");
        int choice = Integer.parseInt(in.nextLine());
        if(choice==1)
            aluno.showAlunos();
        else if (choice==2){
            System.out.println("Selecione o curso " +
                    "\n\t (1) Engenharia" +
                    "\n\t (2) Direito" +
                    "\n\t (3) Medicina" +
                    "\n\t (4) Economia");

            int option = Integer.parseInt(in.nextLine());
            String inputCurso = escolhaCurso(option);
            aluno.courseShowAlunos(inputCurso);
        }
        else if (choice==3)
            mainMenu();
        else
            System.out.println("Opção inválida. Tente novamente.");
        listaMenu();
    }

    private void addAlunoMenu() {
        System.out.println("Escreva o primeiro e último nome do novo aluno. (ex: Domingos Neto)");
        String inputNome = in.nextLine();
        System.out.println("Escreva a idade do novo aluno (ex: 18)");
        int inputIdade = Integer.parseInt(in.nextLine());
        System.out.println("Selecione entre os seguintes cursos qual o novo aluno irá se inscrever. " +
                "\n\t (1) Engenharia" +
                "\n\t (2) Direito" +
                "\n\t (3) Medicina" +
                "\n\t (4) Economia");
        int option = Integer.parseInt(in.nextLine());
        String inputCurso = escolhaCurso(option);
        aluno.addAluno(inputNome, inputIdade, inputCurso);
        mainMenu();
    }
    //método para transofrmar a escolha numa string
   private String escolhaCurso(int option) {
        String res = "";
        switch(option) {
            case 1:
               res += "Engenharia";
               break;
            case 2:
                res += "Direito";
                break;
            case 3:
                res += "Medicina";
                break;
            case 4:
                res += "Economia";
                break;
        }
        return res;
   }
}
