package com.geradorcpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geradorcpf.model.Cpf;

@Repository
public interface CpfRepository extends JpaRepository<Cpf, Long>{

}
