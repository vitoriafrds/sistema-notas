package br.com.fatec.sistemanotas.repository;

import br.com.fatec.sistemanotas.entity.Nota;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota, String> {

  @Modifying
  @Transactional
  @Query(value = "UPDATE NOTA SET NOTA_2 = ?2 WHERE RA_ALUNO = ?1", nativeQuery = true)
  int registrarNota(String raAluno, double nota);
}
