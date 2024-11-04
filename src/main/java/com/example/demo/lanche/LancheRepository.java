package com.example.demo.lanche;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LancheRepository extends JpaRepository<Lanche, Long> {
    Page<Lanche> findAllByAtivoTrue(Pageable pageable);


}
