package com.project01.project_01.Service;

import com.project01.project_01.Model.Vendas;
import com.project01.project_01.Repository.RepoVendas;
import com.project01.project_01.Repository.RepoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ServiceVenda {

    private RepoVendas Repositorio_vendas;
    private ServiceVendedor Vendedor_service;
    private RepoVendedor Repositorio_vendedor;

    @Autowired
    public ServiceVenda(RepoVendas repositorio_vendas, ServiceVendedor vendedor_service, RepoVendedor repositorio_vendedor) {
        Repositorio_vendas = repositorio_vendas;
        Vendedor_service = vendedor_service;
        Repositorio_vendedor = repositorio_vendedor;
    }


    //POST
    public String Salvar_Venda(Vendas vendafeita){
        //Verifica se o vendedor existe
        if (Vendedor_service.encontra_vendedor(vendafeita.getVendedor_id(), Repositorio_vendedor.findAll())){

            Repositorio_vendas.save(vendafeita);
            return "Salvo";
        } else return "Vendedor não cadastrado";
    }

}

