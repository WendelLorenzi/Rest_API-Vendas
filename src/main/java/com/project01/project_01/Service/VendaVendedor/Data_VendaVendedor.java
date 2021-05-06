package com.project01.project_01.Service.VendaVendedor;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


public class Data_VendaVendedor {
        private Date dataInicio;
        private Date dataFim;
        @Autowired
        public Data_VendaVendedor(Date dataInicio, Date dataFim) {
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
        }

        public Date getDataInicio() {
            return dataInicio;
        }

        public Date getDataFim() {
            return dataFim;
        }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
