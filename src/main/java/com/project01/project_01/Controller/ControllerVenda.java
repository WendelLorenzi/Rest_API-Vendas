package com.project01.project_01.Controller;

import com.project01.project_01.Model.Vendas;
import com.project01.project_01.Service.ServiceVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class ControllerVenda {
    private ServiceVenda vendaService;

    @Autowired

    public ControllerVenda(ServiceVenda vendaService) {
        this.vendaService = vendaService;
    }

    @PostMapping(path = "/venda")
    public String GeraVenda(@RequestBody Vendas v) {
        return vendaService.Salvar_Venda(v);
    }

    //@GetMapping
    //public List<Object> Busca_vendedor_date()



}
