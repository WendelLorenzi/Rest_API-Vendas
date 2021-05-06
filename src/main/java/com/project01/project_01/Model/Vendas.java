package com.project01.project_01.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Vendas")
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(nullable = false)
    private float valor;

    // Uma venda é feita por apenas um vendedor e um vendedor pode fazer varias vendas
    @JoinColumn(name = "vendedorID", referencedColumnName = "id")
    private Long vendedor_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Long getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(Long vendedor_id) {
        this.vendedor_id = vendedor_id;
    }
}
