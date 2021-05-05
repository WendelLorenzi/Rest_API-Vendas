package com.project01.project_01.Repository;

import com.project01.project_01.Model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui é onde se faz as cosultas no banco de dados

public interface RepoVendas extends JpaRepository<Vendas, Long> {

}
