package com.bcopstein.endpointsdemo1;

import java.util.LinkedList;
import java.util.List;

public class AcervoMemoriaImpl implements IAcervoRepository{

    private List<Livro> livros;

    public AcervoMemoriaImpl(List<Livro> livro) {
        livros.add(new Livro(68, "J"));
    }
    @Override
    public List<Livro> getAll() {
        return null;
    }
    @Override
    public Livro getPorId(int id) {
        return null;
    }

    @Override
    public List<Livro> getAutor(String autor) {
        return null;
    }

    @Override
    public List<Livro> getTitulo(String titulo) {
        return null;
    }

    @Override
    public List<Livro> getAno(int ano) {
        return null;
    }

    @Override
    public boolean cadastraLivroNovo(Livro livro) {
        return false;
    }

    @Override
    public boolean removeLivro(int id) {
        return false;
    }
}
