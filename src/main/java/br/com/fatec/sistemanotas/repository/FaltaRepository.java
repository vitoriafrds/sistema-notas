package br.com.fatec.sistemanotas.repository;

import br.com.fatec.sistemanotas.entity.Falta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, String> {
}
