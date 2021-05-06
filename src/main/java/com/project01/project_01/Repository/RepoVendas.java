package com.project01.project_01.Repository;

import com.project01.project_01.Model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface RepoVendas extends JpaRepository<Vendas, Long> {
    @Query(value= "SELECT * FROM vendas WHERE data BETWEEN ?1 AND ?2", nativeQuery = true)
    List<Vendas> buscaVendas(Date inicio, Date fim);
}
