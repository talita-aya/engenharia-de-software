package main.br.edu.estabelecimento.model;

import java.util.ArrayList;
import java.util.List;

public class Acesso {
    private Setor setor;
    private Categoria categoria;
    private List<Pessoa> pessoaList = new ArrayList<Pessoa>();

    public Acesso (Setor setor, Categoria categoria){
        this.setor = setor;
        this.categoria = categoria;
    }

    public Acesso (Setor setor, Categoria categoria, List<Pessoa> pessoaList){
        this.setor = setor;
        this.categoria = categoria;
        this.pessoaList = pessoaList;
    }

    public void addPessoa(Pessoa pessoa){
        this.pessoaList.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa){
        this.pessoaList.remove(pessoa);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Setor getSetor() {
        return setor;
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }


}
