package com.example.newproject.DTO;

import com.example.newproject.model.Pedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

    @NotBlank(message = "Por favor preencha o campo do nome corretamente")
    private String nomeProduto;
    @NotBlank(message = "Por favor preencha o campo da url do produto corretamente")
    private String urlProduto;
    @NotBlank(message = "Por favor preencha o campo da url da imagem corretamente")
    private String urlImagem;

    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(urlImagem);

        return pedido;
    }
}
