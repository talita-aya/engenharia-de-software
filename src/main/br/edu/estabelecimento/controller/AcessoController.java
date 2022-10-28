package main.br.edu.estabelecimento.controller;

import main.br.edu.estabelecimento.model.Acesso;
import main.br.edu.estabelecimento.model.Categoria;
import main.br.edu.estabelecimento.model.Pessoa;
import main.br.edu.estabelecimento.model.Setor;

import java.util.ArrayList;
import java.util.List;


public class AcessoController {
    private List<Acesso> acessoList = new ArrayList<Acesso>();

    public AcessoController (List<Acesso> acessoList){
        this.acessoList = acessoList;
    }

    public boolean cadastrarAcesso(Setor setor, Categoria categoria, Pessoa pessoa){
        if ((categoria == null) || (setor == null) || (pessoa == null)) {
            System.out.println("Erro de cadastro!");
            return false;
        }
        Acesso acesso = consultarAcesso(setor, categoria);
        if (acesso == null) {
            acesso = new Acesso(setor, categoria);
        }
        acesso.addPessoa(pessoa);
        this.acessoList.add(acesso);
        return true;
    }

    public boolean atualizarAcesso(Setor setor, Categoria categoria, Pessoa pessoa){
        if ((categoria == null) || (setor == null) || (pessoa == null)) {
            System.out.println("Erro de atualizacao!");
            return false;
        }
        Acesso acessoVerificado = consultarAcesso(setor, categoria);
        if (acessoVerificado == null){
            System.out.println("Nao existe esse Acesso");
            return false;
        }
        if(acessoVerificado.getPessoaList().contains(pessoa)){
            acessoVerificado.getPessoaList().remove(pessoa);
            return true;
        }

        return cadastrarAcesso(setor, categoria, pessoa);
    }

    public Acesso consultarAcesso(Setor setor, Categoria categoria){
        return this.acessoList.stream()
                .filter(acesso -> acesso. getCategoria().equals(categoria) && acesso.getSetor().equals(setor))
                .findFirst()
                .orElse(null);
    }

    public int quantidadeAcessoCriado(){
        return acessoList.size();
    }
}
