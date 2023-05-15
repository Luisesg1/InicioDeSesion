package com.registro.usuarios.repositorio;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, UUID> {

    public Usuario findByEmail(String email);

    @Modifying
    @Query("update Usuario u set u.lastLogin = :fecha where u.email = :email")
    public void actualizarUltimoIngreso(String email, LocalDateTime fecha);
}


