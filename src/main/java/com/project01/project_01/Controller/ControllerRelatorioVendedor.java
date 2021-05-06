package com.project01.project_01.Controller;

import com.project01.project_01.Service.ServiceVendedorVenda;
import com.project01.project_01.Service.VendaVendedor.Data_VendaVendedor;
import com.project01.project_01.Service.VendaVendedor.VendaVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/relatorio", produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerRelatorioVendedor {
    private ServiceVendedorVenda vendedorVenda;

    @Autowired

    public ControllerRelatorioVendedor(ServiceVendedorVenda vendedorVenda) {
        this.vendedorVenda = vendedorVenda;
    }

    @GetMapping
    public List<VendaVendedor> lista_VendedorVenda(@RequestBody Data_VendaVendedor dv) throws ParseException {
        return vendedorVenda.relatorio(dv.getDataInicio(), dv.getDataFim());
    }
}
