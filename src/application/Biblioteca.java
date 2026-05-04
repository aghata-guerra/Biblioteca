package application;

import program.Edicao;
import program.Livro;
import program.Midia;

public class Biblioteca {

    public static void main(String[] args) {

        Livro l1 = new Livro(1, "É fácil matar", "Suspense");
        Livro l2 = new Livro(2, "Dom Casmurro", "Romance");
        Midia m1 = new Midia(1, "Papel");
        Midia m2 = new Midia(2, "PDF");
        Midia m3 = new Midia(3, "Áudio");
        Edicao e1 = new Edicao(1, 2020, l1, m1);
        Edicao e2 = new Edicao(2, 2021, l1, m2);
        Edicao e3 = new Edicao(3, 2022, l2, m3);
        Edicao e4 = new Edicao(4, 2023, l2, m2);
        Edicao e5 = new Edicao(5, 2024, l2, m1);

        System.out.println("===Realizando empréstimo do livro===");
        validarEmprestimo(e1);
        System.out.println();
        System.out.println("===Realizando empréstimo do livro===");
        validarEmprestimo(e2);
        System.out.println();
        System.out.println("===Realizando empréstimo do livro===");
        validarEmprestimo(e3);
        System.out.println();

        System.out.println("===Realizando Devolução do livro===");
        validarDevolucao(e2);

        mostrar(e1);
        mostrar(e2);
        mostrar(e3);
        mostrar(e4);
        mostrar(e5);
    }

    static void validarEmprestimo(Edicao e) {

        if (e.emprestimo("04/05/2026")) {
            System.out.println("Emprestimo realizado.");
        } else {
            System.out.println("Exemplar não está disponível.");
        }

    }

    static void validarDevolucao(Edicao e) {

        if (e.devolucao()) {
            System.out.println("Devolução realizada.");
        } else {
            System.out.println("Exemplar não está emprestado.");
        }
    }

    static void mostrar(Edicao e){
        System.out.println(
                "Titulo: "+e.getLivro().getTitulo()+
                        " | Assunto do livro: "+e.getLivro().getAssunto()+
                        " | Ano: "+e.getAno()+
                        " | Situação: "+(e.getSituacao()=='E'? "Emprestado.": "Disponível.")+
                        " | Descrição da Midia: "+e.getMidia().getDescricao()
        );
    }
}
