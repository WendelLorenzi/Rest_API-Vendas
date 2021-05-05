package com.project01.project_01.Service;

import com.project01.project_01.Model.Vendedor;
import com.project01.project_01.Repository.RepoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVendedor {

    private RepoVendedor repositorio_vendedor;

    @Autowired

    public ServiceVendedor(RepoVendedor repositorio_vendedor) {
        this.repositorio_vendedor = repositorio_vendedor;
    }


    //POST
    public String Salvar_vendedor(Vendedor v) {
        repositorio_vendedor.save(v);
        return "Vendedor Salvo";
    }


    // *Posteriormente melhorar a mensagem de erro
    public boolean encontra_vendedor(Vendedor v, List<Vendedor> colunm_vendedor) {
        // retorna falso se a coluna não conter vendedores
        if (colunm_vendedor.size() == 0) {
            return false;
        }
        for (Vendedor vv : colunm_vendedor) {
            if (vv.getId().equals(v.getId())) {
                return true;
            }
        }
        // Se não encontrar retorna falso
        return false;
    }

    // GET
    public Object Busca_vendedor(Vendedor v) {
        if (encontra_vendedor(v, repositorio_vendedor.findAll())) {
            return repositorio_vendedor.findById(v.getId());
        }
        return null;
    }

}



