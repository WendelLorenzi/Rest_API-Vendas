package com.project01.project_01.Controller;

import com.project01.project_01.Model.Vendedor;
import com.project01.project_01.Repository.RepoVendedor;
import com.project01.project_01.Service.ServiceVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerVendedor {

    private final ServiceVendedor vendedor_service;
    private final RepoVendedor repository_vendedor;

    @Autowired

    public ControllerVendedor(ServiceVendedor vendedor_service, RepoVendedor repository_vendedor) {
        this.vendedor_service = vendedor_service;
        this.repository_vendedor = repository_vendedor;
    }

    @PostMapping(path = "/vendedor")
    public String CadastraVendedor(@RequestBody Vendedor v){
        return vendedor_service.Salvar_vendedor(v);
    }


    @GetMapping(path = "/vendedor")
    public List<Vendedor> Listar_Vendedor(){
        return repository_vendedor.findAll();
    }
}
