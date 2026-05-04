package program;

public class Edicao {

    private int idEdicao;
    private int ano;
    private char situacao;
    private String ultimoEmprestimo;
    private Livro livro;
    private Midia midia;

    public Edicao(int idEdicao, int ano, Livro livro, Midia midia) {
        this.idEdicao = idEdicao;
        this.ano = ano;
        this.situacao = 'D';
        this.livro = livro;
        this.midia = midia;
    }

    public int getIdEdicao() {
        return idEdicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getSituacao() {
        return situacao;
    }

    public String getUltimoEmprestimo() {
        return ultimoEmprestimo;
    }

    public Midia getMidia() {
        return midia;
    }

    public Livro getLivro() {
        return livro;
    }

    public boolean emprestimo(String ultimoEmprestimo){
        this.ultimoEmprestimo = ultimoEmprestimo;
        if (situacao == 'D') {
            situacao = 'E';
            return true;
        }
        return false;
    }

    public boolean devolucao(){
        if (situacao == 'E') {
            situacao = 'D';
            return true;
        }
        return false;
    }

}
