package com.project01.project_01.Service.VendaVendedor;

public class VendaVendedor {
    private String nome;
    private int total_vendas;
    private double vendas_diaria;

    public VendaVendedor(String nome, int total_vendas, double vendas_diaria) {
        this.nome = nome;
        this.total_vendas = total_vendas;
        this.vendas_diaria = vendas_diaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotal_vendas() {
        return total_vendas;
    }

    public void setTotal_vendas(int total_vendas) {
        this.total_vendas = total_vendas;
    }

    public double getVendas_diaria() {
        return vendas_diaria;
    }

    public void setVendas_diaria(double vendas_diaria) {
        this.vendas_diaria = vendas_diaria;
    }
}
