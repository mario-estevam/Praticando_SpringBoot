package com.example.newproject.DTO;

import com.example.newproject.model.Pedido;
import com.example.newproject.model.StatusPedido;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class RequisicaoNovoPedido {

    @NotBlank(message = "Por favor preencha o campo do nome corretamente")
    private String nomeProduto;
    @NotBlank(message = "Por favor preencha o campo da url do produto corretamente")
    private String urlProduto;
    @NotBlank(message = "Por favor preencha o campo da url da imagem corretamente")
    private String urlImagem;
    @NotBlank(message = "Por favor preencha o campo da data corretamente")
    private String dataEntrega;
   @NotNull(message = "Por favor insira o valor da negociação")
    private Double valorNegociado;
    private String descricao;




    public Double getValorNegociado() {return valorNegociado;}

    public void setValorNegociado(Double valorNegociado) {this.valorNegociado = valorNegociado;}

    public String getDataEntrega() {return dataEntrega;}

    public void setDataEntrega(String dataEntrega) {this.dataEntrega = dataEntrega;}

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
        pedido.setDataEntrega(dataEntrega);
        pedido.setValorNegociado(valorNegociado);
        pedido.setStatus(StatusPedido.AGUARDANDO);
        return pedido;
    }
}
