package com.example.newproject.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private Double valorNegociado;
    private String dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @Enumerated(EnumType.STRING)
    private StatusPedido status;




    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    public StatusPedido getStatus() {
        return status;
    }
    public String getDataEntrega() {
        return dataEntrega;
    }


    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public void setValorNegociado(Double valorNegociado) {this.valorNegociado = valorNegociado;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrlImagem() {
        return urlImagem;
    }
    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
    public Double getValorNegociado() {
        return valorNegociado;
    }
    public void setValorNegociado(double valorNegociado) {
        this.valorNegociado = valorNegociado;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getUrlProduto() {
        return urlProduto;
    }
    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }
}
