package com.project01.project_01.Controller;

import com.project01.project_01.Model.Vendas;
import com.project01.project_01.Repository.RepoVendas;
import com.project01.project_01.Service.ServiceVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/venda")
public class ControllerVenda {
    private ServiceVenda vendaServicecontroller;
    private RepoVendas repositorio_vendas;

    @Autowired

    public ControllerVenda(ServiceVenda vendaService, RepoVendas repositorio_vendas) {
        this.vendaServicecontroller = vendaService;
        this.repositorio_vendas = repositorio_vendas;
    }

    @PostMapping
    public String GeraVenda(@RequestBody Vendas venda) {
        return vendaServicecontroller.Salvar_Venda(venda);
    }

    @GetMapping
    public List<Vendas> listar_vendas() {
        return repositorio_vendas.findAll();
    }



}
