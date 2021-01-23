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
public class Principal {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .id(1)
                .dataCadastro(LocalDate.of(2021, 2, 2))
                .dataUltimaAtualizacao(LocalDate.of(2021, 2, 2))
                .descricao("PC")
                .estoque(1)
                .categoria("Eletrônicos")
                .modelo("A")
                .preco(12.5)
                .createProduto();
        
        System.out.println(produto.toString());
    }
}
