/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;

/**
 *
 * @author Jamylle
 */
public class Produto {
    private long id;
    private String codigoEan; //código de barras
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private int estoque = 0;
    private String categoria;
    private String urlFoto;

    Produto(long id, String codigoEan, String descricao, String marca, String modelo, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, int estoque, String categoria, String urlFoto) {
        this.id = id;
        this.codigoEan = codigoEan;
        this.descricao = descricao;
        if(marca == null) {
            throw new Error("Marca é um campo obrigatório");
        }
        this.marca = marca;
        this.modelo = modelo;
        if(preco < 0) {
            throw new Error("Preço do produto não pode ser menor que 0");
        }
        this.preco = preco;
        if(dataCadastro.isBefore(LocalDate.now())){
            throw new Error("Data de cadastro e de atualização não podem ser menor que data atual");
        } else {
            this.dataCadastro = dataCadastro;
            if((dataUltimaAtualizacao.isBefore(dataCadastro))) {
                throw new Error("Data de atualização não pode ser menor que data de cadastro");
            }
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }
        if(estoque < 0) {
            throw new Error("Quantidade de Estoque não pode ser menor que 0");
        }
        this.estoque = estoque;
        this.categoria = categoria;
        this.urlFoto = urlFoto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codigoEan=" + codigoEan + ", descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", dataCadastro=" + dataCadastro + ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", estoque=" + estoque + ", categoria=" + categoria + ", urlFoto=" + urlFoto + '}';
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
