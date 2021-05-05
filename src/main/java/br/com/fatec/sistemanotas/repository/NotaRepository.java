package br.com.fatec.sistemanotas.repository;

import br.com.fatec.sistemanotas.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota, String> {
}
