/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.usuario;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 *
 * @author guilh
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Page<Usuario> findAllByAtivoTrue(Pageable pageable);

    Optional<Usuario> findByEmail(String email);
}
