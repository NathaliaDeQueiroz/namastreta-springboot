package br.com.fiap.namastreta.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.namastreta.models.Curador;

public interface CuradorRepository extends JpaRepository<Curador, Long> {

    Page<Curador> findByNome(String nome, Pageable pageable);

}
