/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author vinys
 */
public class Livro implements Publicacao{
    private Pessoa leitor;
    private String titulo, autor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;

    public Livro(Pessoa leitor, String titulo, String autor, int totalPaginas) {
        this.leitor = leitor;
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
    }
    
    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página Atual: " + this.getPaginaAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + leitor.getNome());
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.getTotalPaginas()>= p) {
            this.paginaAtual = p;
        } else {
            System.out.println("impossível folhear");
        }

    }

    @Override
    public void avancarPag() {
        if (this.getTotalPaginas() == this.getPaginaAtual()) {
            System.out.println("Impossível avançar");
        } else {
            this.paginaAtual++;
        }
            
    }

    @Override
    public void voltarPag() {
        this.paginaAtual--;
    }
    
}
