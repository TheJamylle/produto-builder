/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;


public class ProdutoBuilder {

    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private int estoque;
    private String categoria;
    private String urlFoto;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder id(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder codigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, codigoEan, descricao, marca, modelo, preco, dataCadastro, dataUltimaAtualizacao, estoque, categoria, urlFoto);
    }
    
}
