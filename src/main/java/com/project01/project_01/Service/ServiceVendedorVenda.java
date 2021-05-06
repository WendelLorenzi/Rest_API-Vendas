package com.project01.project_01.Service;

import com.project01.project_01.Model.Vendas;
import com.project01.project_01.Model.Vendedor;
import com.project01.project_01.Repository.RepoVendas;
import com.project01.project_01.Repository.RepoVendedor;
import com.project01.project_01.Service.VendaVendedor.VendaVendedor;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ServiceVendedorVenda {

    RepoVendas vendas_repository;
    RepoVendedor vendedor_repository;


    public List<VendaVendedor> relatorio(Date inicio, Date fim) throws ParseException {
        List<VendaVendedor> vendasVendedor= new ArrayList<VendaVendedor>();
        long diasPassados= ContaDias(inicio, fim);
        // Busca as vendas feitas durante o periodo passado por paramentro
        List<Vendas> vendasRel= vendas_repository.buscaVendas(inicio, fim);

        //Busca todos os vendedores
        List<Vendedor> vend= vendedor_repository.findAll();

        for(int i=1; i < vendasRel.size(); i++){
            int contador=0;
            for(int ii=1; ii< vend.size(); ii++){
                // Se o Vendas(vendedor_id) for igual o Vendedor(id)
                if((vendasRel.get(ii).getVendedor_id()).equals(vend.get(i).getId())){
                    contador++;
                }
            }
            VendaVendedor vv= new VendaVendedor(vend.get(i).getNome(), contador, mediaVendas_dia(diasPassados, contador));
            vendasVendedor.add(vv);
        }
        return  vendasVendedor;
    }

    public double mediaVendas_dia(long dias, int QtdVendas){
        return QtdVendas/dias;
    }

    public long ContaDias(Date inicio, Date Fim) throws ParseException {
        DateFormat dataformat = new SimpleDateFormat("yyyy/MM/dd");
        Date d1= dataformat.parse(inicio.toString());
        Date d2= dataformat.parse(Fim.toString());
        // Diferenca em milissegundos
        long tempo= (d2.getTime() - d1.getTime());
        // Um dia tem 86400000 milisegundos
        return (tempo/86400000L);
    }
}

