package test.br.edu.estabelecimento.controller;

import main.br.edu.estabelecimento.controller.AcessoController;
import main.br.edu.estabelecimento.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcessoControllerTest {
    private AcessoController acessoController;

    @Before
    public void before(){
        acessoController = new AcessoController(new ArrayList<>());
    }

    @Test
    public void test_cadastrarAcessoCompleto_comSucesso(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();

        //Quando
        boolean resultado = acessoController.cadastrarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_cadastrarAcessoSemSetor_comFalha(){
        //Dado
        Setor setor = null;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();

        //Quando
        boolean resultado = acessoController.cadastrarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);

    }

    @Test
    public void test_cadastrarAcessoSemCategoria_comFalha(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = null;
        Pessoa pessoa = new Gerente();

        //Quando
        boolean resultado = acessoController.cadastrarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_cadastrarAcessoSemPessoa_comFalha(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = null;

        //Quando
        boolean resultado = acessoController.cadastrarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_atualiazarAcessoRemovendoAcesso_comSucesso(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();
        Acesso acesso = new Acesso(setor, categoria, new ArrayList<>(Arrays.asList(pessoa)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_atualiazarAcessoAdicionarAcesso_comSucesso(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();
        Acesso acesso = new Acesso(setor, categoria);
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_atualiazarAcessoNaoExisteAcesso_comSucesso(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_atualiazarAcessoSemSetor_comFalha(){
        //Dado
        Setor setor = null;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = new Gerente();
        Acesso acesso = new Acesso(setor, categoria, new ArrayList<>(Arrays.asList(pessoa)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_atualiazarAcessoSemCategoria_comFalha(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = null;
        Pessoa pessoa = new Gerente();
        Acesso acesso = new Acesso(setor, categoria, new ArrayList<>(Arrays.asList(pessoa)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_atualiazarAcessoSemPessoa_comFalha(){
        //Dado
        Setor setor = Setor.FUNCIONARIO;
        Categoria categoria = Categoria.CADASTRO;
        Pessoa pessoa = null;
        Acesso acesso = new Acesso(setor, categoria, new ArrayList<>(Arrays.asList(pessoa)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));

        //Quando
        boolean resultado = acessoController.atualizarAcesso(setor, categoria, pessoa);

        //Entao
        Assert.assertFalse(resultado);
    }

}
