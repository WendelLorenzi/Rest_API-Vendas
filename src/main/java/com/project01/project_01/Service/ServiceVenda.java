package com.project01.project_01.Service;

import com.project01.project_01.Model.Vendas;
import com.project01.project_01.Repository.RepoVendas;
import com.project01.project_01.Repository.RepoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceVenda {

    private RepoVendas Repositorio_vendas;
    private ServiceVendedor s;
    private RepoVendedor rv;

    @Autowired
    public ServiceVenda(RepoVendas repositorio_vendas) {
        Repositorio_vendas = repositorio_vendas;
    }


    //POST
    public String Salvar_Venda(Vendas v){
        //Verifica se o vendedor existe
        if (s.encontra_vendedor(v.getVendedor(), rv.findAll())){
            Repositorio_vendas.save(v);
            return "Salvo";
        } else return "Erro";
    }

    //GET
    public Object Busca_venda(Long id){
        return Repositorio_vendas.findById(id);
    }


}
