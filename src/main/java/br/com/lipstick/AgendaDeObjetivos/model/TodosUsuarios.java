package br.com.lipstick.AgendaDeObjetivos.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodosUsuarios extends JpaRepository<Usuario, Long> {

    @Query("select o from Usuario o where o.credenciais = : credenciais")
    List<Usuario> usuarioExiste(@Param("credenciais") Credenciais credenciais);
}
