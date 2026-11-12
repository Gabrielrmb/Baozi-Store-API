package com.baozistore.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozistore.baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}