package com.mycompany.livrodenotas;

import java.util.Scanner;

class LivroDeNotas {

    private int numeroAlunos;

    public static void main(String[] args) {

        LivroDeNotas livro = new LivroDeNotas();

        Scanner ler = new Scanner(System.in);

        System.out.print("Qual o número de alunos? ");
        int numeroDeAlunos = ler.nextInt();

        livro.setNumeroAlunos(numeroDeAlunos);

        livro.calcularMediaDeCadaAluno(livro, ler);

        System.out.println("\n\n:)");
        
        ler.close();

    }

    public int getNumeroAlunos() {

        return numeroAlunos;

    }

    public void setNumeroAlunos(int numeroAlunos) {

        this.numeroAlunos = numeroAlunos;

    }

    public void calcularMediaDeCadaAluno(LivroDeNotas livro, Scanner ler) {

        double[] mediaAlunos = new double[livro.getNumeroAlunos()];
        double totalNotasGeral = 0;

        for (int i = 0; i < livro.getNumeroAlunos(); i++) {
            
            double totalNotaAluno = 0;

            System.out.println("\n" + (i + 1) + "º ALUNO");

            for (int j = 0; j < 3; j++) {

                System.out.print((j + 1) + "º NOTA: ");
                double notas = ler.nextDouble();

                totalNotaAluno += notas;
                totalNotasGeral += notas;

            }

            mediaAlunos[i] = totalNotaAluno / 3;

        }

        int contador = 1;
         System.out.println("");

        for (double media : mediaAlunos) {

            System.out.printf("Média " + contador + "º aluno: %.2f", media);
            System.out.print(" pontos");
            System.out.println("");

            contador++;

        }

        livro.calcularMediaDaTurma(totalNotasGeral, livro);

    }

    public void calcularMediaDaTurma(double total, LivroDeNotas livro) {

        double mediaDaTurma = total / livro.getNumeroAlunos();

        System.out.printf("\nMédia da Turma: %.2f", mediaDaTurma);
        System.out.print(" pontos");

    }

}
